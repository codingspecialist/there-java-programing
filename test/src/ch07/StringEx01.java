package ch07;

public class StringEx01 extends Object{

	public static void main(String[] args) {
		String s1 = new String("�ٴ�"); // 100����
		String s2 = new String("�ٴ�"); // 30����
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); // == �ּҸ� ��!!
		
		String s3 = "�ٴ�"; // 500����
		String s4 = "�ٴ�"; // 500����
		System.out.println(s3==s4); // == �ּҸ� ��!!
		
		s3 = s3 + "�¾�";
		System.out.println(s3);
		System.out.println(s4);
		s3 = s3 + "��";
		System.out.println(s3);
		
		// ���ڿ��� ���� �� -> s1 s2 s3 s4 (�ٴ�) 
		System.out.println(s1.equals("�ٴ�")); // ���ڿ� ����ü�� �ּ� �ΰ��� ��
	}

}
