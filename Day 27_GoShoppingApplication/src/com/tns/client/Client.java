package com.tns.client;

import com.tns.Application.GSNormalAcc;
import com.tns.Application.GSPrimeAcc;
import com.tns.Application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
ShopFactory s=new GSShopFactory();
PrimeAcc p=new GSPrimeAcc(100,"Nam",1000,true);
NormalAcc n=new GSNormalAcc(101,"Sam",500,50);
System.out.println("Prime Account");
p.bookProduct(p.getCharge());
System.out.println("Normal Account");
n.bookProduct(n.getCharges());

System.out.println(p);
System.out.println(n);

	}
	}


