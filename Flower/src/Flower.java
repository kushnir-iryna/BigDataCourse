import java.util.Scanner;
//Створити ієрархію квітів.Створити з квітів букет. Вивести суму за букет. Знайти найдовшу квітку в букеті. Знайти найсвіжіший букет
import java.util.Scanner;

public abstract class Flower {
	double price;
	double length;

	// Створити ієрархію квітів.Створити з квітів букет. Вивести суму за букет.
	// Знайти найдовшу квітку в букеті. Знайти найсвіжіший букет
	Flower(double p, double l) {
		price = p;
		length = l;
	}

	public static void main(String[] args) {
		System.out.println("У продажі є рози та лілії.");
		System.out.print("Введіть кількість роз ");
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		System.out.print("Введіть кількість лілій ");
		int m = s.nextInt();
		System.out.println("Кількість квіток у букеті рівна " + (k + m));
		
		Flower Buket[] = new Flower[2];
		Buket[1] = new Rose(10, 12);
		Buket[2] = new Lili(120, 10);
		for (int i = 0; i < Buket.length; i++) {
			System.out.println(Buket[i]);
		}
	}
}
