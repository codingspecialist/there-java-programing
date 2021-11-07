package ch07;

import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {

	public static void main(String[] args) {
		InputStream in = System.in; // System.in (키보드)
		InputStreamReader ir = new InputStreamReader(in); // 65->A로 부호화
		
		try {
			// A -> 999개 낭비
			// A~문자 500 -> 500개 낭비
			char[] data = new char[1000];
			ir.read(data);
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
