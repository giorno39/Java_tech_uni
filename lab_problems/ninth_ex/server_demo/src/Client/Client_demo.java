package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class Client_demo {
	public static void main(String[] args) {
		Socket connection = null;
		Scanner socketIn = null;
		PrintWriter socketOut = null;
		Scanner keyboardIn = new Scanner(System.in);
		int port = 1234;
		String host = "localhost";

		try {
			System.out.println("Trying to connect to the server");
			try {
				connection = new Socket(host, port);
			} catch (ConnectException e) {
				System.err.println("Can't connect to the server");
				return;
			}
			System.out.println("Connected succesfully");
//			System.out.println("Enter a number: ");


			socketIn = new Scanner(new BufferedReader(new InputStreamReader(connection.getInputStream())));
//			System.out.println("Point of the server: " + socketIn.nextInt());

			int number;
			socketOut = new PrintWriter(connection.getOutputStream(), true);
			do {
				socketOut.flush();
				System.out.print("Enter a number: ");
				number = keyboardIn.nextInt();
				socketOut.println(number);

				System.out.println("Waiting for a answer from the server");
				String answer = socketIn.nextLine();
				System.out.println("The square root is: " + answer);
			} while (number > 0);
			System.out.println("The connection will be closed");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (socketIn != null)
					socketIn.close();
				if (socketOut != null)
					socketOut.close();
				if (connection != null)
					connection.close();
					keyboardIn.close();
			} catch (IOException e) {
				System.err.println("Can't close the connection");
			}
		}
	}
}