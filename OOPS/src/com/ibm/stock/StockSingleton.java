package com.ibm.stock;

public class StockSingleton {
	
	private static Stock sk;
	private StockSingleton() {
		// TODO Auto-generated constructor stub
		sk=null;
	}
	
	public static Stock getStock() {
		if(sk==null) {
			sk= new Stock();
			System.out.println("****");
		}
		return sk;
	}
}
