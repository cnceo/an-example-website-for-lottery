package com.mh.ifc.http;

/**
 * 检测与创建帐号返回值
 * 
 * @author Administrator
 * 
 */
public class HgConts {
	public static String PARAMS = "params";
	
	/** 请求参数名 **/
	public static String APIACCOUNT = "apiAccount";// api帐号
	
	public static String NICKNAME = "nickname";
	public static String PASSWORD = "password";// 游戏密码（3-10英文与数字组合）
	public static String CURRENCY = "currency";//用户所使用的币别
	public static String MOBILEPHONE = "mobilePhone";// 手机号码
	public static String EMAIL = "email";// 邮箱
	public static String SESSIONGUID = "sessionGUID";// 认证码
	public static String CODE = "code";// 验证码
	public static String AMOUNT = "amount";// 金额
	public static String LANGUAGE = "language";// 语言
	public static String GAMENAME = "gameName";// 电子游戏
	public static String TRANSSN = "transSN";// 交易編號(唯一)，10 ~ 19 個數字
	public static String PAGESITE = "pageSite";// 游戏类型
	public static String LINE = "line";//线路
	public static String REFNO = "refno";//唯一交易号
	public static String DESC = "desc";//交易描述
	public static String CNY = "CNY";//货比类型
	public static String REF_CODE = "567888";
	public static String COUNT = "count";//采集最大记录数
	public static String BEGINID = "beginId";//拉取数据初始序列号
	
	/**********************************************************/
	public static String USERNAME = "username";// 游戏帐号（3-10英文与数字组合）
	public static String FIRSTNAME = "firstname";
	public static String LASTNAME = "lastname";
	public static String CURRENCYID = "currencyid";
	public static String ISMOBILE = "ismobile";
	public static String MODE = "mode";
	public static String STATUS = "status";
	public static int SUCCESS = 0;
	public static String PAYMENTID = "paymentid";
	public static String ERRDESC = "errdesc";
	public static String STARTTIME = "startTime";// 開始時間，MM/dd/yyyy hh:mm:ss
	public static String ENDTIME = "EndTime";// 結束時間，MM/dd/yyyy hh:mm:ss
	
	
	public static String LOGIN_MODE = "1";
	public static String LOGIN_MODE_0 = "0";//试玩
	public static String LOGIN_MODE_1 = "1";//真实
	public static String CURRENCY_RMB = "RMB";
	
	public static String WEBFLAG = "webFlag";//系统标示;
	public static String EDUORDER = "eduOrder";
	
	public static String ROUNDDATE = "roundDate";// 日期，yyyy-MM-dd

	public static String GAMEKIND = "gameKind";// 遊戲種類 (1:BB 體育 3:視訊 5:機率 12:彩票 15:3D廳)
	public static String GAMETYPE = "gameType";// 遊戲代碼，註 2 (gameKind=12 時，須強制帶入)
	public static String PAGEINDEX = "pageIndex";// 當前頁碼
	public static String PAGESIZE = "pageSize";// 每頁筆數

	/** 请求:登入 **/
	public static String REQ_URL_LOGINLIVE = "/login.ashx";
	/** 请求:登出 **/
	public static String REQ_URL_LOGOUT = "/logout.ashx";
	/** 请求:遊戲 記錄 **/
	public static String REQ_URL_BETRECORD = "/betrecord.ashx";

	/** 语言 **/
	public static String LANG_CN = "CN";
	public static String LANG_HK = "HK";
	public static String LANG_EN = "EN";
	public static String LANG_TH = "TH";
	public static String LANG_VN = "VN";

	/** 游戏类型 **/
	public static String PAGESITE_BACCARAT = "BACCARAT";//百家乐
	public static String PAGESITE＿DRAGON_TIGER = "DRAGON_TIGER";//龙虎
	public static String PAGESITE_ROULETTE = "ROULETTE";//轮盘
	public static String PAGESITE_BACCARAT_INSURANCE = "BACCARAT_INSURANCE";//保险百家乐
	public static String PAGESITE_SICBO = "SICBO";//骰宝
	public static String PAGESITE_XOC_DIA = "XOC_DIA";//色碟
	
	
	public static String PAGESITE_BALL = "ball";// 体育
	public static String PAGESITE_LTLOTTERY = "ltlottery";// 彩票
	public static String PAGESITE_3DHALL = "3DHall";// 3D厅
	public static String PAGESITE_LIVE = "live";// 视讯
	public static String PAGESITE_GAME = "game";// 概率

	/** 返回结果 **/
	public static int RES_CODE_0 = 0;// 成功
	public static int RES_CODE_6600 = 6600;// 参数格式错误
	public static int RES_CODE_6601 = 6601;//交易号已存在,操作状态为成功
	public static int RES_CODE_6605 = 6605;//无此用户
	public static int RES_CODE_6606 = 6606;//但密码错误
	public static int RES_CODE_6609 = 6609;//用户名为空, 字符长度不正确, 格式不正确
	public static int RES_CODE_6610 = 6610;//密码为空, 字符长度不正确, 格式不正确
	public static int RES_CODE_6611 = 6611;//昵称字符长度不正确
	public static int RES_CODE_6613 = 6613;//无效的存款金额
	public static int RES_CODE_6614 = 6614;//无效的交易号
	public static int RES_CODE_6616 = 6616;//交易号已存在, 操作状态为余额不足
	public static int RES_CODE_6617 = 6617;//交易号已存在, 操作状态为正在处理中
	public static int RES_CODE_6620 = 6620;//注意拉取时错误
	public static int RES_CODE_6999 = 6999;//游戏维护中

}
