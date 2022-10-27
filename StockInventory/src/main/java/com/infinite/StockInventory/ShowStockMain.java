package com.infinite.StockInventory;

import java.sql.SQLException;
import java.util.List;

public class ShowStockMain {
	public static void main(String[] args) {
		StockDAO dao = new StockDAO();
		//List<Stock> StockList;
		try {
			List<Stock> StockList = dao.showstock();
			for (Stock stock : StockList) {
				System.out.println(stock);
					
				}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
	

}