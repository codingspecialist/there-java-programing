package ch05;

interface RemoconAble {
	public void 초록버튼();
	public void 빨간버튼();
}

class Samsung implements RemoconAble{

	@Override
	public void 초록버튼() {
		System.out.println("전원이 켜졌습니다.");
	}

	@Override
	public void 빨간버튼() {
		System.out.println("전원이 꺼졌습니다.");
	}

	// 내부를 만드시오.
	
}

class LG implements RemoconAble{
	
	@Override
	public void 초록버튼() {
		System.out.println("전원이 켜졌습니다.");
	}

	@Override
	public void 빨간버튼() {
		System.out.println("전원이 꺼졌습니다.");
	}
	
}


public class ExampleEx01 {

	public static void main(String[] args) {
		// 삼성 리모콘 2개 만들기 (new)
	    Samsung s1 = new Samsung();
	    Samsung s2 = new Samsung();
	    
        // 엘지 리모콘 2개 만들기 (new)
	    LG g1 = new LG();
	    LG g2 = new LG();
	}

}
