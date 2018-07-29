package com.hui.o2o.dao;


import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hui.o2o.BaseTest;
import com.hui.o2o.entity.ShopCategory;

public class ShopCategoryDaoTest extends BaseTest{

	@Autowired
	private ShopCategoryDao shopCategoryDao;
	
	@Test
	public void testQueryArea() {
		List<ShopCategory> shopCategoryList = shopCategoryDao.queryShopCategory(null);
		
		System.out.println(shopCategoryList.size());
	}
}
