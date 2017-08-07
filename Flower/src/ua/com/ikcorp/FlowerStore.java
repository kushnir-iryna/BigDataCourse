package ua.com.ikcorp;

public abstract class FlowerStore {

	public static void main(String[] args) {
		Rose ros1 = new Rose(36, 70.5, 1);
		Rose ros2 = new Rose(50, 60, 5);
		Lili lili1 = new Lili(30, 20, 5);

		Bouquet bouquet = new Bouquet();
		bouquet.addFlower(ros1).addFlower(ros2).addFlower(lili1);
		bouquet.DayFlower(ros1).DayFlower(ros2).DayFlower(lili1);

		System.out.println(String.format("%.2f - Price of first Bouquet.", (bouquet.getPrice())));
		System.out.println(String.format("%.2f - Avarage freshness of flowers in Bouquet.", (bouquet.getDays())));
		System.out.println(String.format("%.2f - Max heigth of flower in Bouquet.", (bouquet.heightMaxFlower())));
	}
}
