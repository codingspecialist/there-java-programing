package ch04;

import java.util.Random;

import recipe.MySoup;

// JDK ��ġ - JDK(javac, java), JRE(���̺귯��), JVM(�ڹ� ����ӽ�)
public class LibEx01 {

	public static void main(String[] args) {
		MySoup m = new MySoup();
		m.��ġ���();
		
		Random r = new Random();
		System.out.println(r.nextInt());
	}

}
