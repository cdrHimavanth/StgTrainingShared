package com.service;

import com.model.Coin;
import com.model.PaperMoney;
import com.model.Wallet;

public class WalletWorksImpl implements WalletWorksInterface {

	@Override
	public int totalMoneyInWallet(Wallet wallet) {
		int totalValue = 0;
		for (Coin coin : wallet.getCoins()) {
			totalValue = totalValue + coin.getDenomination();
		}
		for (PaperMoney note : wallet.getNotes()) {
			totalValue = totalValue + note.getDenomination();
		}
		return totalValue;
	}

	@Override
	public int totalNoOfCoins(Wallet wallet) {
		return wallet.getCoins().size();
	}

	@Override
	public int totalNoOfNotes(Wallet wallet) {
		return wallet.getNotes().size();
	}

	@Override
	public int totalValueOfCoins(Wallet wallet) {
		int totalValue = 0;
		for (Coin coin : wallet.getCoins()) {
			totalValue = totalValue + coin.getDenomination();
		}
		return totalValue;
	}

	@Override
	public int totalValueOfNotes(Wallet wallet) {
		int totalValue = 0;
		for (PaperMoney note : wallet.getNotes()) {
			totalValue = totalValue + note.getDenomination();
		}
		return totalValue;
	}

}
