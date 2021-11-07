package ch07.socket3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile {

	// 클라이언트 연결을 받는 소켓
	ServerSocket serverSocket;

	// 실재 통신을 하는 소켓
	Socket socket; // Ctrl+Space, Ctrl+Shift+O
	BufferedReader br;
	
	 // 새로운 스레드가 필요하다.
	BufferedWriter bw;
	BufferedReader keyboard;

	public ServerFile() {
		System.out.println("1. 서버소켓 시작----------------------------------");
		try {
			serverSocket = new ServerSocket(10000);

			System.out.println("2. 서버소켓 생성완료 : 클라이언트 접속 대기중 -----------------------------");
			socket = serverSocket.accept(); // 클라이언트 접속 대기중...
			System.out.println("3. 클라이언트 연결완료 - buffer연결완료(read)");

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// write 스레드 실행 (글 쓰기)
			WriteThread wt = new WriteThread();
			Thread t1 = new Thread(wt);
			t1.start();
			
			// main 스레드 역할 (글 읽기)
			while (true) {
				String msg = br.readLine();
				System.out.println("4.클라이언트로 부터 받은 메시지 : " + msg);
			}
		} catch (Exception e) {
			System.out.println("서버소켓 에러 발생함 : " + e.getMessage());
		}
	}
	
	// 내부 클래스
	class WriteThread implements Runnable{

		@Override
		public void run() {
			while(true) {
				try {
					String keyboardMsg = keyboard.readLine();
					bw.write(keyboardMsg+"\n");
					bw.flush();
				} catch (Exception e) {
					System.out.println("서버소켓쪽에서 키보드 입력받는 중 오류가 발생했습니다 : "+e.getMessage());
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
		new ServerFile();
	}

}
