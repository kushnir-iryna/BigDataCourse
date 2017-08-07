package ua.com.ikcorp;

import java.util.Collections;

import java.util.ArrayList;

public class Bouquet {
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

	public Bouquet DayFlower(Flower flower) {
		days += (flower.getDays()) / flowers.size();
		return this;

	}
}
