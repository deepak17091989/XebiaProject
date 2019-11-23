package com.retail.businesslogic;

import com.retail.user.User;

public class CalDiscountImpl implements CalDiscount{

	@Override
	public double calculateDiscount(User user) {
		// TODO Auto-generated method stub
		int billAmount=user.getBill().getBillAmount();
		double discount=0;
		if(!(user.getBill().getBillType().equals("Grocery"))) {
			if(user.getUserType().equalsIgnoreCase("employee"))
				{
				 discount=0.3*billAmount;
				}
				else if(user.getUserType().equalsIgnoreCase("affiliate"))
				{
					discount=0.1*billAmount;
				}
				else if(user.getUserType().equalsIgnoreCase("customer") && user.getYearOfAssoc()>2)
				{
					discount=0.05*billAmount;
				}
		}
		discount=spendsDiscount(billAmount)+discount;
		return discount;
	}
	private int spendsDiscount(int billAmount) {
		return 5*(billAmount/100);
		
	}
}
