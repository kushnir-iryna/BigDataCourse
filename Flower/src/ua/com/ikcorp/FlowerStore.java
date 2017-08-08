package ua.com.ikcorp;

public abstract class FlowerStore {

	public static void main(String[] args) {
		Rose ros1 = new Rose(36, 40, 1);
		Rose ros2 = new Rose(50, 60, 2);
		Lili lili1 = new Lili(30, 90, 2);

		Bouquet[] bouquet = new Bouquet[3];
		int i;
		for (i = 0; i < bouquet.length; i++) {
		bouquet[i] = new Bouquet();
		}
		
		bouquet[0].addFlower(ros1).addFlower(ros2);
		bouquet[1].addFlower(ros1).addFlower(lili1);
		bouquet[2].addFlower(ros2).addFlower(lili1);

		// bouquet.DayFlower(ros1).DayFlower(ros2).DayFlower(lili1);

		for (i = 0; i < bouquet.length; i++) {
			System.out.println("Bouquet # " + (i+1) +" :");
			System.out.println(String.format("%.0f UAH - Price ", (bouquet[i].getPrice())));
			System.out.println(String.format("%.2f d - Avarage freshness of flowers " , (bouquet[i].bouquetFreshness())));
			System.out.println(String.format("%.2f cm "
					+ "- Max heigth of flower ", (bouquet[i].heightMaxFlower())));
			System.out.println();
		}
		// displaying of most fresh bouquets
		// Require separate class with array of bouquets where appropriate method will be defined
		// but for now is done by the following code
		double min = bouquet[0].bouquetFreshness(); // min Freshness value
		for (i = 0; i < bouquet.length; i++) {
			if (bouquet[i].bouquetFreshness() < min) {
				min = bouquet[i].bouquetFreshness();
			}  
		}
		
		System.out.println("List of most fresh bouquet(s):");;
		for (i = 0; i < bouquet.length; i++) {
			if (bouquet[i].bouquetFreshness() == min) {
				System.out.println("Bouquet # " + (i+1));
			}  
		}
		
		
		
	}
}
