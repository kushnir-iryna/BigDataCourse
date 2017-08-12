//Створити ієрархію квітів.Створити з квітів букет. Вивести суму за букет. Знайти найдовшу квітку в букеті. Знайти найсвіжіший букет
package ua.com.ikcorp;

class Flower {
	private String name;
	private double price;
	private double height;
	private double days;
	
	Flower(String name, double price, double height, double days) {

		this.days = days;
		this.price = price;
		this.height = height;
		this.name = name;
	}

	double getPrice() {
		return this.price;
	}

	double getHeight() {
		return this.height;
	}

	double getDays() {
		return this.days;
	}
	String getName() {
		return this.name;
	}

	void setPrice(double x) {
		this.price = x;
	}

	void setHeight(double x) {
		this.height = x;
	}
	
	void setDays(double x) {
		this.days = x;
	}
	
	void setName(String x) {
		this.name =x;
	}

	
}