package ch04;

public class DogApp {

	public static void main(String[] args) {
		Dog d1 = new Dog(); // heap공간에 올린다.
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d1.color);
		System.out.println(d1.type);
		
		// 1년이 지났다. 강아지가 염색을 노란색, 이름도 레르코
		d1.age = d1.age + 1;
		d1.color = "노란색";
		d1.name = "레르코";
		//d1.type = "푸들";
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d1.color);
		System.out.println(d1.type);
	}

}
