package ch04.a;

public class Cal {
	
	int num = 10;
	
	void add() {
		System.out.println("더하기 메서드");
	}
	
	public void minus() {
		System.out.println("빼기 메서드");
	}
	
	private void multi() {
		System.out.println("곱하기 메서드");
	}
	
	public void divide() {
		System.out.println("나누기 메서드");
		multi();
	}
}
