package com.theme.carmaintain.handle.modules.test.bean;

import com.theme.carmaintain.common.bean.BaseBean;

public class Area extends BaseBean implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String areaCode;   /*中华人民共和国区/县行政编码*/
	private String cityCode;   /*中华人民共和国市级行政编码*/
	private String areaName;   /*中华人民共和国区/县行政名称*/
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAreaCode(){
		return areaCode;
	}
	
	public void setAreaCode(String areaCode){
		this.areaCode = areaCode;
	}
	public String getCityCode(){
		return cityCode;
	}
	
	public void setCityCode(String cityCode){
		this.cityCode = cityCode;
	}
	public String getAreaName(){
		return areaName;
	}
	
	public void setAreaName(String areaName){
		this.areaName = areaName;
	}
	
}