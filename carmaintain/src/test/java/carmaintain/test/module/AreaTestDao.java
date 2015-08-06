package carmaintain.test.module;

import java.util.List;
import java.util.Map;
import org.junit.Test;
import javax.annotation.Resource;
import carmaintain.test.common.BaseSpringTest;
import com.theme.carmaintain.common.bean.PageManager;
import com.theme.carmaintain.handle.modules.test.bean.Area;
import com.theme.carmaintain.handle.modules.test.dao.IAreaDao;

public class AreaTestDao extends BaseSpringTest{
	
	@Resource(name="areaDao")
	private IAreaDao  areaDao;
	
	@Test
	public void testSaveArea(){
		Area area =new Area();
		area.setAreaCode("hello");
		area.setCityCode("city");
		area.setAreaName("九节棍");
		areaDao.save(area);
	}
	
	@SuppressWarnings("unused")
	@Test
	public void testGetArea(){
		Area area =new Area();
		List<Area> map=areaDao.queryAll(area);
	    System.out.println("=====");	
	}
	
	@SuppressWarnings({ "rawtypes", "unused" })
	@Test
	public void testGetAreaMap(){
		Area area =new Area();
		PageManager  pm =new PageManager();
		pm.setPage(1);
		pm.setRows(4);
		Map map=areaDao.queryByPage(area, pm);
	    System.out.println("=====");	
	}
	
}
