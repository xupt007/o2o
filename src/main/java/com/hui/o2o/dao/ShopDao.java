package com.hui.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hui.o2o.entity.Shop;
public interface ShopDao {
	/**
	 * 分页查询店铺，可输入的条件有:店铺名(模糊),店铺状态,区域Id,owner
	 * @param shopCondition 
	 * @param rowIndex 从第几行开始找数据
	 * @param pageSize 返回的条数
	 * @return
	 */
	
	/*List<Shop> queryShopList1(@Param("vo") ShopListVo vo, @Param("rowIndex") int rowIndex,
			@Param("pageSize") int pageSize);*/
	
	
	List<Shop> queryShopList(@Param("shopCondition") Shop shopCondition, @Param("rowIndex") int rowIndex,
			@Param("pageSize") int pageSize);
	
	/**
	 * 返回 queryShopList总数
	 * @param shopCondition
	 * @return
	 */
	int queryShopCount(@Param("shopCondition") Shop shopCondition);
	/**
	 * 通过shop id店铺查询
	 * 
	 * @param shopId
	 * @return shop
	 */
	Shop queryByShopId(long shopId);

	/**
	 * 新增店铺
	 * 
	 * @param shop
	 * @return 错误返回-1
	 */
	int insertShop(Shop shop);

	/**
	 * 更新店铺信息
	 * 
	 * @param shop
	 * @return
	 */
	int updateShop(Shop shop);
}
