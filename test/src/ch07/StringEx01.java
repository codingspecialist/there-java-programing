package ch07;

public class StringEx01 extends Object{

	public static void main(String[] args) {
		String s1 = new String("바다"); // 100번지
		String s2 = new String("바다"); // 30번지
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); // == 주소를 비교!!
		
		String s3 = "바다"; // 500번지
		String s4 = "바다"; // 500번지
		System.out.println(s3==s4); // == 주소를 비교!!
		
		s3 = s3 + "태양";
		System.out.println(s3);
		System.out.println(s4);
		s3 = s3 + "달";
		System.out.println(s3);
		
		// 문자열을 비교할 때 -> s1 s2 s3 s4 (바다) 
		System.out.println(s1.equals("바다")); // 문자열 값자체와 주소 두개를 비교
	}

}
