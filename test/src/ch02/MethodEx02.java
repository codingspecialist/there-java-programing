package ch02;

public class MethodEx02 {
	
	// void는 리턴(돌려주지)하지 않겠다.
	static int add() { // 호출이 되면 중괄호 내부가 실행된다. 이때 Stack 공간이 메모리에 만들어진다.
		int sum = 5+6;
		//System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		int result = add(); // add() 메서드 호출
		System.out.println(result);
	}

}
