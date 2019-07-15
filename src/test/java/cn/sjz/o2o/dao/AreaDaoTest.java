package cn.sjz.o2o.dao;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.sjz.o2o.BaseTest;
import cn.sjz.o2o.entity.Area;

public class AreaDaoTest extends BaseTest{
	@Autowired
	private AreaDao areaDao;
	@Test
	public void testQuery() {
		List<Area> list = areaDao.queryArea();
		assertEquals(2, list.size());
	}
}
