package com.smart.garas.dto;

public class SubMenuDto {

	private Long 	menuId;
	private String 	menuName;
	private String	menuValue;
	private	String	menu;		//get from MenuStatus.java
	private String 	enable;		//get from table tblMenuAssign
	
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	public String getMenuValue() {
		return menuValue;
	}
	public void setMenuValue(String menuValue) {
		this.menuValue = menuValue;
	}
	@Override
	public String toString() {
		return "SubMenuDto [menuId=" + menuId + ", menuName=" + menuName + ", menuValue=" + menuValue + ", menu=" + menu
				+ ", enable=" + enable + "]";
	}
	
}
