package ch04.a;

public class Cal {
	
	int num = 10;
	
	void add() {
		System.out.println("���ϱ� �޼���");
	}
	
	public void minus() {
		System.out.println("���� �޼���");
	}
	
	private void multi() {
		System.out.println("���ϱ� �޼���");
	}
	
	public void divide() {
		System.out.println("������ �޼���");
		multi();
	}
}
