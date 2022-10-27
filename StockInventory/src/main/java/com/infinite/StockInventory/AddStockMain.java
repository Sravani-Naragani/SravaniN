package com.infinite.StockInventory;



	import java.sql.SQLException;
import java.util.Scanner;

	public class AddStockMain{
			
		public static void main(String[] args) {
			StockDAO stock = new StockDAO();
			StockDAO dao = new StockDAO();
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter ItemName");
			stock.se(sc.next());
			System.out.println("Enter price");
			stock.setPrice(sc.nextDouble());
			System.out.println("Enter QualityAvail");
			stock.setQualityAvail(sc.nextInt());
			
			try{
			
					System.out.println(new StockDAO.generatestockid());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		}

	}



