package ch05;

abstract class 육식동물 {
	void 걷기() {
		System.out.println("걷다");
	}
	
	// 미완성 설계도
	abstract void 공격();
}

class 뱀 extends 육식동물{

	@Override
	void 공격() {
		System.out.println("독으로 공격");
	}
}

class 사자 extends 육식동물{

	@Override
	void 공격() {
		System.out.println("이빨로 공격");
	}
	
}

public class OOPEx08 {
	public static void main(String[] args) {
		육식동물 u1 = new 사자();
		육식동물 u2 = new 뱀();
		u1.걷기();
		u1.공격();
		u2.걷기();
		u2.공격();
	}
}
