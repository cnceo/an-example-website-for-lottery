<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="overflow-x:hidden">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>webcom</title>
<%@include file="/commons/cp/jsp/cp_common.jsp"%>
</head>
<body id="HOP" ondragstart="window.event.returnValue=false" onselectstart="event.returnValue=false" oncontextmenu="window.event.returnValue=false">
	<noscript>
		<iframe src="*.htm" style="display:none"></iframe>
	</noscript>
	<div class="wrapCss_002">
		<table width="100%" class="tab_001" border="0" cellspacing="0" cellpadding="0">
			<tbody>
				<tr style='background: url("${resourceRoot}/cp/images/title_bg_004.gif") repeat-x left top;'>
					<td><span class="font_sty001"><strong>正4特下注</strong> </span></td>
					<%@include file="/commons/cp/jsp/hk6_results.jsp" %>
				</tr>
			</tbody>
		</table>

		<table class="game_table" border="0" cellspacing="1" cellpadding="0">
			<tbody>

				<tr class="tbtitle">
					<td height="25" align="left" id="time_td" colspan="15">
							<font>当前期数：<font class="colorDate"><b>${results.nextQs}</b></font>
							期&nbsp;&nbsp;&nbsp;&nbsp;下注金额：<span id="allgold">0</span>&nbsp;&nbsp;&nbsp;&nbsp;</font>
							<span class="STYLE1">距离封盘时间：</span> <font><strong><span
								id="span_dt_dt"><font color="#7aff00"><b>-</b>0</font> 分
									<font color="#7aff00"><b>0</b> </font> 秒</span> </strong></font>
									<script language="javascript">
										gametimeRef("${results.nextKjsj}",'span_dt_dt');
									</script>
					</td>
				</tr>
				<tr class="tbtitle">
					<td id="time_tm" nowrap="nowrap" colspan="15">
						<button class="button_a" onclick="javascript:location.href='${ctx}/cp/goList?gameTypeCode=HK6&cpTypeCode=TM&cpZuTypeCode=z1t';">
							<img width="16" height="16" align="absmiddle" src="${resourceRoot}/cp/images/add.gif?=594">正1特
						</button>
						<button class="button_a" onclick="javascript:location.href='${ctx}/cp/goList?gameTypeCode=HK6&cpTypeCode=ZMT&cpZuTypeCode=z2t';">
							<img width="16" height="16" align="absmiddle" src="${resourceRoot}/cp/images/add.gif?=594">正2特
						</button>
						<button class="button_a" onclick="javascript:location.href='${ctx}/cp/goList?gameTypeCode=HK6&cpTypeCode=ZMT&cpZuTypeCode=z3t';">
							<img width="16" height="16" align="absmiddle" src="${resourceRoot}/cp/images/add.gif?=594">正3特
						</button>
						<button class="button_b" onclick="javascript:location.href='${ctx}/cp/goList?gameTypeCode=HK6&cpTypeCode=ZMT&cpZuTypeCode=z4t';">
							<img width="16" height="16" align="absmiddle" src="${resourceRoot}/cp/images/add.gif?=594">正4特
						</button>
						<button class="button_a" onclick="javascript:location.href='${ctx}/cp/goList?gameTypeCode=HK6&cpTypeCode=ZMT&cpZuTypeCode=z5t';">
							<img width="16" height="16" align="absmiddle" src="${resourceRoot}/cp/images/add.gif?=594">正5特
						</button>
						<button class="button_a" onclick="javascript:location.href='${ctx}/cp/goList?gameTypeCode=HK6&cpTypeCode=ZMT&cpZuTypeCode=z6t';">
							<img width="16" height="16" align="absmiddle" src="${resourceRoot}/cp/images/add.gif?=594">正6特
						</button></td>
				</tr>

				<form name="order_form" id="order_form" action="${ctx}/order/goList?code=${results.gameTypeCode}" method="post" target="bet_order_frame" autocomplete="off">
				<tr class="tbtitle2">
					<td>号码</td>
					<td>赔率</td>
					<td>金额</td>
					<td>号码</td>
					<td>赔率</td>
					<td>金额</td>
					<td>号码</td>
					<td>赔率</td>
					<td>金额</td>
					<td>号码</td>
					<td>赔率</td>
					<td>金额</td>
					<td>号码</td>
					<td>赔率</td>
					<td>金额</td>
				</tr>
				<tr class="tbtitle">
					<td class="ball_r" id="hm01">01</td>
					<td class="ball_ff"><span id="bl_216" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_216" class="input1" id="SP01" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>

					<td class="ball_g" id="hm11">11</td>
					<td class="ball_ff"><span id="bl_217" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_217" class="input1" id="SP11" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>

					<td class="ball_g" id="hm21">21</td>
					<td class="ball_ff"><span id="bl_218" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_218" class="input1" id="SP21" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>

					<td class="ball_b" id="hm31">31</td>
					<td class="ball_ff"><span id="bl_219" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_219" class="input1" id="SP31" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>

					<td class="ball_b" id="hm41">41</td>
					<td class="ball_ff"><span id="bl_220" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_220" class="input1" id="SP41" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>

				</tr>
				<tr class="tbtitle">
					<td align="center" class="ball_r" id="hm02">02</td>
					<td align="center" class="ball_ff" valign="middle"><span id="bl_221" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_221" class="input1" id="SP02" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>

					<td align="center" class="ball_r" id="hm12">12</td>
					<td class="ball_ff"><span id="bl_222" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_222" class="input1" id="SP12" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>

					<td class="ball_g" id="hm22">22</td>
					<td class="ball_ff"><span id="bl_223" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_223" class="input1" id="SP22" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_g" id="hm32">32</td>
					<td class="ball_ff"><span id="bl_224" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_224" class="input1" id="SP32" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_b" id="hm42">42</td>
					<td class="ball_ff"><span id="bl_225" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_225" class="input1" id="SP42" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
				</tr>
				<tr class="tbtitle">
					<td class="ball_b" id="hm03">03</td>
					<td align="center" class="ball_ff" valign="middle"><span id="bl_226" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_226" class="input1" id="SP03" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td align="center" class="ball_r" id="hm13">13</td>
					<td class="ball_ff"><span id="bl_227" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_227" class="input1" id="SP13" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td align="center" class="ball_r" id="hm23">23</td>
					<td class="ball_ff"><span id="bl_228" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_228" class="input1" id="SP23" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_g" id="hm33">33</td>
					<td class="ball_ff"><span id="bl_229" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_229" class="input1" id="SP33" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_g" id="hm43">43</td>
					<td class="ball_ff"><span id="bl_230" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_230" class="input1" id="SP43" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
				</tr>
				<tr class="tbtitle">
					<td class="ball_b" id="hm04">04</td>
					<td align="center" class="ball_ff" valign="middle"><span id="bl_231" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_231" class="input1" id="SP04" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_b" id="hm14">14</td>
					<td class="ball_ff"><span id="bl_232" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_232" class="input1" id="SP14" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td align="center" class="ball_r" id="hm24">24</td>
					<td class="ball_ff"><span id="bl_233" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_233" class="input1" id="SP24" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td align="center" class="ball_r" id="hm34">34</td>
					<td class="ball_ff"><span id="bl_234" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_234" class="input1" id="SP34" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_g" id="hm44">44</td>
					<td class="ball_ff"><span id="bl_235" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_235" class="input1" id="SP44" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
				</tr>
				<tr class="tbtitle">
					<td class="ball_g" id="hm05">05</td>
					<td align="center" class="ball_ff" valign="middle"><span id="bl_236" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_236" class="input1" id="SP05" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_b" id="hm15">15</td>
					<td class="ball_ff"><span id="bl_237" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_237" class="input1" id="SP15" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_b" id="hm25">25</td>
					<td class="ball_ff"><span id="bl_238" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_238" class="input1" id="SP25" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td align="center" class="ball_r" id="hm35">35</td>
					<td class="ball_ff"><span id="bl_239" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_239" class="input1" id="SP35" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td align="center" class="ball_r" id="hm45">45</td>
					<td class="ball_ff"><span id="bl_240" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_240" class="input1" id="SP45" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
				</tr>
				<tr class="tbtitle">
					<td class="ball_g" id="hm06">06</td>
					<td align="center" class="ball_ff" valign="middle"><span id="bl_241" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_241" class="input1" id="SP06" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_g" id="hm16">16</td>
					<td class="ball_ff"><span id="bl_242" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_242" class="input1" id="SP16" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_b" id="hm26">26</td>
					<td class="ball_ff"><span id="bl_243" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_243" class="input1" id="SP26" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_b" id="hm36">36</td>
					<td class="ball_ff"><span id="bl_244" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_244" class="input1" id="SP36" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td align="center" class="ball_r" id="hm46">46</td>
					<td class="ball_ff"><span id="bl_245" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_245" class="input1" id="SP46" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
				</tr>
				<tr class="tbtitle">
					<td align="center" class="ball_r" id="hm07">07</td>
					<td align="center" class="ball_ff" valign="middle"><span id="bl_246" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_246" class="input1" id="SP07" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_g" id="hm17">17</td>
					<td class="ball_ff"><span id="bl_247" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_247" class="input1" id="SP17" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_g" id="hm27">27</td>
					<td class="ball_ff"><span id="bl_248" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_248" class="input1" id="SP27" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_b" id="hm37">37</td>
					<td class="ball_ff"><span id="bl_249" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_249" class="input1" id="SP37" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_b" id="hm47">47</td>
					<td class="ball_ff"><span id="bl_250" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_250" class="input1" id="SP47" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
				</tr>
				<tr class="tbtitle">
					<td align="center" class="ball_r" id="hm08">08</td>
					<td align="center" class="ball_ff" valign="middle"><span id="bl_251" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_251" class="input1" id="SP08" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td align="center" class="ball_r" id="hm18">18</td>
					<td class="ball_ff"><span id="bl_252" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_252" class="input1" id="SP18" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_g" id="hm28">28</td>
					<td class="ball_ff"><span id="bl_253" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_253" class="input1" id="SP28" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_g" id="hm38">38</td>
					<td class="ball_ff"><span id="bl_254" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_254" class="input1" id="SP38" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_b" id="hm48">48</td>
					<td class="ball_ff"><span id="bl_255" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_255" class="input1" id="SP48" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
				</tr>
				<tr class="tbtitle">
					<td class="ball_b" id="hm09">09</td>
					<td align="center" class="ball_ff" valign="middle"><span id="bl_256" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_256" class="input1" id="SP09" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td align="center" class="ball_r" id="hm19">19</td>
					<td class="ball_ff"><span id="bl_257" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_257" class="input1" id="SP19" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td align="center" class="ball_r" id="hm29">29</td>
					<td class="ball_ff"><span id="bl_258" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_258" class="input1" id="SP29" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_g" id="hm39">39</td>
					<td class="ball_ff"><span id="bl_259" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_259" class="input1" id="SP39" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_g" id="hm49">49</td>
					<td class="ball_ff"><span id="bl_260" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_260" class="input1" id="SP49" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
				</tr>
				<tr class="tbtitle">
					<td class="ball_b" id="hm10">10</td>
					<td align="center" class="ball_ff" valign="middle"><span id="bl_261" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_261" class="input1" id="SP10" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_b" id="hm20">20</td>
					<td class="ball_ff"><span id="bl_262" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_262" class="input1" id="SP20" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td align="center" class="ball_r" id="hm30">30</td>
					<td class="ball_ff"><span id="bl_263" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_263" class="input1" id="SP30" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td align="center" class="ball_r" id="hm40">40</td>
					<td class="ball_ff"><span id="bl_264" rate="true">42</span>
					</td>
					<td class="ball_ff"><input name="Num_264" class="input1" id="SP40" onkeydown="return Yh_Text.CheckNumber2()" onblur="CheckInput(this)" type="text" size="4">
					</td>
					<td class="ball_ff" colspan="3">&nbsp;</td>
				</tr>
				<tr class="hset2">
					<td class="tbtitle" colspan="15"><input name="btnSubmit" class="button_a" id="btnSubmit" onclick="return ChkSubmit();" type="submit" value="下注"> &nbsp;&nbsp; <input name="Submit3" class="button_a" onclick="ClearData()" type="button"
						value="重设">
					</td>
				</tr>
			</form>
			</tbody>
		</table>

		<%@include file="/commons/cp/jsp/cp_hk6_right.jsp"%>
	</div>
	<script type="text/javascript">
		var cp_gameTypeCode_temp="${results.gameTypeCode}";
		var cp_typeCode_temp="ZMT";
		var cp_cateCode_temp="Z4T";
		var cp_xzlxCode_temp="";

	</script>
	<%@include file="/commons/cp/jsp/cp_fast_set_footer.jsp" %>
</body>
</html>