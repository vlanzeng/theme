package com.theme.carmaintain.handle.modules.servletcart.bean;

public class ShopCart {
	private  Integer id;
	private  String ShopName;
	private  int    nums;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	
}
