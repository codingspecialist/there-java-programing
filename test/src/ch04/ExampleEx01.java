package ch04;

class Food {
	String name;
	int price;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void myPrint() {
		System.out.println(name+" ������ "+price+"�Դϴ�.");
	}
}

public class ExampleEx01 {

	public static void main(String[] args) {
		Food f1 = new Food("ġŲ", 2000);
		Food f2 = new Food("����", 5000);
		
		f1.myPrint();
		f2.myPrint();
	}

}
