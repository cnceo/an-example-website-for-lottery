package com.mh.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_result_match_bk")
public class TResultMatchBk implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 流水号
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// 自增长
	@Column(name = "ID", nullable = false)
	private Integer id;
	
	@Column(name = "leg_gid")
	private String legGid;
	
	@Column(name = "leg")
	private String leg;

	@Column(name = "gid")
	private String gid;

	@Column(name = "match_time")
	private String matchTime;

	@Column(name = "match_type")
	private String matchType;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "search_time")
	private Date searchTime;
	
	@Column(name = "match_real_time")
	private String matchRealTime;
	
	@Column(name = "league")
	private String league;

	@Column(name = "team_h")
	private String teamH;
	
	@Column(name = "team_c")
	private String teamC;
	
	@Column(name = "stage_c_1")
	private Integer stageC1;
	
	@Column(name = "stage_c_2")
	private Integer stageC2;
	
	@Column(name = "stage_c_3")
	private Integer stageC3;
	
	@Column(name = "stage_c_4")
	private Integer stageC4;
	
	@Column(name = "stage_c_s")
	private Integer stageCS;
	
	@Column(name = "stage_c_x")
	private Integer stageCX;
	
	@Column(name = "stage_c_f")
	private Integer stageCF;
	
	@Column(name = "stage_c_a")
	private Integer stageCA;
	
	@Column(name = "stage_h_1")
	private Integer stageH1;
	
	@Column(name = "stage_h_2")	
	private Integer stageH2;
	
	@Column(name = "stage_h_3")
	private Integer stageH3;
	
	@Column(name = "stage_h_4")
	private Integer stageH4;
	
	@Column(name = "stage_h_s")
	private Integer stageHS;
	
	@Column(name = "stage_h_x")
	private Integer stageHX;
	
	@Column(name = "stage_h_f")
	private Integer stageHF;
	
	@Column(name = "stage_h_a")
	private Integer stageHA;
	
	@Column(name = "match_status")
	private Integer matchStatus;
	
	@Column(name = "match_settled")
	private Integer matchSettled;
	
	@Column(name = "tmp1")
	private String tmp1;
	
	@Column(name = "tmp2")
	private String tmp2;
	
	@Column(name = "tmp3")
	private String tmp3;

	@Column(name = "match_index")
	private Integer matchIndex;


	
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.id
	 * @param id  the value for t_result_match_bk.id
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.leg_gid
	 * @return  the value of t_result_match_bk.leg_gid
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public String getLegGid() {
		return legGid;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.leg_gid
	 * @param legGid  the value for t_result_match_bk.leg_gid
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setLegGid(String legGid) {
		this.legGid = legGid;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.leg
	 * @return  the value of t_result_match_bk.leg
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public String getLeg() {
		return leg;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.leg
	 * @param leg  the value for t_result_match_bk.leg
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setLeg(String leg) {
		this.leg = leg;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.gid
	 * @return  the value of t_result_match_bk.gid
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public String getGid() {
		return gid;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.gid
	 * @param gid  the value for t_result_match_bk.gid
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setGid(String gid) {
		this.gid = gid;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.match_type
	 * @return  the value of t_result_match_bk.match_type
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public String getMatchType() {
		return matchType;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.match_type
	 * @param matchType  the value for t_result_match_bk.match_type
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.search_time
	 * @return  the value of t_result_match_bk.search_time
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Date getSearchTime() {
		return searchTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.search_time
	 * @param searchTime  the value for t_result_match_bk.search_time
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setSearchTime(Date searchTime) {
		this.searchTime = searchTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.match_time
	 * @return  the value of t_result_match_bk.match_time
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public String getMatchTime() {
		return matchTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.match_time
	 * @param matchTime  the value for t_result_match_bk.match_time
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setMatchTime(String matchTime) {
		this.matchTime = matchTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.match_real_time
	 * @return  the value of t_result_match_bk.match_real_time
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public String getMatchRealTime() {
		return matchRealTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.match_real_time
	 * @param matchRealTime  the value for t_result_match_bk.match_real_time
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setMatchRealTime(String matchRealTime) {
		this.matchRealTime = matchRealTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.league
	 * @return  the value of t_result_match_bk.league
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public String getLeague() {
		return league;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.league
	 * @param league  the value for t_result_match_bk.league
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setLeague(String league) {
		this.league = league;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.team_c
	 * @return  the value of t_result_match_bk.team_c
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public String getTeamC() {
		return teamC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.team_c
	 * @param teamC  the value for t_result_match_bk.team_c
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setTeamC(String teamC) {
		this.teamC = teamC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.team_h
	 * @return  the value of t_result_match_bk.team_h
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public String getTeamH() {
		return teamH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.team_h
	 * @param teamH  the value for t_result_match_bk.team_h
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setTeamH(String teamH) {
		this.teamH = teamH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.stage_c_1
	 * @return  the value of t_result_match_bk.stage_c_1
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getStageC1() {
		return stageC1;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.stage_c_1
	 * @param stageC1  the value for t_result_match_bk.stage_c_1
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStageC1(Integer stageC1) {
		this.stageC1 = stageC1;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.stage_c_2
	 * @return  the value of t_result_match_bk.stage_c_2
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getStageC2() {
		return stageC2;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.stage_c_2
	 * @param stageC2  the value for t_result_match_bk.stage_c_2
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStageC2(Integer stageC2) {
		this.stageC2 = stageC2;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.stage_c_3
	 * @return  the value of t_result_match_bk.stage_c_3
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getStageC3() {
		return stageC3;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.stage_c_3
	 * @param stageC3  the value for t_result_match_bk.stage_c_3
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStageC3(Integer stageC3) {
		this.stageC3 = stageC3;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.stage_c_4
	 * @return  the value of t_result_match_bk.stage_c_4
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getStageC4() {
		return stageC4;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.stage_c_4
	 * @param stageC4  the value for t_result_match_bk.stage_c_4
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStageC4(Integer stageC4) {
		this.stageC4 = stageC4;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.stage_c_s
	 * @return  the value of t_result_match_bk.stage_c_s
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getStageCS() {
		return stageCS;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.stage_c_s
	 * @param stageCS  the value for t_result_match_bk.stage_c_s
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStageCS(Integer stageCS) {
		this.stageCS = stageCS;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.stage_c_x
	 * @return  the value of t_result_match_bk.stage_c_x
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getStageCX() {
		return stageCX;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.stage_c_x
	 * @param stageCX  the value for t_result_match_bk.stage_c_x
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStageCX(Integer stageCX) {
		this.stageCX = stageCX;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.stage_c_f
	 * @return  the value of t_result_match_bk.stage_c_f
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getStageCF() {
		return stageCF;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.stage_c_f
	 * @param stageCF  the value for t_result_match_bk.stage_c_f
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStageCF(Integer stageCF) {
		this.stageCF = stageCF;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.stage_c_a
	 * @return  the value of t_result_match_bk.stage_c_a
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getStageCA() {
		return stageCA;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.stage_c_a
	 * @param stageCA  the value for t_result_match_bk.stage_c_a
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStageCA(Integer stageCA) {
		this.stageCA = stageCA;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.stage_h_1
	 * @return  the value of t_result_match_bk.stage_h_1
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getStageH1() {
		return stageH1;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.stage_h_1
	 * @param stageH1  the value for t_result_match_bk.stage_h_1
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStageH1(Integer stageH1) {
		this.stageH1 = stageH1;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.stage_h_2
	 * @return  the value of t_result_match_bk.stage_h_2
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getStageH2() {
		return stageH2;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.stage_h_2
	 * @param stageH2  the value for t_result_match_bk.stage_h_2
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStageH2(Integer stageH2) {
		this.stageH2 = stageH2;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.stage_h_3
	 * @return  the value of t_result_match_bk.stage_h_3
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getStageH3() {
		return stageH3;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.stage_h_3
	 * @param stageH3  the value for t_result_match_bk.stage_h_3
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStageH3(Integer stageH3) {
		this.stageH3 = stageH3;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.stage_h_4
	 * @return  the value of t_result_match_bk.stage_h_4
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getStageH4() {
		return stageH4;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.stage_h_4
	 * @param stageH4  the value for t_result_match_bk.stage_h_4
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStageH4(Integer stageH4) {
		this.stageH4 = stageH4;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.stage_h_s
	 * @return  the value of t_result_match_bk.stage_h_s
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getStageHS() {
		return stageHS;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.stage_h_s
	 * @param stageHS  the value for t_result_match_bk.stage_h_s
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStageHS(Integer stageHS) {
		this.stageHS = stageHS;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.stage_h_x
	 * @return  the value of t_result_match_bk.stage_h_x
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getStageHX() {
		return stageHX;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.stage_h_x
	 * @param stageHX  the value for t_result_match_bk.stage_h_x
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStageHX(Integer stageHX) {
		this.stageHX = stageHX;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.stage_h_f
	 * @return  the value of t_result_match_bk.stage_h_f
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getStageHF() {
		return stageHF;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.stage_h_f
	 * @param stageHF  the value for t_result_match_bk.stage_h_f
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStageHF(Integer stageHF) {
		this.stageHF = stageHF;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.stage_h_a
	 * @return  the value of t_result_match_bk.stage_h_a
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getStageHA() {
		return stageHA;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.stage_h_a
	 * @param stageHA  the value for t_result_match_bk.stage_h_a
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setStageHA(Integer stageHA) {
		this.stageHA = stageHA;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.match_status
	 * @return  the value of t_result_match_bk.match_status
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getMatchStatus() {
		return matchStatus;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.match_status
	 * @param matchStatus  the value for t_result_match_bk.match_status
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setMatchStatus(Integer matchStatus) {
		this.matchStatus = matchStatus;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.match_settled
	 * @return  the value of t_result_match_bk.match_settled
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getMatchSettled() {
		return matchSettled;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.match_settled
	 * @param matchSettled  the value for t_result_match_bk.match_settled
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setMatchSettled(Integer matchSettled) {
		this.matchSettled = matchSettled;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.tmp1
	 * @return  the value of t_result_match_bk.tmp1
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public String getTmp1() {
		return tmp1;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.tmp1
	 * @param tmp1  the value for t_result_match_bk.tmp1
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setTmp1(String tmp1) {
		this.tmp1 = tmp1;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.tmp2
	 * @return  the value of t_result_match_bk.tmp2
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public String getTmp2() {
		return tmp2;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.tmp2
	 * @param tmp2  the value for t_result_match_bk.tmp2
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setTmp2(String tmp2) {
		this.tmp2 = tmp2;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.tmp3
	 * @return  the value of t_result_match_bk.tmp3
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public String getTmp3() {
		return tmp3;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.tmp3
	 * @param tmp3  the value for t_result_match_bk.tmp3
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setTmp3(String tmp3) {
		this.tmp3 = tmp3;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column t_result_match_bk.match_index
	 * @return  the value of t_result_match_bk.match_index
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getMatchIndex() {
		return matchIndex;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column t_result_match_bk.match_index
	 * @param matchIndex  the value for t_result_match_bk.match_index
	 * @abatorgenerated  Sat Apr 04 09:38:29 CST 2015
	 */
	public void setMatchIndex(Integer matchIndex) {
		this.matchIndex = matchIndex;
	}
}