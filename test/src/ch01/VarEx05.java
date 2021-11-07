package ch01;

// VarEx05 -> main

// Note -> X

class Note{
	int price = 2000;
}

public class VarEx05 {

	public static void main(String[] args) {
		Note note1 = new Note(); // heap 공간에 Note 클래스가 가지고 있는 모든 데이터를 할당해!! (대신 static은 제외하고)
		Note note2 = new Note();
		Note note3 = new Note(); // heap 공간
		int age = 25; // main stack 공간
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
