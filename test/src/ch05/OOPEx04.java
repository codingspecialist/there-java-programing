package ch05;

class �Ӳ��� {
	
	void �޸���() {
		System.out.println("�޸���1");
	}
	
	// �����ε�
	void �޸���(int speed) {
		System.out.println("�޸���2");
	}
	
	// �����ε�
	void �޸���(double speed) {
		System.out.println("�޸���3");
	}
	
	// �����ε�
	void �޸���(int speed, double power) {
		System.out.println("�޸���4");
	}
	
	void �޸���2() {
		System.out.println("�޸���5");
	}
}

// �����ε� ������ ��!!
// �����ε��� �� ����ϴ°�?
public class OOPEx04 {

	public static void main(String[] args) {
		�Ӳ��� e = new �Ӳ���();
		e.�޸���();
		e.�޸���(1);
		e.�޸���(5.0);
		e.�޸���(1, 5.0);
		e.�޸���2();
	}

}