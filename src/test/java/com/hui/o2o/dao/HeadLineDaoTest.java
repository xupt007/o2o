package com.hui.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hui.o2o.BaseTest;
import com.hui.o2o.entity.HeadLine;

public class HeadLineDaoTest extends BaseTest{

	@Autowired
	private HeadLineDao headLineDao;
	
	@Test
	public void testQueryArea() {
		List<HeadLine> headLine = headLineDao.queryHeadLine(new HeadLine());
		assertEquals(2, headLine.size());
	}
}
