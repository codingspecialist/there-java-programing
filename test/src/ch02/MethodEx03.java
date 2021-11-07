package ch02;

public class MethodEx03 {

	static void 자판기_음료_돌려주기(int coin) {
		System.out.println("동전을 투입하였습니다.");
	}
	
	static void 자판기_음료_돌려주기2(double paper) {
		System.out.println("지폐를 투입하였습니다.");
	}
	
	static void 자판기_음료_돌려주기3(String card) {
		System.out.println("카드를 투입하였습니다.");
	}
	
	static void add(int n1, int n2) { // 매개변수가 2개!!
		System.out.println("더하기 메서드가 호출되었습니다.");
		int sum = n1 + n2;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		자판기_음료_돌려주기(10000);
		자판기_음료_돌려주기2(1000.50);
		자판기_음료_돌려주기3("삼성카드");
		자판기_음료_돌려주기3("국민카드");
		add(20,6);
	}

}
