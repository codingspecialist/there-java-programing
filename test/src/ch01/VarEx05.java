package ch01;

// VarEx05 -> main

// Note -> X

class Note{
	int price = 2000;
}

public class VarEx05 {

	public static void main(String[] args) {
		Note note1 = new Note(); // heap ������ Note Ŭ������ ������ �ִ� ��� �����͸� �Ҵ���!! (��� static�� �����ϰ�)
		Note note2 = new Note();
		Note note3 = new Note(); // heap ����
		int age = 25; // main stack ����
		System.out.println(age);
		System.out.println(note1.price);
		System.out.println(note2.price);
		System.out.println(note3.price);
		
		note3.price = 30000;
		System.out.println(note1.price);
		System.out.println(note2.price);
		System.out.println(note3.price);
		
	}

}
