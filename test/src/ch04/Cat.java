package ch04;

// ���� �ʱ�ȭ���� �ʴ� ������ new �Ҷ����� �ٸ� ���¸� ���� �����̸� ����� ���ؼ��̴�!!
public class Cat {
	String name;
	String color;
	
	// Cat() �����ڸ� ����Ʈ(�⺻) �����ڶ�� �Ѵ�. (�Ű������� ���� ��)
	// �����ڰ� ���� ������ �ڵ�
	public Cat() {
		
	}
	
	// �����ڰ� ���� ������ ������ = ����Ʈ �����ڰ� ������ ����.
	public Cat(String n, String c) { // ������(�޼���)
		System.out.println("�����̰� ź����");
		System.out.println("n : "+n);
		System.out.println("c : "+c);
		
		// String n, String c �� �������� = Cat() �̶�� ������(�޼���)�� ���� ��������
		name = n;
		color = c;
	}
}