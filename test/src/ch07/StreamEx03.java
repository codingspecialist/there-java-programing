package ch07;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx03 {

	public static void main(String[] args) {
		InputStream in = System.in; // System.in (Ű����)
		InputStreamReader ir = new InputStreamReader(in); // 65->A�� ��ȣȭ
		BufferedReader br = new BufferedReader(ir);
		
		try {
			String data  = br.readLine();
			System.out.println(data);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
