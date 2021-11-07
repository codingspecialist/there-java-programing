package ch04.b;

import ch04.a.Cal;

// main이 있는 자바파일을 실행파일
public class App {

	// JVM이 main메서드를 찾으려면 public 이 필요 (공개)
	// JVM이 main메서드를 찾으려면 static 이 필요 (메모리에 올린다는 뜻)
	// main 메서드만 return 타입을 허용하지 않는다.
	// 메서드의 이름 main이다.
	// String[] args 매개변수 = 몰라도됨.
	public static void main(String[] args) {
		Cal c = new Cal();
		c.minus();
		// System.out.println(c.num);
	}

}
