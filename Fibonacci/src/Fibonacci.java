import java.util.Scanner;
import java.math.BigInteger;

public class Fibonacci {
	public static BigInteger fibonac(int f) {
		BigInteger fk = BigInteger.ONE, fk1 = BigInteger.ONE;
		for (int k = 2; k <= f; ++k) {
			fk = (BigInteger) (fk.add(fk1));
			fk1 = (BigInteger) (fk.subtract(fk1));
		}
		return fk;
	}

	public static void main(String[] args) {
		double p = 0;
		System.out.println("������ ������� ��������");
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		for (int i = 0; i < k; i++) {
			System.out.println(fibonac(i) + " ");
			if ((fibonac(i).mod(fibonac(2))).equals(BigInteger.ZERO)) {
				p = p + 1;
			}
		}
		System.out.println();
		System.out.print("ʳ������ ������ ����� ���� ");
		System.out.printf("%.0f", p);
		double a = (p * 100 / k);
		System.out.print(". � ����������� ���������� �� ���� ");
		System.out.printf("%.2f", a);
		System.out.println("%");
		System.out.println();
		System.out.print("ʳ������ �������� ����� ���� ");
		System.out.printf("%.0f", (k - p));
		double b = ((k - p) * 100 / k);
		System.out.print(". � ����������� ���������� �� ���� ");
		System.out.printf("%.2f", b);
		System.out.println("%");
		System.out.println();
		System.out.println("������ ����� ��������");
		int m = s.nextInt();
		// if ((m <= k) & (m > 0)) {
		System.out.println("����� Գ������ �� ������� " + m + " ���� " + fibonac(m - 1));
		// } else
		// System.out.println("���������� ʲ��ʲ��� ������Ҳ�");

	}

}
