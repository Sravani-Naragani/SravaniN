package com.infinite.StockInventory;

public class Stock {
	
	private String stockId;
	private String ItemName;
	private int price;
	private int QualityAvail;
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", ItemName=" + ItemName + ", price=" + price + ", QualityAvail="
				+ QualityAvail + "]";
	}
	public Stock() {
		
		// TODO Auto-generated constructor stub
	}
	public Stock(String stockId, String itemName, int price, int qualityAvail) {
		
		this.stockId = stockId;
		ItemName = itemName;
		this.price = price;
		QualityAvail = qualityAvail;
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQualityAvail() {
		return QualityAvail;
	}
	public void setQualityAvail(int qualityAvail) {
		QualityAvail = qualityAvail;
	}
	

}
