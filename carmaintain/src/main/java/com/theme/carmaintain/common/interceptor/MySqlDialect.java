package com.theme.carmaintain.common.interceptor;

public class MySqlDialect extends Dialect {

    @Override
    public String getLimitString(String sql, int offset, int limit) {
        StringBuffer sb = new StringBuffer();
        sb.append(sql.trim());
        sb.append(" limit " + offset);
        sb.append(", " + limit);
        return sb.toString();
    }

}
