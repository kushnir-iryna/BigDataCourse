package ua.com.ikcorp;

import java.util.ArrayList; 
import ua.com.ikcorp.Flower;

public class Bouquet {
    private double price;
    private ArrayList<Flower> flowers = new ArrayList<Flower>();
    
    public double getPrice() {
        return price;
    }
    
    public Bouquet addFlower(Flower flower) {
        flowers.add(flower);
        price += flower.getPrice();
        return this;
    }
}
