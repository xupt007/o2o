package com.hui.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hui.o2o.BaseTest;
import com.hui.o2o.entity.Area;
import com.hui.o2o.entity.PersonInfo;
import com.hui.o2o.entity.Shop;
import com.hui.o2o.entity.ShopCategory;

public class ShopDaoTest extends BaseTest {
	
	@Autowired
	private ShopDao shopdao;
	
	@Test
	public void testQueryShopListAndCount() {
		Shop shopCondition = new Shop();
		ShopCategory childCategory = new ShopCategory();
		ShopCategory parentCategory = new ShopCategory();
		parentCategory.setShopCategoryId(2L);
		childCategory.setParent(parentCategory);
		shopCondition.setShopCategory(childCategory);
		List<Shop> shopList = shopdao.queryShopList(shopCondition, 0, 6);
		int count = shopdao.queryShopCount(shopCondition);
		System.out.println("店铺列表的大小：" + shopList.size());
		System.out.println("店铺总数：" + count);
	}
	@Test
	@Ignore
	public void testQueryByShopId() {
		long shopId = 1;
		Shop shop = shopdao.queryByShopId(shopId);
		System.out.println("areaId:" + shop.getArea().getAreaId());
		System.out.println("areaName:" + shop.getArea().getAreaName());
	}
	
	@Test
	@Ignore
	public void testInsertShop() {
		Shop shop=new Shop();
		PersonInfo owner=new PersonInfo();
		Area area=new Area();
		ShopCategory shopCateGory=new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(2);
		shopCateGory.setShopCategoryId(1L);
		shop.setOwner(owner);
		shop.setArea(area);
		shop.setShopCategory(shopCateGory);
		shop.setShopName("测试店铺");
		shop.setShopDesc("test");
		shop.setShopAddr("tset");
		shop.setPhone("test");
		shop.setShopImg("test");
		shop.setCreateTime(new Date());
		shop.setEnableStatus(1);
		shop.setAdvice("审核中");
		int effectedNums = shopdao.insertShop(shop);
		assertEquals(1, effectedNums);
		
		
	}
	@Test
	@Ignore
	public void testupdateShop() {
		Shop shop=new Shop();
		shop.setShopId(1L);;
		shop.setShopDesc("测试描述");
		shop.setShopAddr("测试地址");
		shop.setPhone("test");
		shop.setShopImg("test");
		shop.setCreateTime(new Date());
		shop.setEnableStatus(1);
		shop.setAdvice("审核中");
		int effectedNums = shopdao.updateShop(shop);
		assertEquals(1, effectedNums);
		
	}

}
