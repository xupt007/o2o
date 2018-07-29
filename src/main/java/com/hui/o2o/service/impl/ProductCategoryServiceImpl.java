package com.hui.o2o.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hui.o2o.dao.ProductCategoryDao;
import com.hui.o2o.dao.ProductDao;
import com.hui.o2o.dto.ProductCategoryExecution;
import com.hui.o2o.entity.ProductCategory;
import com.hui.o2o.enums.ProductCategoryStateEnum;
import com.hui.o2o.exceptions.ProductCategoryOperationException;
import com.hui.o2o.service.ProductCategoryService;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{

	@Autowired
	private ProductCategoryDao productCategoryDao;
	
	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<ProductCategory> getProductCategoryList(long shopId) {
		return productCategoryDao.queryProductCategoryList(shopId);
	}

	@Override
	@Transactional
	public ProductCategoryExecution batchAddProductCategory(List<ProductCategory> productCategoryList)
			throws ProductCategoryOperationException {
		if(productCategoryList != null && productCategoryList.size() > 0) {
			try {
				int effectedNum = productCategoryDao.batchInsertProductCategory(productCategoryList);
				if(effectedNum <= 0) {
					throw new ProductCategoryOperationException("店铺类别创建失败");
				}else {
					return new ProductCategoryExecution(ProductCategoryStateEnum.SUCCESS);
				}
			} catch (Exception e) {
				throw new ProductCategoryOperationException("batchAddProductCategory error:" + e.getMessage());
			}
		}else {
			 return new ProductCategoryExecution(ProductCategoryStateEnum.EMPTY_LIST);
		}
	
	}

	@Override
	@Transactional
	public ProductCategoryExecution deleteProductCategory(long productCategroyId, long shopId)
			throws ProductCategoryOperationException {
		//接触tb_ptoduct里的商品与该productCategroyId的关联
		try {
			int effectedNum = productDao.updateProductCategoryTonull(productCategroyId);
			if(effectedNum < 0) {
				throw new ProductCategoryOperationException("商品类别更新失败");
			}
		} catch (Exception e) {
			throw new ProductCategoryOperationException("deleteProductCategory error:" + e.getMessage());
		}
		//删除该productCategroy
		try {
			int effectedNum = productCategoryDao.deleteProductCategory(productCategroyId, shopId);
			if(effectedNum <= 0) {
				throw new ProductCategoryOperationException("商品类别删除失败");
			}else {
				return new ProductCategoryExecution(ProductCategoryStateEnum.SUCCESS);
			}
		} catch (Exception e) {
			throw new ProductCategoryOperationException("deleteProductCategory error:" + e.getMessage());
		}
	}

}
