package com.model;

public class PaperMoney {
	private int denomination;
	private int mintDate;

	public PaperMoney(int denomination, int mintDate) {
		this.denomination = denomination;
		this.mintDate = mintDate;
	}

	public PaperMoney() {
		super();
	}

	public int getDenomination() {
		return denomination;
	}

	public void setDenomination(int denomination) {
		this.denomination = denomination;
	}

	public int getMintDate() {
		return mintDate;
	}

	public void setMintDate(int mintDate) {
		this.mintDate = mintDate;
	}
}
