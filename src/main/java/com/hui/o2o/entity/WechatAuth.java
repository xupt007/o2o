package com.hui.o2o.entity;

import java.io.Serializable;
import java.util.Date;

public class WechatAuth implements Serializable {
	
	private static final long serialVersionUID = -6867282079107107069L;
	private Long wechatAuth;
	private String openId;
	private Date createTime;
	private PersonInfo personInfo;
	public Long getWechatAuth() {
		return wechatAuth;
	}
	public void setWechatAuth(Long wechatAuth) {
		this.wechatAuth = wechatAuth;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public PersonInfo getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}
	
}
