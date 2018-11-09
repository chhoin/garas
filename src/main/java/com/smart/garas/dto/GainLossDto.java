package com.smart.garas.dto;

import java.util.Date;

public class GainLossDto {
	
	private String product_NAME;
	private String ccy;
	private String amout_FCY;
	private String amout_LCY;
	
	private Date  p_DATE_FROM;
	private Date p_DATE_TO;
	
	
	public String getProduct_NAME() {
		return product_NAME;
	}
	public void setProduct_NAME(String product_NAME) {
		this.product_NAME = product_NAME;
	}
	public String getCcy() {
		return ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}
	public String getAmout_FCY() {
		return amout_FCY;
	}
	public void setAmout_FCY(String amout_FCY) {
		this.amout_FCY = amout_FCY;
	}
	public String getAmout_LCY() {
		return amout_LCY;
	}
	public void setAmout_LCY(String amout_LCY) {
		this.amout_LCY = amout_LCY;
	}
	public Date getP_DATE_FROM() {
		return p_DATE_FROM;
	}
	public void setP_DATE_FROM(Date p_DATE_FROM) {
		this.p_DATE_FROM = p_DATE_FROM;
	}
	public Date getP_DATE_TO() {
		return p_DATE_TO;
	}
	public void setP_DATE_TO(Date p_DATE_TO) {
		this.p_DATE_TO = p_DATE_TO;
	}
	
	@Override
	public String toString() {
		return "GainLossDto [product_NAME=" + product_NAME + ", ccy=" + ccy + ", amout_FCY=" + amout_FCY
				+ ", amout_LCY=" + amout_LCY + ", p_DATE_FROM=" + p_DATE_FROM + ", p_DATE_TO=" + p_DATE_TO + "]";
	}
}