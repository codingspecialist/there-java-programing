package ch06;

abstract class �� {
	abstract String getName();
}

class �󱸰� extends ��{
	private String name="�󱸰�";

	// �ڽ��� �θ��� �޼���� ������ ���� ��� ������
	// �θ��� �޼��尡 �������̵�(��ȿȭ) �ȴ�.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class �౸�� extends ��{
	private String name = "�౸��";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class ����<T> {
	private T data;
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}


public class GenericEx03 {
	
	static ����<? extends ��> ������(int time) { // 9�� = �౸, 12�� = ��
		if(time == 9) {
			System.out.println("���濡 �౸���� �����");
			�౸�� g2 = new �౸��();
			����<�౸��> b2 = new ����<>();
			b2.setData(g2);
			return b2;
		}else {
			System.out.println("���濡 �󱸰��� �����");
			�󱸰� g1 = new �󱸰�();
			����<�󱸰�> b1 = new ����<>();
			b1.setData(g1);
			return b1;
		}
	}
	
	// ���׸� ��� = ������, Object, �߻�Ŭ����, �������̵�(��ȿȭ)
	// �������ε�
	
	// ������ �ٽ� �����ص� �ȴ�. ���̳� ���α׷��� ���� �� ��û�� ����!!
	public static void main(String[] args) {
		����<? extends ��> r1 =  ������(9);
		����<? extends ��> r2 =  ������(12);
		
		// ���� getName �޼��尡 ����.
		System.out.println(r1.getData().getName());
		System.out.println(r2.getData().getName());
	}
}
