package ch07.socket3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile {

	// Ŭ���̾�Ʈ ������ �޴� ����
	ServerSocket serverSocket;

	// ���� ����� �ϴ� ����
	Socket socket; // Ctrl+Space, Ctrl+Shift+O
	BufferedReader br;
	
	 // ���ο� �����尡 �ʿ��ϴ�.
	BufferedWriter bw;
	BufferedReader keyboard;

	public ServerFile() {
		System.out.println("1. �������� ����----------------------------------");
		try {
			serverSocket = new ServerSocket(10000);

			System.out.println("2. �������� �����Ϸ� : Ŭ���̾�Ʈ ���� ����� -----------------------------");
			socket = serverSocket.accept(); // Ŭ���̾�Ʈ ���� �����...
			System.out.println("3. Ŭ���̾�Ʈ ����Ϸ� - buffer����Ϸ�(read)");

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// write ������ ���� (�� ����)
			WriteThread wt = new WriteThread();
			Thread t1 = new Thread(wt);
			t1.start();
			
			// main ������ ���� (�� �б�)
			while (true) {
				String msg = br.readLine();
				System.out.println("4.Ŭ���̾�Ʈ�� ���� ���� �޽��� : " + msg);
			}
		} catch (Exception e) {
			System.out.println("�������� ���� �߻��� : " + e.getMessage());
		}
	}
	
	// ���� Ŭ����
	class WriteThread implements Runnable{

		@Override
		public void run() {
			while(true) {
				try {
					String keyboardMsg = keyboard.readLine();
					bw.write(keyboardMsg+"\n");
					bw.flush();
				} catch (Exception e) {
					System.out.println("���������ʿ��� Ű���� �Է¹޴� �� ������ �߻��߽��ϴ� : "+e.getMessage());
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
		new ServerFile();
	}

}
