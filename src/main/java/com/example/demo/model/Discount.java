package com.example.demo.model;

/*import lombok.Getter;
import lombok.Setter;

@Getter
@Setter*/
public class Discount {
	int marketPrice;
	int discount;

	public int getMarketPrice() {
		return marketPrice;
	}

	public int getDiscount() {
		return discount;
	}

	public void setMarketPrice(int marketPrice) {
		this.marketPrice = marketPrice;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
