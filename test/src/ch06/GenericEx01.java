package ch06;

// ��쿡 ���� ���ڿ��� ���, ���ڸ� ���
class �ٱ���{
	Object data;
}

public class GenericEx01 {

	public static void main(String[] args) {
		�ٱ��� s1 = new �ٱ���();
		s1.data = 1;
		System.out.println(s1.data);
		
		�ٱ��� s2 = new �ٱ���();
		s2.data = "���ڿ�";
		System.out.println(s2.data);
	}

}
