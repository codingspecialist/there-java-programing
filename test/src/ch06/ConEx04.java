package ch06;

public class ConEx04 {

	public static void main(String[] args) {
		// 연습문제 1
		for(int i=1; i<11; i++) {
			if(i!=6) {
				System.out.println(i);
			}
		}
		System.out.println("==============");
		
		// 연습문제 2
		for(int i=10; i>0; i=i-1) {
			if(i!=3) {
				System.out.println(i);
			}
		}
		System.out.println("==============");
		
		// 연습문제 3-1
		for(int i=1; i<21; i=i+1) {
			if(i%2==0) {
				System.out.println(i);
			}	
		}
		System.out.println("==============");
		
		// 연습문제 3-2
		for(int i=2; i<21; i=i+2) {
			System.out.println(i);
		}
	}

}
