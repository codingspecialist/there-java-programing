package ch05;

class Engine {
	int power = 2000;
}

class Car { // �ڵ����� ������ �ƴϱ� ������ ����� �� ����.
	
	// ��������!! ����
	Engine e;
	
	public Car(Engine e) {
		this.e = e;
	}
}

class Hamburger {
	String name = "�⺻�ܹ���";
	String ���1 = "�����";
	String ���2 = "��Ƽ";
}

// ����� ���¿� ������ �������� �� ������ �� Ÿ���� ��ġ�� �� �־�� �Ѵ�.
class CheeseHamburger extends Hamburger{ // ġ���ܹ��� = �ܹ����̴�.
	// ��ġ�� �ʴ� ����(�ʵ�)�� �����޴´�.
	String name = "ġ���ܹ���";
}

class ChickenHamburger {
	String name = "ġŲ�ܹ���";
	Hamburger h;
	
	public ChickenHamburger(Hamburger h) {
		this.h = h;
	}
}

public class OOPEx02 {

	public static void main(String[] args) {
		Engine e1 = new Engine();
		Car c1 = new Car(e1);
		System.out.println("�ڵ����� ���� ������ : "+c1.e.power);
		
		CheeseHamburger ch1 = new CheeseHamburger();
		System.out.println("�ܹ����� �̸��� : "+ch1.name);
		System.out.println("��� : "+ch1.���1);
		System.out.println("��� : "+ch1.���2);
		
		Hamburger h1 = new Hamburger();
		ChickenHamburger ckh1 = new ChickenHamburger(h1);
		System.out.println(ckh1.name);
		System.out.println(ckh1.h.���1);
		System.out.println(ckh1.h.���2);
	}

}