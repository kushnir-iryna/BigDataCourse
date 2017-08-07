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
	
  
	/*public Bouquet heightFlower(Flower flower) {
		flower = flowers.getHeight(0);
		   for(int i = 0; i < flowers.size(); i++){
		    if (flowers.get(i)[1]>flower[1]) {
		        flower = flowers.get(i);
		    }
		}
		   }
		   return fram;
		 }*/
		

	public Bouquet DayFlower(Flower flower) {
		days +=( flower.getDays())/flowers.size();
		return this;

	}
}
