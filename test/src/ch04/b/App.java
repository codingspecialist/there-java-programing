package ch04.b;

import ch04.a.Cal;

// main�� �ִ� �ڹ������� ��������
public class App {

	// JVM�� main�޼��带 ã������ public �� �ʿ� (����)
	// JVM�� main�޼��带 ã������ static �� �ʿ� (�޸𸮿� �ø��ٴ� ��)
	// main �޼��常 return Ÿ���� ������� �ʴ´�.
	// �޼����� �̸� main�̴�.
	// String[] args �Ű����� = ���󵵵�.
	public static void main(String[] args) {
		Cal c = new Cal();
		c.minus();
		// System.out.println(c.num);
	}

}