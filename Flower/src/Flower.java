import java.util.Scanner;
//�������� �������� ����.�������� � ���� �����. ������� ���� �� �����. ������ �������� ����� � �����. ������ ��������� �����
import java.util.Scanner;

public abstract class Flower {
	double price;
	double length;

	// �������� �������� ����.�������� � ���� �����. ������� ���� �� �����.
	// ������ �������� ����� � �����. ������ ��������� �����
	Flower(double p, double l) {
		price = p;
		length = l;
	}

	public static void main(String[] args) {
		System.out.println("� ������ � ���� �� �볿.");
		System.out.print("������ ������� ��� ");
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		System.out.print("������ ������� ��� ");
		int m = s.nextInt();
		System.out.println("ʳ������ ����� � ����� ���� " + (k + m));
		
		Flower Buket[] = new Flower[2];
		Buket[1] = new Rose(10, 12);
		Buket[2] = new Lili(120, 10);
		for (int i = 0; i < Buket.length; i++) {
			System.out.println(Buket[i]);
		}
	}
}
