package ch04;

public class DogApp {

	public static void main(String[] args) {
		Dog d1 = new Dog(); // heap������ �ø���.
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d1.color);
		System.out.println(d1.type);
		
		// 1���� ������. �������� ������ �����, �̸��� ������
		d1.age = d1.age + 1;
		d1.color = "�����";
		d1.name = "������";
		//d1.type = "Ǫ��";
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d1.color);
		System.out.println(d1.type);
	}

}
