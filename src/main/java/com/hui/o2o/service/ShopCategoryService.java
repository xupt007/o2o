package com.hui.o2o.service;

import java.util.List;

import com.hui.o2o.entity.ShopCategory;

public interface ShopCategoryService {

	/**
	 * 根据查询条件获取shopcategory列表
	 * 
	 * @param shopCategoryCondition
	 * @return
	 */
	List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);
}
