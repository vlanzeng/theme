package com.theme.carmaintain.common.bean;

import java.util.Map;
import com.theme.carmaintain.common.util.GlobalContext;

public class PageManager extends BaseBean {
    private static final long serialVersionUID = -7333606777664101156L;
    private int page = 1; // 当前页
    private int rows = GlobalContext.ROWS_DEFAULT;// 每页显示记录数
    private int rowsCount = 0;
    private int pageCount = 0;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getRowsCount() {
        return rowsCount;
    }

    public void setRowsCount(int rowsCount) {
        this.rowsCount = rowsCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void ProxyPage(Map<String, Object> msgback, PageManager _page) {
        msgback.put("currentPage", _page.getPage());
        msgback.put("pageRow", _page.getRows());
        msgback.put("totoalRow", _page.getRowsCount());
        msgback.put("totalPage", _page.getPageCount());
    }
}
