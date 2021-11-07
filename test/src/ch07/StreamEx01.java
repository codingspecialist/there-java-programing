package ch07;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {

	public static void main(String[] args) {
		InputStream in = System.in; // System.in (키보드)
		
		// 1. 키보드 A를 인코딩해서 01000000 으로 컴퓨터에게 전송
		// 2. ByteStream으로 흘러들어간다. (Input)
		// 3. read() 메서드로 01000000 -> 65로 디코딩한다.
		// 4. 65를 -> 문자로 부호화시킨다.
		try {
			int data = in.read();
			System.out.println((char)data); // 부호화
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
