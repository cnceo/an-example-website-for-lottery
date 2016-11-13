<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html style="overflow-x:hidden" xmlns="http://www.w3.org/1999/xhtml"><head>
    <meta name="Robots" contect="none">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <title>Sportsbook Rules</title>
   <link rel="stylesheet" href="${resourceRoot}/sport/css/mem_qa.css" type="text/css">
    <link rel="stylesheet" href="${resourceRoot}/sport/css/mem_qa_roul.css" type="text/css">
    <script language="javascript" src="${resourceRoot}/sport/js/QA_sport.js"></script>
</head>
<body id="SPORT" onselectstart="self.event.returnValue=false" oncontextmenu="self.event.returnValue=false;window.event.returnValue=false;">
<div class="qa_head"><em>帮助</em><span class="close_box" onclick="window.close();">关闭</span></div>
<div id="wrapper">

        <div id="qa_nav">
       <%@ include file="top1.jsp"%>
    </div>

    <div id="main">
        <a name="top"></a>
        <h1>选择体育项目 :
		<%@ include file="top2.jsp"%>
        </h1>
        <div id="info"><!--资料区-->
            <p class="b sub">连串过关/复式过关/组合过关</p>
            <p class="b sub">1. 示意</p>
            <p>连串过关是指选择二个或更多的赛事在一个单一的注单中。每一个选择连串投注的赛事必须获胜此连串的注单才视为获胜。如果第一个注单是获胜的，投注获胜的注单会添加到第二个投注选项，直到连串过关中的所有投注获胜或到有一场失败为结束。某些连串过关是组合几个不同的连串在一个单一的连串注单中。例如：4串11是11个不同的连串投注。请参考"连串过关投注类型"选择查看更多的信息。</p>
            <p>例如：</p>
            <p>投注一个100元的3串1连串过关在以下的三场赛事:</p>
            <p>
            </p><ul>
                <li>曼联 @ 1.80 </li>
                <li>切尔西 @ 1.50 </li>
                <li>阿森纳 @ 1.66 </li>
            </ul>
            <p></p>
            <p>如果所有的三场赛事都获胜，连串过关的盈利为448.20元（包括本金）。详细的计算方式您可以查看以下的信息:</p>
            <p>
            </p><ul>
                <li>注单 1:曼联 1.80 x $100 = 返还 $180</li>
                <li>注单 2: 切尔西 1.50 x $180 = 返还 $270</li>
                <li>注单 3: 阿森纳 1.66 x $270 = 返还 $448.20</li>
            </ul>
            <p></p>
            <ul style="margin-left: 25px;">
                <p class="b sub">连串过关要点:</p>
                <ul>
                    <li>金宝博一个注单中最多的连串过关为10串。</li>
                    <li>所有投注赛事都需要根据体育博彩规则为准。</li>
                    <li>不是所有的赛事都可以投注连串过关。如果您在投注列表中看到不可以组合二个不相关的赛事（可以查看以下的信息关于有关联的连串），那么就是其中一场并没有开出连串过关投注。</li>
                    <li>连串过关可以投注不同种类的赛事，以及不在同一天的比赛。</li>
                </ul>
            </ul>
            <p class="b sub">2. 连串过关中选项</p>
            <p>连串过关投注，选择组合有关联的同一赛事或投注市场的结果会影响其他另一个投注市场，此注单是不接受的。例如:</p>
            <p>例如:</p>
            <p>以下的2串1是不接受的，由于是同一场赛事:</p>
            <ul>
                <li>曼联获胜独赢盘口@1.80 </li>
                <li>曼联2-0获胜，正确比分盘口@7.0 </li>
            </ul>
            <p>如果曼联2-0获胜，组合盘口为12.6。其实盘口应该为7.0，因为曼联2-0获胜，那么独赢盘口自然而然为获胜。 </p>
            <p>连串过关投注，选择组合有关联的同一球队或球员，即使他们是不同的时间，同样是不接受例如一个结果会影响另一个结果。 </p>
            <p>例如:</p>
            <ul>
                <li>曼联进入到最后的冠军杯决赛@6.0 </li>
                <li>曼联进入到最后的冠军杯决赛@6.0 </li>
                <li>组合盘口@60.0 </li>
            </ul>
            <p>这个连串过关被视为第二个赛果会影响到第一个赛果。如果曼联获得冠军杯联赛冠军，那么曼联自然而然就进入冠军杯决赛。因此，盘口仅仅为10.0。 </p>
            <p>金宝博有权利取消有关联的连串过关投注。</p>
            <p class="b sub">3. 连串过关</p>
            <p>在连串过关中有任何的投注赛事无效或者打和（如以下的范例），此连串过关注单仍然有效，并且按照任何所胜出的其余投注结算，范例如下：</p>
            <ul>
                <li>投注项1：切尔西（-0.5）-切尔西赢。 </li>
                <li>投注项2:投注2：曼联（-1）-曼联赢1-0.</li>
                <li>投注项3:投注3: 阿森纳（-0.5）-阿森纳赢。 </li>
            </ul>
            <p>正如曼联是以（-1）的亚洲盘口1-0获胜，但在连串过关中的此赛事视为和。因此，当切尔西获胜连串阿森纳获胜过关，此连串过关将被视为切尔西以及阿森纳的2串，而非最初的3串。同时，打和的过关投注项目将会被自动以1计算。 </p>
            <p>过关的计算范例如下</p>
            <p class="b sub">范例1： 其中一个投注项为和:</p>
            <p></p><table width="78.8%" border="0" cellspacing="1" cellpadding="0" class="demo">
                <tbody><tr style="background-color:#ff9700; font-weight:bold;">
                    <th>投注项</th>
                    <th>让球</th>
                    <th>陪率</th>
                    <th>赛过</th>
                    <th>结果</th>
                </tr>
                <tr>
                    <td>切尔西</td>
                    <td>(-0.5/1)</td>
                    <td>1.85</td>
                    <td>赢 2-0</td>
                    <td>全赢</td>
                </tr>
                <tr style="font-weight:bold;">
                    <td>曼联</td>
                    <td>(-1)</td>
                    <td>1.95</td>
                    <td>赢 1-0</td>
                    <td>和</td>
                </tr>
                <tr>
                    <td>阿森纳</td>
                    <td>(-1/1.5)</td>
                    <td>2.05</td>
                    <td>赢3-0</td>
                    <td>全赢</td>
                </tr>
                </tbody></table>
            <p></p>
            <p>投注金额：$100 3串一</p>
            <p>计算方式如下</p>
            <p>$100 x 1.85 x 1 x 2.05 = $379.25,扣除本金$100=盈利<span style="font-weight:bold;">$279.25</span></p>
            <ul>
                <li>切尔西(-0.5/1)：赢- $100 x 1.85 =返还$185。此金额将会移至下个选项。 </li>
                <li>曼联(-1): 和- $185 x 1 = $185. 此金额将会移至到下一选项。 </li>
                <li>阿森纳(-1/1.5)：赢- $185 x 2.05 =返还$379.25</li>
                <li>盈利：$379.25 – $100 = $279.25.
                    <p></p>
                </li></ul>
            <p class="b sub">范例2： 其中一个投注项为赢半平半</p>
            <p></p><table width="78.8%" border="0" cellspacing="1" cellpadding="0" class="demo">
                <tbody><tr style="background-color:#ff9700; font-weight:bold;">
                    <th>投注项</th>
                    <th>让球</th>
                    <th>陪率</th>
                    <th>赛过</th>
                    <th>结果</th>
                </tr>
                <tr style="font-weight:bold;">
                    <td>投注项</td>
                    <td>(-0.5/1)</td>
                    <td>1.85</td>
                    <td>赢 1-0</td>
                    <td>赢半 / 平半</td>
                </tr>
                <tr>
                    <td>曼联</td>
                    <td>(-1)</td>
                    <td>1.95</td>
                    <td>赢 2-0</td>
                    <td>全赢</td>
                </tr>
                <tr>
                    <td>阿森纳</td>
                    <td>(-1/1.5)</td>
                    <td>2.05</td>
                    <td>赢3-0</td>
                    <td>全赢</td>
                </tr>
                </tbody></table>
            <p></p>
            <p>连串投注：$100 3串一</p>
            <p>计算方式如下：</p>
            <p>$100 x [1 + 0.5 x 0.85] x 1.95 x 2.05 = $569.64， 扣除本金=赢$469.64</p>
            <ul>
                <li>切尔西(-0.5/1)：赢半/平半– 此注单被分为两项，只有一半的投注盈利， <br>
                    盈利的部分$50 x 1.85 = $92.50<br>
                    打和部分$50 x 1 = 50<br>
                    返还是$92.50 + $50 = $142.50。此金额将移至下个投注项</li>
                <li>曼联（-1）:盈利-142.50 x 1.95=$277.87，此金额将移至下个投注项</li>
                <li>阿森纳(-1/-1.5):盈利-277.87 x 2.05=$569.64</li>
                <li>总盈利:$569.64-$100=$469.64.
                    <p></p>
                </li></ul>
            <p class="b sub">范例3：其中一个投注项为赢半平半</p>
            <p></p><table width="78.8%" border="0" cellspacing="1" cellpadding="0" class="demo">
                <tbody><tr style="background-color:#ff9700; font-weight:bold;">
                    <th>投注项</th>
                    <th>让球</th>
                    <th>陪率</th>
                    <th>赛过</th>
                    <th>结果</th>
                </tr>
                <tr>
                    <td>切尔西</td>
                    <td>(-0.5/1)</td>
                    <td>1.85</td>
                    <td>赢2-0</td>
                    <td>赢</td>
                </tr>
                <tr>
                    <td>曼联</td>
                    <td>(-1)</td>
                    <td>1.95</td>
                    <td>赢2-0</td>
                    <td>赢</td>
                </tr>
                <tr style="font-weight:bold;">
                    <td>阿森纳</td>
                    <td>(-1/1.5)</td>
                    <td>2.05</td>
                    <td>赢 1-0</td>
                    <td>输半 /平半</td>
                </tr>
                </tbody></table>
            <p></p>
            <p>连串投注：$100 3串一</p>
            <p>计算方式如下：</p>
            <p>$100 x 1.85 x 1.95 x 0.5 = $180.38, 扣除本金$100 = 盈利$80.38</p>
            <ul>
                <li>切尔西(-0.5/1): 赢- $100 x 1.85 = $185 = 返回of $185. 此金额将移至下个投注项</li>
                <li>曼联(-1): 赢- $185 x 1.95 = $360.75. 此金额将移至下个投注项</li>
                <li>阿森纳(-1/1.5): 输半/平半– 投注额度将一分为二，其中一半为输。 <br>
                    $360.75 x 0.5 = $180.38.<br>
                    输半: $180.38<br>
                    平半: $180.38 x 1 = $180.38 </li>
                <li>返回: $180.38</li>
                <li>总盈利: $180.38 – $100 = $80.38.</li>
                <p></p>
            </ul>


            <div class="to_top"><a href="#top"><span>回最上层</span></a></div>
        </div><!--资料区 End-->
    </div>

</div>
<div class="qa_foot"></div>


</body></html>