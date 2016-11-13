<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html style="overflow-x:hidden">

  <head>
    <base href="<%=basePath%>">

    <title>账户充值</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="${resourceRoot}/member/css/general.css">
<%@include file="/commons/member/jsp/member_common.jsp"%>
	<script type="text/javascript">
	var billno = '${billno}';
	</script>
  </head>

  <body>
  <div class="switch-body-wrap">
		<div class="progress-body-item progress-body-step1">
			<div class="sheet-mod">
				<div class="sheet-content mt10">
				<form id="payForm" action="${ctx}/pay/doPayCenterData" method="post" target="_blank">
					<table class="mt20 s14">
						<tr>
							<td width="160" class="pr20 ar gray-dark">会员账号</td>
							<td>${user.userName }</td>
						</tr>
						<tr>
							<td class="pr20 ar gray-dark">总账户余额</td>
							<td><span class="red">${webuser.userMoney }</span></td>
							</td>
						</tr>
						<tr>
							<td class="pr20 ar gray-dark"><label for="rechargeAmount">充值金额</label>
							</td>
							<td class="s12">
							<input type="text" size="10" class="write b red" id="money" name="money" onKeyUp="clearNoNum(this);" />
								<span class="pl10 s12 gray">单笔支付（${thirdPay.thirdMinEdu } ~ ${thirdPay.thirdMaxEdu }）元！</span>
							</td>
						</tr>
						<tr>
							<td width="160" class="pr20 ar gray-dark">支付卡类型：</td>
							<td>
								<select id="bank_code" name="bank_code"  class="dropmenu w150" >
									<option value="">-请选择-</option>
									<option value="ABC">农业银行</option>
									<option value="ICBC">工商银行</option>
									<option value="CCB">建设银行</option>
									<option value="BCOM">交通银行</option>
									<option value="CMB">招商银行</option>
									<option value="SPDB">浦发银行</option>
									<option value="CMBC">民生银行</option>
									<option value="CIB">兴业银行</option>
									<option value="GDB">广发银行</option>
									<option value="CEB">光大银行</option>
									<option value="CNCB">中信银行</option>
									<option value="HXB">华夏银行</option>

									<option value="PSBC">邮储银行</option>
									<option value="PAB">平安银行</option>
								</select>
							</td>
						</tr>
						<tr>
							<td></td>
							<td>
								<input type="button" class="button button-raised button-primary button-small"
									onclick="return SubInfoForOnlinePay(this.form);" value="充值"/>
						</td>
						</tr>
					</table>
					<input type="hidden" name="thirdMinEdu" id="thirdMinEdu" value=${thirdPay.thirdMinEdu } >
					<input type="hidden" name="thirdMaxEdu"  id="thirdMaxEdu" value=${thirdPay.thirdMaxEdu }  >
					<input type="hidden" name="domain" value="<%=basePath%>"/>
					<input type="hidden" name="billno" value="${billno }"/>
					<input type="hidden" name="payType" value="${thirdPay.thirdType }"/>
					<input type="hidden" name="key" value="${thirdPay.thirdKey }"/>
					<input type="hidden" name="pay_url" value="${thirdPay.thirdUrl}/payhc/payCenter_payHandleCenter.action"/>
					</form>
				</div>
			</div>
			<!-- /sheet -->
		</div>
		<div class="progress-body-item progress-body-step2"></div>
		<!-- /item -->
	</div>

  </body>
</html>
