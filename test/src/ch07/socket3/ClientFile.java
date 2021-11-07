package ch07.socket3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientFile {
	
	Socket socket;
	BufferedWriter bw;
	BufferedReader keyboard;
	BufferedReader br;
	
	public ClientFile() {
		try {
			System.out.println("1. Ŭ���̾�Ʈ���� ����----------------------------------");
			socket = new Socket("localhost", 10000); // 14�� ���� ����� -> ���������� accept() �޼��尡 ȣ��

			System.out.println("2. ����(write) ����Ϸ�----------------------------------");
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// Ű���� ����
			System.out.println("3. Ű���� ��Ʈ�� + ����(read) ����Ϸ�----------------------------------");
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// ���ο� ������ ���� (�� �б�)
			ReadThread rt = new ReadThread();
			Thread t1 = new Thread(rt);
			t1.start();
			
			// ���� �������� ���� (�� ����)
			while(true) {
				System.out.println("4. Ű���� �޽��� �Է� �����----------------------------------");
				String keyboardMsg = keyboard.readLine();
				// �޽��� ���� �˷���� �Ѵ�. \n
				bw.write(keyboardMsg+"\n");
				bw.flush();
			}

		} catch (Exception e) {
			System.out.println("Ŭ���̾�Ʈ���� ���� �߻��� : "+e.getMessage());
		}
	}
	
	class ReadThread implements Runnable{

		@Override
		public void run() {
			while(true) {
				try {
					String msg = br.readLine();
					System.out.println("������ ���� ���� �޽��� : "+msg);
				} catch (Exception e) {
					System.out.println("Ŭ���̾�Ʈ �����ʿ��� �������� �޽����� �Է¹޴� �� ������ �߻��߽��ϴ� : "+e.getMessage());
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		new ClientFile();
	}
}
