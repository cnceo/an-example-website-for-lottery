<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html style="overflow-x:hidden">
	<head>
		<title>皇冠體育</title>
		<%@ include file="/commons/sport/jsp/sport_common.jsp"%>

	</head>
<body id="MFT" class="bodyset FTRE" >
<div id="refresh_right" style="position: absolute; top: 39px; left: 700px;"
		class="refresh_M_btn"
		onclick="this.className='refresh_M_on';javascript:refreshReload()">
		<span>刷新</span>
	</div>
<table border="0" cellpadding="0" cellspacing="0" id="myTable"><tbody><tr><td>
 <table border="0" cellpadding="0" cellspacing="0" id="box">
      <tbody>
      <tr>
        <td class="top rmf_text"><h1><em class="rmf_left">${title }</em>
        </td>
      </tr>
      <tr>
        <td class="mem"><h2>
            <table width="100%" border="0" cellpadding="0" cellspacing="0" id="fav_bar">
              <tbody><tr>
                <td id="page_no" align="left">
                	<span id="pg_txt">1 / 1 页&nbsp;&nbsp; <select disabled=""><option value="0" selected="">1</option></select></span>
                </td>
                <td id="tool_td">

                  <table border="0" cellspacing="0" cellpadding="0" class="tool_box">
                    <tbody><tr>
                        <td class="refresh_btn" id="refresh_btn">
							<!--秒数更新-->
							<div onclick="reload()">
								<font id="refreshTime"></font>
							</div>
						</td>
                        <td class="leg_btn"><div onclick="javascript:chg_league();" id="sel_league">选择联赛 (<span id="str_num">全部</span>)</div></td>
                        <td id="SortGame" class="SortGame">
						<select id="SortSel">
							 <option value="C" selected="selected">按联盟排序</option>
							 <option value="T">按时间排序</option>
						</select>
						</td>
						<td class="OrderType" id="Ordertype">
						<select id="myoddType">
							<option value="H" selected="selected">香港盘</option>
						</select>
						</td>
                     </tr>
                  </tbody>
                  </table>
                </td>
              </tr>
            </tbody></table>
          </h2>
        <!--     资料显示的layer     -->
		<div id="showtable">
	        <table id="game_table" cellspacing="0" cellpadding="0" class="game">
	          <tbody>
	          <tr>
              <th class="time">时间</th>
              <th class="team">赛事</th>
              <th class="h_1x2">独赢</th>
              <th class="h_r">让分</th>
              <th class="h_ou">大小</th>
              <th class="h_oe">单/双</th>
              <th class="h_1x2">独赢</th>
              <th class="h_r">前5局 - 让分</th>
              <th class="h_ou">前5局 - 大小</th>
              </tr>
	          <tr>
	          	<td colspan="20" class="no_game">您选择的项目暂时没有赛事。请修改您的选项或迟些再返回。</td>
	 		  </tr>
	 		  </tbody>
	 		  </table>
		</div>
        </tr>
        <tr>
            <td id="foot"><b>&nbsp;</b></td>
        </tr>
        </tbody>
   </table>

   <!--下方刷新钮-->
				<div id="refresh_down" class="refresh_M_btn" onClick="this.className='refresh_M_on';refreshReload()"><span>刷新</span> </div>

</td></tr></tbody></table>


<!-- 选择联赛 -->
<%@ include file="league.jsp"%>
<script type="text/javascript">
	function openXieYi(){
	document.getElementById("abc").style.display="block";
	$.layer({
	    type: 1,
	    shade: [0],
	    area: ['650px', 'auto'],
	    title: false,
	    border: [10, 1, '#493721'],
	    closeBtn: [0, false], //去掉默认关闭按钮
	    offset: ['90px', '10px'],
	    page: {dom : '.layer_notice'}
	});
	}

</script>
<script type="text/javascript">
	var interval;
	var secs=90;
	function refreshReload() {

		document.getElementById("refresh_right").className = 'refresh_M_on';
		document.getElementById("refresh_btn").className = 'refresh_on';
		document.getElementById("refresh_down").className = 'refresh_M_on';
		clearInterval(interval);
		secs = 90;
		Load();
		setTimeout(function() {
			document.getElementById("refresh_right").className = 'refresh_M_btn';
			document.getElementById("refresh_btn").className = 'refresh_btn';
			document.getElementById("refresh_down").className = 'refresh_M_btn';

		}, 2000);  //5秒后将会调用执行remind()函数
	}
	function Load() {
		clearTimeout(interval);    //清除延时程序
		interval = setInterval(function() {
			if(secs<0){
				secs = 90;
				refreshReload();
				return;
			}
			document.getElementById('refreshTime').innerHTML = '' + secs;
			secs--;
		}, 1000);
	}

</script>
<script type="text/javascript">
	Load();
</script>
</body>
</html>