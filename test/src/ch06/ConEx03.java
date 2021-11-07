package ch06;

public class ConEx03 {

	public static void main(String[] args) {
		int point = 95;
		
		// 90점이 넘으면 차를 사주겠다.
		// 80점이 넘으면 자전거를 사주겠다.
		// 그게 아니면 벌을 주겠다.
		
		if(point > 90) { // 1. 만약 90점이 넘는다면?
			System.out.println("차를 사주겠다.");
		} else if(point > 80) { // 2. 90점을 넘지 못하고 80점을 넘는다면
			System.out.println("자전거를 사주겠다.");
		} else { // 3. 위 두 조건을 만족하지 못했을 때
			System.out.println("벌을 주겠다.");
		}
	}

}
