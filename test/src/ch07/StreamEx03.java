package ch07;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx03 {

	public static void main(String[] args) {
		InputStream in = System.in; // System.in (키보드)
		InputStreamReader ir = new InputStreamReader(in); // 65->A로 부호화
		BufferedReader br = new BufferedReader(ir);
		
		try {
			String data  = br.readLine();
			System.out.println(data);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
