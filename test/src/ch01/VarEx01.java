package ch01;

// ��Ű�� = �ڹ� ������ ���ִ� ����
public class VarEx01 {

	public static void main(String[] args) {
		boolean b1 = true; // �ڽ� = 1
		boolean b2 = false; // �ڽ� = 0
		
		int n1 = 1000; // �� �޸𸮿� 4Byte ������ �ʿ���!!
		double d1 = 1000.1; // �� �޸𸮿� 8Byte ������ �ʿ���!!
		char c1 = '��'; // �� �޸𸮿� 2Byte ������ �ʿ���!!
		
		System.out.println(c1);
		System.out.println(n1);
		
		n1 = 50; // ���� ����
		System.out.println(n1);
		
	}
}
