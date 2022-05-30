package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;
 
public class Client {

	public static void main(String[] args) {
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(100,"Nam",500,true);
		CurrentAcc c=new MMCurrentAcc(101,"kim",500,50);
	System.out.println("Savings Account");
	s.withdraw(s.getAccBal1());
	System.out.println("Current Account");
	c.withdraw(c.getAccBal());
	
	System.out.println(s);
	System.out.println(c);

	}

}
