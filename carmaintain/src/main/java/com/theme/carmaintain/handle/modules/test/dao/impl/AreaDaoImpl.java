package com.theme.carmaintain.handle.modules.test.dao.impl;

import org.springframework.stereotype.Repository;
import com.theme.carmaintain.handle.modules.test.bean.Area;
import com.theme.carmaintain.handle.modules.test.dao.IAreaDao;
import com.theme.carmaintain.common.dao.impl.BaseDaoMybatisImpl;

@Repository(value="areaDao")
public class AreaDaoImpl extends  BaseDaoMybatisImpl<Area> implements IAreaDao{
	
}
