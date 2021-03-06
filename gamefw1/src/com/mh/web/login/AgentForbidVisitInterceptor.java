package com.mh.web.login;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.mh.commons.conf.CommonConstant;
import com.mh.web.servlet.MySessionContext;

/**
 * 系统URL权限过滤类，用于判断当前用户是否登入，是否有相应的权限，没有权限则抛出异常，跳转到禁止访问页面
 * 类描述: TODO<br/> 
 * 修改人: alex<br/>
 * 修改时间: 2015-6-25 上午9:56:59<br/>
 */
@Component("agentForbidVisitInterceptor")
public class AgentForbidVisitInterceptor extends HandlerInterceptorAdapter {

	private static final Logger logger = LoggerFactory.getLogger(AgentForbidVisitInterceptor.class);
	
	private static List<String> visitList = new ArrayList<String>();
	static{
		visitList.add("");
		visitList.add("/agent/login");
		visitList.add("/agent/index");
		visitList.add("/agent/userAuth");
		visitList.add("/agent/submitLogin");
		visitList.add("/agent/loginAuth");
		
	}
	
 

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String uri = request.getRequestURI().substring(request.getContextPath().length());
		String loginUrl = this.getWebDomain(request)+"agent/index";
		
		if(visitList.contains(uri)){
			//count.cgi 漏洞 解决
			//if(this.hasCountCgiError(request))
			//	throw new NotLoginException("用户未登入");
		}else{
			HttpSession session = request.getSession();
			UserContext uc = null;
			//豁免地址进入
			if (session.isNew()) {
				String jsessionid = (String) request.getParameter("jsessionid");
				if (StringUtils.isNotBlank(jsessionid)) {
					session = MySessionContext.getSession(jsessionid);
					uc = (UserContext) session.getAttribute(CommonConstant.USER_AGENT_CONTEXT_KEY);
				}
			 
				if(uc == null){
					response.getWriter().write("<script>window.top.location='"+loginUrl+"'</script>");
					return false;
				}
			//普通地址进入
			} else {
				session = MySessionContext.getSession(request.getSession().getId());
				if(session==null){
					response.getWriter().write("<script>window.top.location='"+loginUrl+"'</script>");
					return false;
				}
				
				uc = (UserContext) session.getAttribute(CommonConstant.USER_AGENT_CONTEXT_KEY);
				//未登入或登入超时
				if (null == uc || uc.getUserId() == null) {					
					response.getWriter().write("<script>window.top.location='"+loginUrl+"'</script>");
					return false;
				}
			}
			try {
				//绑定Session中用户信息到ThreadLocal
			 
				UserContextHolder.set(uc);
			} catch (RuntimeException e) {
				e.printStackTrace();
				logger.error("绑定Session中用户信息到ThreadLocal 出现异常: "+ e.getMessage(), e);
			}
		}

		return super.preHandle(request, response, handler);
	}
	
	
	public static boolean hasVisit(List<String> list,String uri) {
		 
		if (list == null || list.size() < 1)
			return false;
		for (String value : list) {
 
			if (uri.startsWith(value)) {
				return true;
			}
		}
		return false;
	}
	
	
	
 
	
	private String getWebDomain(HttpServletRequest request) {
		String path = request.getContextPath();
		String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
		if (basePath.endsWith(":80/")) {
			basePath = basePath.substring(0, basePath.indexOf(":80/")) + "/";
		}
		return basePath;
	}
	
	
	
	
 
}
