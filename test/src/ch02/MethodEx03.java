package ch02;

public class MethodEx03 {

	static void ���Ǳ�_����_�����ֱ�(int coin) {
		System.out.println("������ �����Ͽ����ϴ�.");
	}
	
	static void ���Ǳ�_����_�����ֱ�2(double paper) {
		System.out.println("���� �����Ͽ����ϴ�.");
	}
	
	static void ���Ǳ�_����_�����ֱ�3(String card) {
		System.out.println("ī�带 �����Ͽ����ϴ�.");
	}
	
	static void add(int n1, int n2) { // �Ű������� 2��!!
		System.out.println("���ϱ� �޼��尡 ȣ��Ǿ����ϴ�.");
		int sum = n1 + n2;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		���Ǳ�_����_�����ֱ�(10000);
		���Ǳ�_����_�����ֱ�2(1000.50);
		���Ǳ�_����_�����ֱ�3("�Ｚī��");
		���Ǳ�_����_�����ֱ�3("����ī��");
		add(20,6);
	}

}
