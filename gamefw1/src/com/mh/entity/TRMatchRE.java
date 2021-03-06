package com.mh.entity;

import java.io.Serializable;
import java.util.Date;

public class TRMatchRE implements Serializable {

 
	private static final long serialVersionUID = 1L;

	// 流水号
	private Integer id;

	private String curtag;

	private Integer matchIndex;

	private Integer matchPage;

	private String gid;

	private String timer;

	private String league;

	private String gnumH;

	private String gnumC;

	private String teamH;

	private String teamC;

	private String strong;

	private String ratio;

	private String iorRh;

	private String iorRc;

	private String ratioO;

	private String ratioU;

	private String iorOuh;

	private String iorOuc;

	private String no1;

	private String no2;

	private String no3;

	private String scoreH;

	private String scoreC;

	private String hgid;

	private String hstrong;

	private String hratio;

	private String iorHrh;

	private String iorHrc;

	private String hratioO;

	private String hratioU;

	private String iorHouh;

	private String iorHouc;

	private String redcardH;

	private String redcardC;

	private String lastestscoreH;

	private String lastestscoreC;

	private String iorMh;

	private String iorMc;

	private String iorMn;

	private String iorHmh;

	private String iorHmc;

	private String iorHmn;

	private String strOdd;

	private String strEven;

	private String iorEoo;

	private String iorEoe;

	private String eventid;

	private String hot;

	private String centerTv;

	private String play;

	private String matchTime;

	private String retimeset;

	private String more;

	private Integer roll;

	private String tmp1;

	private String tmp2;

	private String tmp3;
	
	private Date modifyTime;
	
	private String setType;// 上半场还是下半场（1上，2下）
	
	private String frasherDate;
	

