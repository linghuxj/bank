package com.bank.www.entity;

import java.sql.Timestamp;

public class UserAccounts {
	private Integer id;
	private String userName;// 用户名称
	private String no;// 卡号
	private Integer state;// 状态 1--正常 2--挂失 0--销户
	private Long accountAmout;// 用户账户活期余额
	private Timestamp amountTime;// 用户账户活期余额利率最后计算时间

	public UserAccounts() {
		super();
	}

	public UserAccounts(Integer id, String userName, String no, Integer state, Long accountAmout, Timestamp amountTime) {
		super();
		this.id = id;
		this.userName = userName;
		this.no = no;
		this.state = state;
		this.accountAmout = accountAmout;
		this.amountTime = amountTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Long getAccountAmout() {
		return accountAmout;
	}

	public void setAccountAmout(Long accountAmout) {
		this.accountAmout = accountAmout;
	}

	public Timestamp getAmountTime() {
		return amountTime;
	}

	public void setAmountTime(Timestamp amountTime) {
		this.amountTime = amountTime;
	}

}
