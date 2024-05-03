package ncs.test13;

import java.util.Date;

public class Inventory {
//필드 전역변수	
	private String productName; // 제품명
	private Date putDate; // 입고
	private Date getDate;// 출고
	private int putAmount; // 입고양
	private int getAmount; // 출고양
	private int inventoryAmount; // 남은갯수
	
//메서드
	//기본 생성자 ctrl Space
	public Inventory() {
		// TODO Auto-generated constructor stub
	}
	//필수 생성자 alt shift s o
	public Inventory(String productName, Date putDate, Date getDate, int putAmount, int getAmount,
			int inventoryAmount) {
		this.productName = productName;
		this.putDate = putDate;
		this.getDate = getDate;
		this.putAmount = putAmount;
		this.getAmount = getAmount;
		this.inventoryAmount = inventoryAmount;
	}

	//GetterSetter
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getPutDate() {
		return putDate;
	}
	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}
	public Date getGetDate() {
		return getDate;
	}
	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}
	public int getPutAmount() {
		return putAmount;
	}
	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}
	public int getGetAmount() {
		return getAmount;
	}
	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}
	public int getInventoryAmount() {
		return inventoryAmount;
	}
	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}

	
	//toString @Override alt shift s s 
	@Override
	public String toString() {
		return "Inventory [productName=" + productName + ", putDate=" + putDate + ", getDate=" + getDate
				+ ", putAmount=" + putAmount + ", getAmount=" + getAmount + ", inventoryAmount=" + inventoryAmount
				+ "]";
	}

}



