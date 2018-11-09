package com.smart.garas.dto;

public class UnitDto {
	private String autoNum;
	private String unitCode;
	private String unitName;
	private int unitAsLitterOrCan;
	private String unitType;
	
	public String getAutoNum() {
		return autoNum;
	}
	public void setAutoNum(String autoNum) {
		this.autoNum = autoNum;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public int getUnitAsLitterOrCan() {
		return unitAsLitterOrCan;
	}
	public void setUnitAsLitterOrCan(int unitAsLitterOrCan) {
		this.unitAsLitterOrCan = unitAsLitterOrCan;
	}
	public String getUnitType() {
		return unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UnitDto [autoNum=" + autoNum + ", unitCode=" + unitCode + ", unitName=" + unitName
				+ ", unitAsLitterOrCan=" + unitAsLitterOrCan + ", unitType=" + unitType + "]";
	}
	
}
