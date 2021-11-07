package ch07.socket2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientFile {
	
	Socket socket;
	BufferedWriter bw;
	BufferedReader br;
	
	public ClientFile() {
		try {
			System.out.println("1. Ŭ���̾�Ʈ���� ����----------------------------------");
			socket = new Socket("localhost", 10000); // 14�� ���� ����� -> ���������� accept() �޼��尡 ȣ��

			System.out.println("2. ����(write) ����Ϸ�----------------------------------");
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// Ű���� ����
			System.out.println("3. Ű���� ��Ʈ�� + ����(read) ����Ϸ�----------------------------------");
			br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.println("4. Ű���� �޽��� �Է� �����----------------------------------");
				String keyboardMsg = br.readLine();
				// �޽��� ���� �˷���� �Ѵ�. \n
				bw.write(keyboardMsg+"\n");
				bw.flush();
			}

		} catch (Exception e) {
			System.out.println("Ŭ���̾�Ʈ���� ���� �߻��� : "+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new ClientFile();
	}
}
