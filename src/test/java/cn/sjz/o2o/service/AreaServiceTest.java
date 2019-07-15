package cn.sjz.o2o.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.sjz.o2o.BaseTest;
import cn.sjz.o2o.entity.Area;

public class AreaServiceTest extends BaseTest {
	@Autowired
	private AreaService areaService ;
	@Test
	public void testGetList() {
		List<Area> list = areaService.getAreaList();
		assertEquals("ݸܰ", list.get(0).getAreaName());
	}
}
