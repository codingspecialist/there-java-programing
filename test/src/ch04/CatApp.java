package ch04;

public class CatApp {
	public static void main(String[] args) {
		
		// new -> �޸𸮿� �Ҵ� (heap) -> String name, String color
		// Cat() -> ������ ȣ�� -> ���¸� �ʱ�ȭ�ϱ� ���ؼ�
		// c1 -> heap ������ ����Ű�� �ּ�
		// Cat Ŀ���� Ÿ�� (�����ڰ� ���� Ÿ��)
		Cat c1 = new Cat("����1", "�Ͼ��"); // ����� �Ѹ����� �������� �������
		System.out.println(c1.name); // null ��ü�� �������̴�. ���� ������ �ǹ�!!
		System.out.println(c1.color);
		
		Cat c2 = new Cat("����2", "�����"); // ����� �Ѹ����� �������� �������
		System.out.println(c2.name);
		System.out.println(c2.color);
	}
}
