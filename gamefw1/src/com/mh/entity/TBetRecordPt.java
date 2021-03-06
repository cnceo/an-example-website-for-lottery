package com.mh.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
@Table(name = "t_bet_record_pt")
public class TBetRecordPt {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.id
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// 自增长
	@Column(name = "id", nullable = false)
    private Integer id;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.web_flag
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "web_flag")
    private String webFlag;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.web_remark
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "web_remark")
    private String webRemark;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_user_name
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_user_name")
    private String betUserName;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_flat_account
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_flat_account")
    private String betFlatAccount;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_game_content
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_game_content")
    private String betGameContent;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_game_result
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_game_result")
    private String betGameResult;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_content
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_content")
    private String betContent;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_game_hall
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_game_hall")
    private String betGameHall;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_game_room
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_game_room")
    private String betGameRoom;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_game_table
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_game_table")
    private String betGameTable;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_game_code
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_game_code")
    private String betGameCode;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_Wagers_id
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_Wagers_id")
    private String betWagersId;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_in
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_in")
    private Double betIn;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_income
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_income")
    private Double betIncome;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_usr_win
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_usr_win")
    private Double betUsrWin;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_net_win
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_net_win")
    private Double betNetWin;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_time
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bet_time")
    private Date betTime;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_balance_after
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_balance_after")
    private Double betBalanceAfter;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.status
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "status")
    private Integer status;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.back_water
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "back_water")
    private String backWater;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.back_water_status
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "back_water_status")
    private Integer backWaterStatus;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.back_water_time
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "back_water_time")
    private Date backWaterTime;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.back_sys_user_name
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "back_sys_user_name")
    private String backSysUserName;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.create_time
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time")
    private Date createTime;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.modify_time
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modify_time")
    private Date modifyTime;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_login_ip
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_login_ip")
    private String betLoginIp;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.bet_user_agent
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "bet_user_agent")
    private String betUserAgent;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column t_bet_record_pt.is_water
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
	@Column(name = "is_water")
    private Integer isWater;
	
	@Transient
	private String beginTime;
	@Transient
	private String endTime;
	@Transient
	private Integer count;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.id
     *
     * @return the value of t_bet_record_pt.id
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.id
     *
     * @param id the value for t_bet_record_pt.id
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.web_flag
     *
     * @return the value of t_bet_record_pt.web_flag
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public String getWebFlag() {
        return webFlag;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.web_flag
     *
     * @param webFlag the value for t_bet_record_pt.web_flag
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setWebFlag(String webFlag) {
        this.webFlag = webFlag;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.web_remark
     *
     * @return the value of t_bet_record_pt.web_remark
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public String getWebRemark() {
        return webRemark;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.web_remark
     *
     * @param webRemark the value for t_bet_record_pt.web_remark
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setWebRemark(String webRemark) {
        this.webRemark = webRemark;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_user_name
     *
     * @return the value of t_bet_record_pt.bet_user_name
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public String getBetUserName() {
        return betUserName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_user_name
     *
     * @param betUserName the value for t_bet_record_pt.bet_user_name
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetUserName(String betUserName) {
        this.betUserName = betUserName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_flat_account
     *
     * @return the value of t_bet_record_pt.bet_flat_account
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public String getBetFlatAccount() {
        return betFlatAccount;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_flat_account
     *
     * @param betFlatAccount the value for t_bet_record_pt.bet_flat_account
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetFlatAccount(String betFlatAccount) {
        this.betFlatAccount = betFlatAccount;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_game_content
     *
     * @return the value of t_bet_record_pt.bet_game_content
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public String getBetGameContent() {
        return betGameContent;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_game_content
     *
     * @param betGameContent the value for t_bet_record_pt.bet_game_content
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetGameContent(String betGameContent) {
        this.betGameContent = betGameContent;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_game_result
     *
     * @return the value of t_bet_record_pt.bet_game_result
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public String getBetGameResult() {
        return betGameResult;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_game_result
     *
     * @param betGameResult the value for t_bet_record_pt.bet_game_result
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetGameResult(String betGameResult) {
        this.betGameResult = betGameResult;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_content
     *
     * @return the value of t_bet_record_pt.bet_content
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public String getBetContent() {
        return betContent;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_content
     *
     * @param betContent the value for t_bet_record_pt.bet_content
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetContent(String betContent) {
        this.betContent = betContent;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_game_hall
     *
     * @return the value of t_bet_record_pt.bet_game_hall
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public String getBetGameHall() {
        return betGameHall;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_game_hall
     *
     * @param betGameHall the value for t_bet_record_pt.bet_game_hall
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetGameHall(String betGameHall) {
        this.betGameHall = betGameHall;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_game_room
     *
     * @return the value of t_bet_record_pt.bet_game_room
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public String getBetGameRoom() {
        return betGameRoom;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_game_room
     *
     * @param betGameRoom the value for t_bet_record_pt.bet_game_room
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetGameRoom(String betGameRoom) {
        this.betGameRoom = betGameRoom;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_game_table
     *
     * @return the value of t_bet_record_pt.bet_game_table
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public String getBetGameTable() {
        return betGameTable;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_game_table
     *
     * @param betGameTable the value for t_bet_record_pt.bet_game_table
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetGameTable(String betGameTable) {
        this.betGameTable = betGameTable;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_game_code
     *
     * @return the value of t_bet_record_pt.bet_game_code
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public String getBetGameCode() {
        return betGameCode;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_game_code
     *
     * @param betGameCode the value for t_bet_record_pt.bet_game_code
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetGameCode(String betGameCode) {
        this.betGameCode = betGameCode;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_Wagers_id
     *
     * @return the value of t_bet_record_pt.bet_Wagers_id
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public String getBetWagersId() {
        return betWagersId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_Wagers_id
     *
     * @param betWagersId the value for t_bet_record_pt.bet_Wagers_id
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetWagersId(String betWagersId) {
        this.betWagersId = betWagersId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_in
     *
     * @return the value of t_bet_record_pt.bet_in
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public Double getBetIn() {
        return betIn;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_in
     *
     * @param betIn the value for t_bet_record_pt.bet_in
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetIn(Double betIn) {
        this.betIn = betIn;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_income
     *
     * @return the value of t_bet_record_pt.bet_income
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public Double getBetIncome() {
        return betIncome;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_income
     *
     * @param betIncome the value for t_bet_record_pt.bet_income
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetIncome(Double betIncome) {
        this.betIncome = betIncome;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_usr_win
     *
     * @return the value of t_bet_record_pt.bet_usr_win
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public Double getBetUsrWin() {
        return betUsrWin;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_usr_win
     *
     * @param betUsrWin the value for t_bet_record_pt.bet_usr_win
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetUsrWin(Double betUsrWin) {
        this.betUsrWin = betUsrWin;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_net_win
     *
     * @return the value of t_bet_record_pt.bet_net_win
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public Double getBetNetWin() {
        return betNetWin;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_net_win
     *
     * @param betNetWin the value for t_bet_record_pt.bet_net_win
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetNetWin(Double betNetWin) {
        this.betNetWin = betNetWin;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_time
     *
     * @return the value of t_bet_record_pt.bet_time
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public Date getBetTime() {
        return betTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_time
     *
     * @param betTime the value for t_bet_record_pt.bet_time
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetTime(Date betTime) {
        this.betTime = betTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_balance_after
     *
     * @return the value of t_bet_record_pt.bet_balance_after
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public Double getBetBalanceAfter() {
        return betBalanceAfter;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_balance_after
     *
     * @param betBalanceAfter the value for t_bet_record_pt.bet_balance_after
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetBalanceAfter(Double betBalanceAfter) {
        this.betBalanceAfter = betBalanceAfter;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.status
     *
     * @return the value of t_bet_record_pt.status
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.status
     *
     * @param status the value for t_bet_record_pt.status
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.back_water
     *
     * @return the value of t_bet_record_pt.back_water
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public String getBackWater() {
        return backWater;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.back_water
     *
     * @param backWater the value for t_bet_record_pt.back_water
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBackWater(String backWater) {
        this.backWater = backWater;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.back_water_status
     *
     * @return the value of t_bet_record_pt.back_water_status
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public Integer getBackWaterStatus() {
        return backWaterStatus;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.back_water_status
     *
     * @param backWaterStatus the value for t_bet_record_pt.back_water_status
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBackWaterStatus(Integer backWaterStatus) {
        this.backWaterStatus = backWaterStatus;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.back_water_time
     *
     * @return the value of t_bet_record_pt.back_water_time
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public Date getBackWaterTime() {
        return backWaterTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.back_water_time
     *
     * @param backWaterTime the value for t_bet_record_pt.back_water_time
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBackWaterTime(Date backWaterTime) {
        this.backWaterTime = backWaterTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.back_sys_user_name
     *
     * @return the value of t_bet_record_pt.back_sys_user_name
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public String getBackSysUserName() {
        return backSysUserName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.back_sys_user_name
     *
     * @param backSysUserName the value for t_bet_record_pt.back_sys_user_name
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBackSysUserName(String backSysUserName) {
        this.backSysUserName = backSysUserName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.create_time
     *
     * @return the value of t_bet_record_pt.create_time
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.create_time
     *
     * @param createTime the value for t_bet_record_pt.create_time
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.modify_time
     *
     * @return the value of t_bet_record_pt.modify_time
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.modify_time
     *
     * @param modifyTime the value for t_bet_record_pt.modify_time
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_login_ip
     *
     * @return the value of t_bet_record_pt.bet_login_ip
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public String getBetLoginIp() {
        return betLoginIp;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_login_ip
     *
     * @param betLoginIp the value for t_bet_record_pt.bet_login_ip
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetLoginIp(String betLoginIp) {
        this.betLoginIp = betLoginIp;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.bet_user_agent
     *
     * @return the value of t_bet_record_pt.bet_user_agent
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public String getBetUserAgent() {
        return betUserAgent;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.bet_user_agent
     *
     * @param betUserAgent the value for t_bet_record_pt.bet_user_agent
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setBetUserAgent(String betUserAgent) {
        this.betUserAgent = betUserAgent;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column t_bet_record_pt.is_water
     *
     * @return the value of t_bet_record_pt.is_water
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public Integer getIsWater() {
        return isWater;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column t_bet_record_pt.is_water
     *
     * @param isWater the value for t_bet_record_pt.is_water
     *
     * @abatorgenerated Mon Apr 18 17:00:47 CST 2016
     */
    public void setIsWater(Integer isWater) {
        this.isWater = isWater;
    }

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
    
    
}