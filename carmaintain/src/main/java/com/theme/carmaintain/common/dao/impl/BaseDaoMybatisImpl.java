package com.theme.carmaintain.common.dao.impl;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import com.theme.carmaintain.common.dao.IBaseDao;
import com.theme.carmaintain.common.bean.PageManager;
import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings({"rawtypes","unchecked"})
public class BaseDaoMybatisImpl<T> implements IBaseDao<T>{
    private Logger  logger = Logger.getLogger(BaseDaoMybatisImpl.class);
	
	@Autowired
	protected SqlSessionTemplate template;
	
	public Integer save(T o){
		return template.insert(getNameSpace(o)+".insert", o);
	}
	
	public Integer update(T o){
		return template.update(getNameSpace(o)+".update", o);
	} 
	
	public Integer delete(T o){
		return template.delete(getNameSpace(o)+".delete", o);
	}
	
	public Integer deleteById(T o){
        return template.delete(getNameSpace(o)+".deleteById", o);
    }
	
	public List<T> queryAll(T o){
		List<T> list = template.selectList(getNameSpace(o)+".query", o);
		return list;
	}
	
	public Map<String,Object> queryByPage(T o,PageManager page){
		PageManager page_ = new PageManager();
		page_.setRows(page.getRows());
		//查询行数
		Integer rowsCount = template.selectOne(getNameSpace(o)+".queryCount",o);
		page_.setRowsCount(rowsCount);
				
		//计算页数  page.getRows()获得每页显示条数，系统中固定值
		Integer pageCount = rowsCount/page.getRows() ;
		if(rowsCount%page.getRows() > 0){
			pageCount++;
		}
		//如果传过来的当前页码大于总页码  则把当前页码设置为最大页码
		if(page.getPage() > pageCount && pageCount != 0){
			page.setPage(pageCount);
		}
		
		//将页面传过来的当前页传回到前台
		page_.setPage(page.getPage());
		
		List<T> list = template.selectList(getNameSpace(o)+".query",o,new RowBounds((page.getPage()-1)*page.getRows(), page.getRows()));
		
		page_.setPageCount(pageCount);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("list", list);
		map.put("page", page_);
		
		return map;
	}
	
	/***
     * 分页查询
     * @author Administrator
     * @creaetime 2014年8月1日 下午3:54:41
     * @param o 实体bean
     * @param page 分页类page
     * @param statement  查询语句的的id 如：.query
     * @param countStatement 查询总记录数的id 如：.queryCount
     * @return
     */
    public Map<String,Object> queryByPage(T o,PageManager page,String statement,String countStatement){
        PageManager page_ = new PageManager();
        //设置每页显示条目数
        page_.setRows(page.getRows());
        //查询行数
        Integer rowsCount = template.selectOne(getNameSpace(o)+countStatement,o);
        page_.setRowsCount(rowsCount);
                
        //计算页数  page.getRows()获得每页显示条数，系统中固定值
        Integer pageCount = rowsCount/page.getRows() ;
        if(rowsCount%page.getRows() > 0){
            pageCount++;
        }
        //如果传过来的当前页码大于总页码  则把当前页码设置为最大页码
        if(page.getPage() > pageCount && pageCount != 0){
            page.setPage(pageCount);
        }
        
        //将页面传过来的当前页传回到前台
        page_.setPage(page.getPage());
        
        List<T> list = template.selectList(getNameSpace(o)+statement,o,new RowBounds((page.getPage()-1)*page.getRows(), page.getRows()));
        
        page_.setPageCount(pageCount);
        
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("page", page_);
        
        return map;
    }
    
	
	public Map<String, Object> mobileQueryByPage(T o, PageManager page) {
        // PageManager page_ = new PageManager();
         // 查询行数
         Integer rowsCount = template.selectOne(getNameSpace(o) + ".queryCount", o);
         page.setRowsCount(rowsCount);
         Map<String, Object> map = new HashMap<String, Object>();
         // 计算页数 page.getRows()获得每页显示条数，系统中固定值
         Integer pageCount = rowsCount / page.getRows();
         if ( rowsCount % page.getRows() > 0 ) {
             pageCount++;
         }
         //当前页超出最大页数，设置其查不到数据
         if ( page.getPage() > pageCount && pageCount != 0 ) {
             logger.warn("当前页面超过最大页码值，系统无法查询到任何数据");
             page.setPageCount(pageCount);
             map.put("list", new ArrayList());
         }else{
             // 将页面传过来的当前页传回到前台
             page.setPage(page.getPage());

             List<T> list = template.selectList(getNameSpace(o) + ".query", o,
                 new RowBounds((page.getPage() - 1) * page.getRows(), page.getRows()));
             page.setPageCount(pageCount);
             map.put("list", list);
         }
         map.put("page", page);
         return map;
     }
	

	public T get(T o){
		return (T)template.selectOne(getNameSpace(o)+".query", o);
	}
	
	public Long getCount(T o){
		return template.selectOne(getNameSpace(o)+".count",o);
	}
	
	public Integer deleteByIds(T o){
		return template.delete(getNameSpace(o)+".deleteByIds", o);
	}
	
	private String getNameSpace(T o){
		return getClassName(o);
	}
	
	
	private String getClassName(T o){
		Object obj = (Object)o;
		Class<T> cls = (Class<T>) obj.getClass();
		return cls.getName();
	}
	
}
