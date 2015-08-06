package com.theme.carmaintain.common.dao;

import java.util.List;
import java.util.Map;
import com.theme.carmaintain.common.bean.PageManager;

public interface IBaseDao<T> {
    Integer save(T o);
    public Integer update(T o);
    public Integer delete(T o);
    public List<T> queryAll(T o);
    public Map<String, Object> queryByPage(T o, PageManager page);
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
    public Map<String,Object> queryByPage(T o,PageManager page,String statement,String countStatement);

    public T get(T o);

    public Long getCount(T o);

    public Integer deleteByIds(T o);

    public Integer deleteById(T o);

}
