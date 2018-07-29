package com.hui.o2o.vo;

import java.io.Serializable;

public class ShopListVo implements Serializable{
	
	private static final long serialVersionUID = -8649713935412799262L;
	private Long shopCategoryId;
	private Long parentShopCategoryId;
	private Long areaId;
	private String shopName;
	private Integer enableStatus;
	private Integer ownerUserId;
	
	
	
	public Long getShopCategoryId() {
		return shopCategoryId;
	}
	public void setShopCategoryId(Long shopCategoryId) {
		this.shopCategoryId = shopCategoryId;
	}
	public Long getParentShopCategoryId() {
		return parentShopCategoryId;
	}
	public void setParentShopCategoryId(Long parentShopCategoryId) {
		this.parentShopCategoryId = parentShopCategoryId;
	}
	public Long getAreaId() {
		return areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public Integer getEnableStatus() {
		return enableStatus;
	}
	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}
	public Integer getOwnerUserId() {
		return ownerUserId;
	}
	public void setOwnerUserId(Integer ownerUserId) {
		this.ownerUserId = ownerUserId;
	}
	
	
	
	

}
