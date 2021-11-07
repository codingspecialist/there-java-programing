package ch07.socket2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile {

	// Ŭ���̾�Ʈ ������ �޴� ����
	ServerSocket serverSocket;

	// ���� ����� �ϴ� ����
	Socket socket; // Ctrl+Space, Ctrl+Shift+O
	BufferedReader br;

	public ServerFile() {
		System.out.println("1. �������� ����----------------------------------");
		try {
			serverSocket = new ServerSocket(10000);

			System.out.println("2. �������� �����Ϸ� : Ŭ���̾�Ʈ ���� ����� -----------------------------");
			socket = serverSocket.accept(); // Ŭ���̾�Ʈ ���� �����...
			System.out.println("3. Ŭ���̾�Ʈ ����Ϸ� - buffer����Ϸ�(read)");

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while (true) {
				String msg = br.readLine();
				System.out.println("4.Ŭ���̾�Ʈ�� ���� ���� �޽��� : " + msg);
			}
		} catch (Exception e) {
			System.out.println("�������� ���� �߻��� : " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		new ServerFile();
	}

}
