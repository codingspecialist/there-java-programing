package ch05;

interface RemoconAble {
	public void �ʷϹ�ư();
	public void ������ư();
}

class Samsung implements RemoconAble{

	@Override
	public void �ʷϹ�ư() {
		System.out.println("������ �������ϴ�.");
	}

	@Override
	public void ������ư() {
		System.out.println("������ �������ϴ�.");
	}

	// ���θ� ����ÿ�.
	
}

class LG implements RemoconAble{
	
	@Override
	public void �ʷϹ�ư() {
		System.out.println("������ �������ϴ�.");
	}

	@Override
	public void ������ư() {
		System.out.println("������ �������ϴ�.");
	}
	
}


public class ExampleEx01 {

	public static void main(String[] args) {
		// �Ｚ ������ 2�� ����� (new)
	    Samsung s1 = new Samsung();
	    Samsung s2 = new Samsung();
	    
        // ���� ������ 2�� ����� (new)
	    LG g1 = new LG();
	    LG g2 = new LG();
	}

}
