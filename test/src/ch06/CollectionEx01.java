package ch06;

import java.util.ArrayList;
import java.util.Iterator;

class ����{}

public class CollectionEx01 {

	public static void main(String[] args) {
		// int, double, char, boolean => �⺻�ڷ��� (��)
		// String, Ŀ�����ڷ���(Ŭ����) => ���۷����ڷ��� (�ּ�)
		// ����Ŭ���� = Integer, Double, Character, Boolean
		ArrayList<Integer> c1 = new ArrayList<>();
		
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.add(5);
		c1.add(6);
		
		//System.out.println(c1.get(0));
		
		// for�� (�ݺ���) = �����丵
		int size = c1.size();
		System.out.println("������ : "+size);
		for (int i = 0; i < size; i++) {
			System.out.println(c1.get(i));
		}
	}

}
