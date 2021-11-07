package ch01;

public class VarEx02 {
	
	static int n2 = 20;

	public static void main(String[] args) {
		int n1 = 10; // 8번 라인이 실행될 때 10이라는 숫자가 n1이라는 메모리 공간에 할당된다.
		System.out.println(n1); // main이라는 stack 공간의 n1
		System.out.println(n2); // VarEx02라는 static 공간의 n2
	}

}
