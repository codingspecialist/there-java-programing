package ch07;

class �� {
	void shoot() {
		System.out.println("���� �߻��߽��ϴ�.");
	}
}

public class ExceptionEx01 {

	public static void main(String[] args) {
		// ������ ���� (Java�� �� �� ����)
		try {
			System.out.println("���ڱ� ����");
			Thread.sleep(1000); // ���ν����� 1�ʵ��� ���� �ܴ�!!
			System.out.println("���ڱ� ��");
		} catch (Exception e) { // ����!!
			e.printStackTrace();
		}
		
		// ��Ÿ�� ���� (�����ڰ� �� �� �ִ�)
		int[] nums = {1,2,3};
		try {
			System.out.println(nums[3]); // ���� ����!!
		} catch (RuntimeException e) {
			// catch�� ������ try(�õ�)�ϴٰ� ���ܰ� �߻��ϸ� ��� ó�������� �����ϴ� ����
			System.out.println("������ �׳� ������");
			System.out.println(e.getMessage()); // �α� ���� ���� �����Ѵ�.
			e.printStackTrace();
		}
		
		�� s = null;
		try {
			s.shoot();
		} catch (RuntimeException e) {
			System.out.println("���� ��� ���� ����� �ٽ� �õ��ϰڽ��ϴ�.");
			s = new ��();
			s.shoot();
		}
		
		
		System.out.println("���� ������ ����");
	}

}
