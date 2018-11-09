package com.smart.garas.dto;

public class SubMenuDto {

	private Long 	menuId;
	private String 	menuName;
	private	String	menu;		//get from MenuStatus.java
	
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
	
	@Override
	public String toString() {
		return "SubMenuDto [menuId=" + menuId + ", menuName=" + menuName + ", menu=" + menu + "]";
	}
}