	public Integer getId() {
		return id;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.id
	 * 
	 * @param id
	 *            the value for t_r_match_re.id
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.curTag
	 * 
	 * @return the value of t_r_match_re.curTag
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getCurtag() {
		return curtag;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.curTag
	 * 
	 * @param curtag
	 *            the value for t_r_match_re.curTag
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setCurtag(String curtag) {
		this.curtag = curtag;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.match_index
	 * 
	 * @return the value of t_r_match_re.match_index
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getMatchIndex() {
		return matchIndex;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.match_index
	 * 
	 * @param matchIndex
	 *            the value for t_r_match_re.match_index
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setMatchIndex(Integer matchIndex) {
		this.matchIndex = matchIndex;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.match_page
	 * 
	 * @return the value of t_r_match_re.match_page
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getMatchPage() {
		return matchPage;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.match_page
	 * 
	 * @param matchPage
	 *            the value for t_r_match_re.match_page
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setMatchPage(Integer matchPage) {
		this.matchPage = matchPage;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.gid
	 * 
	 * @return the value of t_r_match_re.gid
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getGid() {
		return gid;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.gid
	 * 
	 * @param gid
	 *            the value for t_r_match_re.gid
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setGid(String gid) {
		this.gid = gid;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.timer
	 * 
	 * @return the value of t_r_match_re.timer
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getTimer() {
		return timer;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.timer
	 * 
	 * @param timer
	 *            the value for t_r_match_re.timer
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setTimer(String timer) {
		this.timer = timer;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.league
	 * 
	 * @return the value of t_r_match_re.league
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getLeague() {
		return league;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.league
	 * 
	 * @param league
	 *            the value for t_r_match_re.league
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setLeague(String league) {
		this.league = league;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.gnum_h
	 * 
	 * @return the value of t_r_match_re.gnum_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getGnumH() {
		return gnumH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.gnum_h
	 * 
	 * @param gnumH
	 *            the value for t_r_match_re.gnum_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setGnumH(String gnumH) {
		this.gnumH = gnumH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.gnum_c
	 * 
	 * @return the value of t_r_match_re.gnum_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getGnumC() {
		return gnumC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.gnum_c
	 * 
	 * @param gnumC
	 *            the value for t_r_match_re.gnum_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setGnumC(String gnumC) {
		this.gnumC = gnumC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.team_h
	 * 
	 * @return the value of t_r_match_re.team_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getTeamH() {
		return teamH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.team_h
	 * 
	 * @param teamH
	 *            the value for t_r_match_re.team_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setTeamH(String teamH) {
		this.teamH = teamH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.team_c
	 * 
	 * @return the value of t_r_match_re.team_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getTeamC() {
		return teamC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.team_c
	 * 
	 * @param teamC
	 *            the value for t_r_match_re.team_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setTeamC(String teamC) {
		this.teamC = teamC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.strong
	 * 
	 * @return the value of t_r_match_re.strong
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getStrong() {
		return strong;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.strong
	 * 
	 * @param strong
	 *            the value for t_r_match_re.strong
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStrong(String strong) {
		this.strong = strong;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ratio
	 * 
	 * @return the value of t_r_match_re.ratio
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getRatio() {
		return ratio;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ratio
	 * 
	 * @param ratio
	 *            the value for t_r_match_re.ratio
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ior_RH
	 * 
	 * @return the value of t_r_match_re.ior_RH
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getIorRh() {
		return iorRh;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ior_RH
	 * 
	 * @param iorRh
	 *            the value for t_r_match_re.ior_RH
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setIorRh(String iorRh) {
		this.iorRh = iorRh;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ior_RC
	 * 
	 * @return the value of t_r_match_re.ior_RC
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getIorRc() {
		return iorRc;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ior_RC
	 * 
	 * @param iorRc
	 *            the value for t_r_match_re.ior_RC
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setIorRc(String iorRc) {
		this.iorRc = iorRc;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ratio_o
	 * 
	 * @return the value of t_r_match_re.ratio_o
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getRatioO() {
		return ratioO;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ratio_o
	 * 
	 * @param ratioO
	 *            the value for t_r_match_re.ratio_o
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setRatioO(String ratioO) {
		this.ratioO = ratioO;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ratio_u
	 * 
	 * @return the value of t_r_match_re.ratio_u
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getRatioU() {
		return ratioU;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ratio_u
	 * 
	 * @param ratioU
	 *            the value for t_r_match_re.ratio_u
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setRatioU(String ratioU) {
		this.ratioU = ratioU;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ior_OUH
	 * 
	 * @return the value of t_r_match_re.ior_OUH
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getIorOuh() {
		return iorOuh;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ior_OUH
	 * 
	 * @param iorOuh
	 *            the value for t_r_match_re.ior_OUH
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setIorOuh(String iorOuh) {
		this.iorOuh = iorOuh;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ior_OUC
	 * 
	 * @return the value of t_r_match_re.ior_OUC
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getIorOuc() {
		return iorOuc;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ior_OUC
	 * 
	 * @param iorOuc
	 *            the value for t_r_match_re.ior_OUC
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setIorOuc(String iorOuc) {
		this.iorOuc = iorOuc;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.no1
	 * 
	 * @return the value of t_r_match_re.no1
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getNo1() {
		return no1;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.no1
	 * 
	 * @param no1
	 *            the value for t_r_match_re.no1
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setNo1(String no1) {
		this.no1 = no1;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.no2
	 * 
	 * @return the value of t_r_match_re.no2
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getNo2() {
		return no2;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.no2
	 * 
	 * @param no2
	 *            the value for t_r_match_re.no2
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setNo2(String no2) {
		this.no2 = no2;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.no3
	 * 
	 * @return the value of t_r_match_re.no3
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getNo3() {
		return no3;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.no3
	 * 
	 * @param no3
	 *            the value for t_r_match_re.no3
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setNo3(String no3) {
		this.no3 = no3;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.score_h
	 * 
	 * @return the value of t_r_match_re.score_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getScoreH() {
		return scoreH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.score_h
	 * 
	 * @param scoreH
	 *            the value for t_r_match_re.score_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setScoreH(String scoreH) {
		this.scoreH = scoreH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.score_c
	 * 
	 * @return the value of t_r_match_re.score_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getScoreC() {
		return scoreC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.score_c
	 * 
	 * @param scoreC
	 *            the value for t_r_match_re.score_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setScoreC(String scoreC) {
		this.scoreC = scoreC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.hgid
	 * 
	 * @return the value of t_r_match_re.hgid
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getHgid() {
		return hgid;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.hgid
	 * 
	 * @param hgid
	 *            the value for t_r_match_re.hgid
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setHgid(String hgid) {
		this.hgid = hgid;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.hstrong
	 * 
	 * @return the value of t_r_match_re.hstrong
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getHstrong() {
		return hstrong;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.hstrong
	 * 
	 * @param hstrong
	 *            the value for t_r_match_re.hstrong
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setHstrong(String hstrong) {
		this.hstrong = hstrong;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.hratio
	 * 
	 * @return the value of t_r_match_re.hratio
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getHratio() {
		return hratio;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.hratio
	 * 
	 * @param hratio
	 *            the value for t_r_match_re.hratio
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setHratio(String hratio) {
		this.hratio = hratio;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ior_HRH
	 * 
	 * @return the value of t_r_match_re.ior_HRH
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getIorHrh() {
		return iorHrh;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ior_HRH
	 * 
	 * @param iorHrh
	 *            the value for t_r_match_re.ior_HRH
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setIorHrh(String iorHrh) {
		this.iorHrh = iorHrh;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ior_HRC
	 * 
	 * @return the value of t_r_match_re.ior_HRC
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getIorHrc() {
		return iorHrc;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ior_HRC
	 * 
	 * @param iorHrc
	 *            the value for t_r_match_re.ior_HRC
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setIorHrc(String iorHrc) {
		this.iorHrc = iorHrc;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.hratio_o
	 * 
	 * @return the value of t_r_match_re.hratio_o
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getHratioO() {
		return hratioO;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.hratio_o
	 * 
	 * @param hratioO
	 *            the value for t_r_match_re.hratio_o
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setHratioO(String hratioO) {
		this.hratioO = hratioO;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.hratio_u
	 * 
	 * @return the value of t_r_match_re.hratio_u
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getHratioU() {
		return hratioU;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.hratio_u
	 * 
	 * @param hratioU
	 *            the value for t_r_match_re.hratio_u
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setHratioU(String hratioU) {
		this.hratioU = hratioU;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ior_HOUH
	 * 
	 * @return the value of t_r_match_re.ior_HOUH
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getIorHouh() {
		return iorHouh;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ior_HOUH
	 * 
	 * @param iorHouh
	 *            the value for t_r_match_re.ior_HOUH
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setIorHouh(String iorHouh) {
		this.iorHouh = iorHouh;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ior_HOUC
	 * 
	 * @return the value of t_r_match_re.ior_HOUC
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getIorHouc() {
		return iorHouc;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ior_HOUC
	 * 
	 * @param iorHouc
	 *            the value for t_r_match_re.ior_HOUC
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setIorHouc(String iorHouc) {
		this.iorHouc = iorHouc;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.redcard_h
	 * 
	 * @return the value of t_r_match_re.redcard_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getRedcardH() {
		return redcardH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.redcard_h
	 * 
	 * @param redcardH
	 *            the value for t_r_match_re.redcard_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setRedcardH(String redcardH) {
		this.redcardH = redcardH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.redcard_c
	 * 
	 * @return the value of t_r_match_re.redcard_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getRedcardC() {
		return redcardC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.redcard_c
	 * 
	 * @param redcardC
	 *            the value for t_r_match_re.redcard_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setRedcardC(String redcardC) {
		this.redcardC = redcardC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.lastestscore_h
	 * 
	 * @return the value of t_r_match_re.lastestscore_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getLastestscoreH() {
		return lastestscoreH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.lastestscore_h
	 * 
	 * @param lastestscoreH
	 *            the value for t_r_match_re.lastestscore_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setLastestscoreH(String lastestscoreH) {
		this.lastestscoreH = lastestscoreH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.lastestscore_c
	 * 
	 * @return the value of t_r_match_re.lastestscore_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getLastestscoreC() {
		return lastestscoreC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.lastestscore_c
	 * 
	 * @param lastestscoreC
	 *            the value for t_r_match_re.lastestscore_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setLastestscoreC(String lastestscoreC) {
		this.lastestscoreC = lastestscoreC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ior_MH
	 * 
	 * @return the value of t_r_match_re.ior_MH
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getIorMh() {
		return iorMh;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ior_MH
	 * 
	 * @param iorMh
	 *            the value for t_r_match_re.ior_MH
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setIorMh(String iorMh) {
		this.iorMh = iorMh;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ior_MC
	 * 
	 * @return the value of t_r_match_re.ior_MC
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getIorMc() {
		return iorMc;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ior_MC
	 * 
	 * @param iorMc
	 *            the value for t_r_match_re.ior_MC
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setIorMc(String iorMc) {
		this.iorMc = iorMc;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ior_MN
	 * 
	 * @return the value of t_r_match_re.ior_MN
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getIorMn() {
		return iorMn;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ior_MN
	 * 
	 * @param iorMn
	 *            the value for t_r_match_re.ior_MN
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setIorMn(String iorMn) {
		this.iorMn = iorMn;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ior_HMH
	 * 
	 * @return the value of t_r_match_re.ior_HMH
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getIorHmh() {
		return iorHmh;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ior_HMH
	 * 
	 * @param iorHmh
	 *            the value for t_r_match_re.ior_HMH
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setIorHmh(String iorHmh) {
		this.iorHmh = iorHmh;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ior_HMC
	 * 
	 * @return the value of t_r_match_re.ior_HMC
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getIorHmc() {
		return iorHmc;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ior_HMC
	 * 
	 * @param iorHmc
	 *            the value for t_r_match_re.ior_HMC
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setIorHmc(String iorHmc) {
		this.iorHmc = iorHmc;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ior_HMN
	 * 
	 * @return the value of t_r_match_re.ior_HMN
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getIorHmn() {
		return iorHmn;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ior_HMN
	 * 
	 * @param iorHmn
	 *            the value for t_r_match_re.ior_HMN
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setIorHmn(String iorHmn) {
		this.iorHmn = iorHmn;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.str_odd
	 * 
	 * @return the value of t_r_match_re.str_odd
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getStrOdd() {
		return strOdd;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.str_odd
	 * 
	 * @param strOdd
	 *            the value for t_r_match_re.str_odd
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStrOdd(String strOdd) {
		this.strOdd = strOdd;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.str_even
	 * 
	 * @return the value of t_r_match_re.str_even
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getStrEven() {
		return strEven;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.str_even
	 * 
	 * @param strEven
	 *            the value for t_r_match_re.str_even
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStrEven(String strEven) {
		this.strEven = strEven;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ior_EOO
	 * 
	 * @return the value of t_r_match_re.ior_EOO
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getIorEoo() {
		return iorEoo;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ior_EOO
	 * 
	 * @param iorEoo
	 *            the value for t_r_match_re.ior_EOO
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setIorEoo(String iorEoo) {
		this.iorEoo = iorEoo;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.ior_EOE
	 * 
	 * @return the value of t_r_match_re.ior_EOE
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getIorEoe() {
		return iorEoe;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.ior_EOE
	 * 
	 * @param iorEoe
	 *            the value for t_r_match_re.ior_EOE
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setIorEoe(String iorEoe) {
		this.iorEoe = iorEoe;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.eventid
	 * 
	 * @return the value of t_r_match_re.eventid
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getEventid() {
		return eventid;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.eventid
	 * 
	 * @param eventid
	 *            the value for t_r_match_re.eventid
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setEventid(String eventid) {
		this.eventid = eventid;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.hot
	 * 
	 * @return the value of t_r_match_re.hot
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getHot() {
		return hot;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.hot
	 * 
	 * @param hot
	 *            the value for t_r_match_re.hot
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setHot(String hot) {
		this.hot = hot;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.center_tv
	 * 
	 * @return the value of t_r_match_re.center_tv
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getCenterTv() {
		return centerTv;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.center_tv
	 * 
	 * @param centerTv
	 *            the value for t_r_match_re.center_tv
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setCenterTv(String centerTv) {
		this.centerTv = centerTv;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.play
	 * 
	 * @return the value of t_r_match_re.play
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getPlay() {
		return play;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.play
	 * 
	 * @param play
	 *            the value for t_r_match_re.play
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setPlay(String play) {
		this.play = play;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.match_time
	 * 
	 * @return the value of t_r_match_re.match_time
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getMatchTime() {
		return matchTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.match_time
	 * 
	 * @param matchTime
	 *            the value for t_r_match_re.match_time
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setMatchTime(String matchTime) {
		this.matchTime = matchTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.retimeset
	 * 
	 * @return the value of t_r_match_re.retimeset
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getRetimeset() {
		return retimeset;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.retimeset
	 * 
	 * @param retimeset
	 *            the value for t_r_match_re.retimeset
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setRetimeset(String retimeset) {
		this.retimeset = retimeset;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.more
	 * 
	 * @return the value of t_r_match_re.more
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getMore() {
		return more;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.more
	 * 
	 * @param more
	 *            the value for t_r_match_re.more
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setMore(String more) {
		this.more = more;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.roll
	 * 
	 * @return the value of t_r_match_re.roll
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getRoll() {
		return roll;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.roll
	 * 
	 * @param roll
	 *            the value for t_r_match_re.roll
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.tmp1
	 * 
	 * @return the value of t_r_match_re.tmp1
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getTmp1() {
		return tmp1;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.tmp1
	 * 
	 * @param tmp1
	 *            the value for t_r_match_re.tmp1
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setTmp1(String tmp1) {
		this.tmp1 = tmp1;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.tmp2
	 * 
	 * @return the value of t_r_match_re.tmp2
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getTmp2() {
		return tmp2;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.tmp2
	 * 
	 * @param tmp2
	 *            the value for t_r_match_re.tmp2
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setTmp2(String tmp2) {
		this.tmp2 = tmp2;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_r_match_re.tmp3
	 * 
	 * @return the value of t_r_match_re.tmp3
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getTmp3() {
		return tmp3;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_r_match_re.tmp3
	 * 
	 * @param tmp3
	 *            the value for t_r_match_re.tmp3
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setTmp3(String tmp3) {
		this.tmp3 = tmp3;
	}



	public String getSetType() {
		return setType;
	}

	public void setSetType(String setType) {
		this.setType = setType;
	}

	public String getFrasherDate() {
		return frasherDate;
	}

	public void setFrasherDate(String frasherDate) {
		this.frasherDate = frasherDate;
	}
	
	
	

}