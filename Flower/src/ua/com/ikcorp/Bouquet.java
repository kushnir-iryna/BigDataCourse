package ua.com.ikcorp;

import java.util.ArrayList;

public class Bouquet {
	String name;
	private double price;
	private double height;
	private double days;

	private ArrayList<Flower> flowers = new ArrayList<Flower>();

	public double getPrice() {
		return price;
	}

	public double getHeight() {
		return height;
	}

	public double getDays() {
		return days;
	}

	public String getName() {
		return name;
	}

	public Bouquet addFlower(Flower flower) {
		flowers.add(flower);
		price += flower.getPrice();
		return this;
	}

	public double heightMaxFlower() {
		double max;
		max = flowers.get(0).getHeight();
		for (int i = 0; i < flowers.size(); i++) {
			if (flowers.get(i).getHeight() > max) {
				max = flowers.get(i).getHeight();
			}
		}
		return max;
	}

	
	public double bouquetFreshness() {
		double avr;
		double sum = 0;
		int c=0;
		for (int i = 0; i < flowers.size(); i++) {
			if (flowers.get(i).getName() == "Kaktus") {c++;}
			if (flowers.get(i).getName() != "Kaktus")
				sum += flowers.get(i).getDays();
		}
		avr = sum / (flowers.size()-c);
		return avr;

	}
}
//mInfoTextView.setText(flowers.contains("Бобик") + "");