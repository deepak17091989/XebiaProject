package com.retail.run;

import com.retail.bill.Bill;
import com.retail.businesslogic.CalDiscountImpl;
import com.retail.user.User;

public class RunLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		Bill bill=new Bill();
		bill.setBillAmount(2000);
		bill.setBillType("Service");
		user.setBill(bill);
		user.setUserType("affiliate");
		user.setYearOfAssoc(10);
		System.out.println(new CalDiscountImpl().calculateDiscount(user));
	}

}
