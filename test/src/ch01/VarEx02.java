package ch01;

public class VarEx02 {
	
	static int n2 = 20;

	public static void main(String[] args) {
		int n1 = 10; // 8�� ������ ����� �� 10�̶�� ���ڰ� n1�̶�� �޸� ������ �Ҵ�ȴ�.
		System.out.println(n1); // main�̶�� stack ������ n1
		System.out.println(n2); // VarEx02��� static ������ n2
	}

}
