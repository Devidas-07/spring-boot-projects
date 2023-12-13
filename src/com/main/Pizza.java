package com.main;

public class Pizza {
	private int basePizzaPrice;
	private int billPrice;
	private Boolean veg;
	private int extraCheesePrice=100;
	private int extraToppingsPrice=100;
	private int takeAwayPrice=20;
	private Boolean isExtraCheeseAdded=false;
	private Boolean isExtraToppingsAdded=false;
	private Boolean isBackPackAdded=false;
	public Pizza(Boolean veg) {
		super();
		this.veg = veg;
		if(this.veg) {
			this.basePizzaPrice=300;
		}else {
			this.basePizzaPrice=400;
		}
		billPrice+=basePizzaPrice;
		
	}
	public void addExtraCheese() {
		isExtraCheeseAdded=true;
		this.billPrice+=extraCheesePrice;
	}
	public void addExtraToppings() {
		isExtraToppingsAdded=true;
		this.billPrice+=extraToppingsPrice;
	}
	public void takeAway() {
		isBackPackAdded=true;
		this.billPrice+=takeAwayPrice;
	}
	public void getBill() {
		String bill = "";
		System.out.println("Pizza Base price: "+ basePizzaPrice);
		if(isExtraCheeseAdded) {
			bill = bill + "Extra Cheese Added: "+extraCheesePrice+"\n";
		}
		if(isExtraToppingsAdded) {
			bill = bill + "Extra Toppings Added: "+extraToppingsPrice+"\n";
		}
		if(isBackPackAdded) {
			bill = bill + "Take Away Opted: "+takeAwayPrice+"\n";
		}
		bill = bill + "Bill: "+this.billPrice+"\n";
		System.out.println(bill);
	}
	
	
}
