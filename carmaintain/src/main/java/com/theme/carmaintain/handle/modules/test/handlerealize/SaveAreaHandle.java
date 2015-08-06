package com.theme.carmaintain.handle.modules.test.handlerealize;

import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;

import com.theme.carmaintain.common.handle.IHandle;
import com.theme.carmaintain.handle.modules.test.bean.Area;
import com.theme.carmaintain.handle.modules.test.service.IAreaService;

public class SaveAreaHandle implements  IHandle{
	@Resource(name="areaService")
	private IAreaService  areaService;
	@SuppressWarnings("rawtypes")
	@Override
	public boolean receiveMessage(Map<String, Object> msgback, Object obj,Map headermap) {
		Random  random =new Random(47);
		Area area=new Area();
		area.setAreaCode("112322123dsa12asd23322f"+random.nextInt(123213213));
		area.setAreaName("长青");
		area.setCityCode("无赖");
		areaService.saveArea(area);
		msgback.put("code", "操作成功");
		return true;
		
	}

}
