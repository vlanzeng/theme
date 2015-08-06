package com.theme.carmaintain.common.interceptor;


public class OracleDialect extends Dialect {

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.mybatis.extend.interceptor.IDialect#getLimitString(java.lang.String,
     * int, int)
     */
    @Override
    public String getLimitString(String sql, int offset, int limit) {
        
        String sqlTrim = sql.trim();
        StringBuffer pagingSelect = new StringBuffer(sqlTrim.length() + 100);

        pagingSelect.append("select * from ( select row_.*, rownum rownum_ from ( ");

        pagingSelect.append(sqlTrim);

        pagingSelect.append(" ) row_ ) where rownum_ > ").append(offset).append(" and rownum_ <= ")
                .append(offset + limit);

        return pagingSelect.toString();
    }

}
