package ch02;


/*
 *  정리 : Stack(지역변수=메서드가 실행될 때 메모리에 할당되요=메서드가 종료될 때 메모리에서 사라져요)
 *        : Heap(전역변수=new할때 메모리에 할당되요=더이상 참조하지 않을 때 메모리에서 사라져요)
 *        : Static(전역변수=main메서드가 실행되기 전에 메모리에 할당되요=main메서드가 종료되면 메모리에서 사라져요)
 */

public class StackEx02 {

	static int sum = 20; // 전역변수 (static) main메서드가 시작되기전에 sum이 할당된다.
	int value = 50; // 전역변수 (heap) // 더 이상 참조하지 않을 때 자동으로 사라진다.
	
	static void a() {
		// a 메서드가 실행될 때 stack공간에 n1이 할당되고 a메서드가 종료되면 메모리에 사라져요.
		int n1 = 1; // a 메서드의 스택영역에 저장됨 (지역변수) (stack)
		System.out.println(n1);
		
		// 21번 라인이 실행되려고 할 때 static 공간에 할당해야 하는데 불가능해요!! static공간 할당은 main메서드 실행전에만 가능해요.
		// static int n2 = 2; 
	}
	
	public static void main(String[] args) {
		a(); // 메서드를 호출한다.
		//System.out.println(n1);
		System.out.println(sum);
		StackEx02 s = new StackEx02(); // 17번 라인에서 heap공간에 value가 할당된다
		System.out.println(s.value);
		System.out.println("test1 - 더 이상 s 변수를 참조하지 않기 때문에 메모리에서 사라진다.");
		System.out.println("test2");
	}

}
