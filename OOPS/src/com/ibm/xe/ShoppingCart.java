package com.ibm.xe;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {
	private double cartTotal;
	private ArrayList<Product> items;
	private int idx;

	private HashMap<String, Integer> Coupons;//{{"HOLI200","200"},{"WKND100","100"},{"APRIL150","150"}};
	
	public ShoppingCart() {
		items=new ArrayList<Product>();
		Coupons= new HashMap<String ,Integer>();
		Coupons.put("HOLI200", 200);
		Coupons.put("WKND100",100);
		Coupons.put("APRIL150", 150);
		
	}
	
	
	public void addProduct(Product p)throws OutOfStockException,CartInvalidException {
		if(p.getStock()>0) {
			items.add(p);
			p.setStock(p.getStock()-1);
			System.out.println("****"+p.getStock());
			cartTotal+=p.getPrice();
		}else {
			throw new OutOfStockException("Product is out of stock");
		}
	}
	public void checkOut(Payment pmt,String code) throws PaymentException, CartInvalidException{
		if(pmt.getBalance()>=cartTotal) {
		if(items.size()==0) {
			throw new CartInvalidException("cart is empty");
		}else {
			System.out.println("Items in cart are:");
		for(int i=0;i<items.size();i++) {
			System.out.println("***");
			System.out.println(items.get(i).getName()+"\t"+items.get(i).getPrice());
		}
			
		int discount=Coupons.get(code);
		if(cartTotal>discount) {
			cartTotal-=discount;
		}
		else {
			System.out.println("Coupon cant be applied");
		}
		
			System.out.println("Your cart Total is:"+cartTotal);
			System.out.println("Checking you out");
		System.out.println("Total price is:"+(pmt.getBalance()-cartTotal));
		}}else {
			throw new PaymentException("Payment failed");
		}
//		int sum=0;
//		for(int i=0;i<items.length;i++) {
//			sum+=items[i].getPrice();
//		}
		
		
	}
}
