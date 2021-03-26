package com.ibm.xe;

public class ShoppingCart {
	private double cartTotal;
	private Product[] items;
	private int idx;

	String[][] Coupons= {{"HOLI200","200"},{"WKND100","100"},{"APRIL150","150"}};
	public ShoppingCart() {
		items=new Product[5];
	}
	
	
	public void addProduct(Product p)throws OutOfStockException,CartInvalidException {
		if(p.getStock()>0) {
		if(idx<items.length) {
			items[idx++]=p;
			p.setStock(p.getStock()-1);
			System.out.println("****"+p.getStock());
			cartTotal+=p.getPrice();
		}else {
			throw new CartInvalidException("Cart is full.Item can't be added");
		}}else {
			throw new OutOfStockException("Product is out of stock");
		}
	}
	public void checkOut(Payment pmt,String code) throws PaymentException, CartInvalidException{
		if(pmt.getBalance()>=cartTotal) {
		if(idx==0) {
			throw new CartInvalidException("cart is empty");
		}else {
			System.out.println("Items in cart are:");
		for(int i=0;i<idx;i++) {
			System.out.println("***");
			System.out.println(items[i].getName()+"\t"+items[i].getPrice());
		}
			for(int i=0;i<Coupons.length;i++) {
				
					if(code.equals(Coupons[i][0])) {
					//	System.out.println("%%%%"+Coupons[i][1]);
						if(cartTotal>Integer.parseInt(Coupons[i][1]))
						{
							cartTotal-=Integer.parseInt(Coupons[i][1]);
							//cartTotal-=0;
							
						}
						else {
							System.out.println("Coupon cant be applied");
						}
					}
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
