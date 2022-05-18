package com.main;

import com.model.Coin;
import com.model.PaperMoney;
import com.model.Wallet;
import com.service.WalletWorksImpl;
import com.service.WalletWorksInterface;

public class WalletMain {

	public static void main(String[] args) {
		Coin coin1 = new Coin(1, 2005);
		Coin coin2 = new Coin(2, 2000);
		Coin coin5 = new Coin(5, 1999);
		Coin coin10 = new Coin(10, 2003);
		
		PaperMoney paperMoney10 = new PaperMoney(10, 2000);
		PaperMoney paperMoney20 = new PaperMoney(20, 2001);
		PaperMoney paperMoney50 = new PaperMoney(50, 2003);
		PaperMoney paperMoney100 = new PaperMoney(100, 1990);
		PaperMoney paperMoney200 = new PaperMoney(200, 1998);
		PaperMoney paperMoney500 = new PaperMoney(500, 2001);
		PaperMoney paperMoney2000 = new PaperMoney(2000, 2001);
		
		Wallet wallet = new Wallet(1, "asd");
		wallet.addCoins(coin1);
		wallet.addCoins(coin2);
		wallet.addCoins(coin5);
		wallet.addCoins(coin1);
		wallet.addCoins(coin10);
		wallet.addCoins(coin2);
		wallet.addCoins(coin1);
		wallet.addCoins(coin1);
		wallet.addCoins(coin1);
		wallet.addNotes(paperMoney2000);
		wallet.addNotes(paperMoney200);
		wallet.addNotes(paperMoney20);
		wallet.addNotes(paperMoney100);
		
		WalletWorksInterface worksInterface = new WalletWorksImpl();
		
		System.out.println("Total money : "+worksInterface.totalMoneyInWallet(wallet));
		System.out.println("Total coins : "+worksInterface.totalNoOfCoins(wallet));
		System.out.println("Total notes : "+worksInterface.totalNoOfNotes(wallet));
		System.out.println("Total of coins : "+worksInterface.totalValueOfCoins(wallet));
		System.out.println("Total of notes : "+worksInterface.totalValueOfNotes(wallet));
	}

}
