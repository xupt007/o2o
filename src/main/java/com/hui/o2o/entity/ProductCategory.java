package com.hui.o2o.entity;

import java.io.Serializable;
import java.util.Date;

public class ProductCategory implements Serializable {

	private static final long serialVersionUID = 5321258263627509905L;
	private Long productCategroyId;
	private Long shopId;
	private String productCategoryName;
	private Integer priority;
	private Date createTime;

	public Long getProductCategroyId() {
		return productCategroyId;
	}

	public void setProductCategroyId(Long productCategroyId) {
		this.productCategroyId = productCategroyId;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "ProductCategory [productCategroyId=" + productCategroyId + ", shopId=" + shopId
				+ ", productCategoryName=" + productCategoryName + ", priority=" + priority + ", createTime="
				+ createTime + "]";
	}

}
