package com.infinite.StockInventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.infinite.JdbcBank.ConnectionHepler;


public class StockDAO {
	
	Connection connection;
	PreparedStatement pst;

	public int AddStock(Stock stock) 
			throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select  max(stockId) from stock";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		String stockId = rs.getString("id");
		int id= Integer.parseInt("id");
		id++;
		String stockid = String.format("S%03d",id);
		return id;
	}
	public int generateAccountNo() 
			throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select case when max() is NULL"
				+ " then 1 else max(accountNo)+1 end accno "
				+ "from Bank";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int accno = rs.getInt("accno");
		return id;
	}
	public Stock searchStock(String StockId) 
			throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from stock where StockId=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, StockId);
		ResultSet rs = pst.executeQuery();
		Stock stock = null;
		if(rs.next()) {
			stock = new Stock();
			stock.setStockId(rs.getString("StockId"));
			stock.setItemName(rs.getString("ItemName"));
			stock.setPrice(rs.getInt("price"));
			stock.setQualityAvail(rs.getInt("QuantityAvail"));
			
		return stock;
	}
		return stock;
	}
	public List<Stock> showstock() throws ClassNotFoundException, SQLException {
		List<Stock> stockList = new ArrayList<Stock>();
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from stock";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Stock stock = null;
		while(rs.next()){
			stock = new Stock();
			stock.setStockId(rs.getString("StockId"));
			stock.setItemName(rs.getString("ItemName"));
			stock.setPrice(rs.getInt("price"));
			stock.setQualityAvail(rs.getInt("QuantityAvail"));
			stockList.add(stock);
		}
		
		// TODO Auto-generated method stub
		return stockList;
	}}