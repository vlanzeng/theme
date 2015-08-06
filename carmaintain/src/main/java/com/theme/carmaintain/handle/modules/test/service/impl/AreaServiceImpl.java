package com.theme.carmaintain.handle.modules.test.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import com.theme.carmaintain.handle.modules.test.bean.Area;
import com.theme.carmaintain.handle.modules.test.dao.IAreaDao;
import com.theme.carmaintain.handle.modules.test.service.IAreaService;

@Repository(value="areaService")
public class AreaServiceImpl implements IAreaService{
    @Resource(name="areaDao")
	private IAreaDao  areaDao;
    
	@Override
	public void saveArea(Area area) {
		areaDao.save(area);
	}

}
