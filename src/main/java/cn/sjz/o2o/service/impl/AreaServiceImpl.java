package cn.sjz.o2o.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sjz.o2o.dao.AreaDao;
import cn.sjz.o2o.entity.Area;
import cn.sjz.o2o.service.AreaService;
@Service	
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaDao areaDao;
	@Override
	public List<Area> getAreaList(){
		return areaDao.queryArea();
	} 
}
