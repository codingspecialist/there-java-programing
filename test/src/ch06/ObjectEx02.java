package ch06;

class 궁수{
	String name = "궁수";
}
class 전사{
	String name = "전사";
}

public class ObjectEx02 {
	public static void main(String[] args) {
		Object[] s1 = new Object[2];
		s1[0] = new 궁수();
		s1[1] = new 전사();
		
		// 단점 - 다운캐스팅!!
		궁수 g1 = (궁수)s1[0];
		전사 g2 = (전사)s1[1];
		
		System.out.println(g1.name);
		System.out.println(g2.name);
	}
}
