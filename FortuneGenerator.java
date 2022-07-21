package com.example.demo;

//コンストラクタで引数を使用したいためサービスアノテーションを使用しない
public class FortuneGenerator {
	private int month;
	private String luckyItem;
	private String luckyColor;
	private int rank;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getLuckyItem() {
		return luckyItem;
	}

	public void setLuckyItem(String luckyItem) {
		this.luckyItem = luckyItem;
	}

	public String getLuckyColor() {
		return luckyColor;
	}

	public void setLuckyColor(String luckyColor) {
		this.luckyColor = luckyColor;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public FortuneGenerator(int month, String luckyItem, String luckyColor, int rank) {
		this.month = month;
		this.luckyItem = luckyItem;
		this.luckyColor = luckyColor;
		this.rank = rank;

	}

}
