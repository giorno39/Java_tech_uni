import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		int port = 1234;
		ServerSocket serverSocket = null;
		Socket connection = null;
		Scanner socketIn = null;
		PrintWriter socketOut = null;
		try {
			serverSocket = new ServerSocket(port);

			while (true) {

				System.out.println("Server is listening");
				connection = serverSocket.accept();

				System.out.println("A client was connected");
				System.out.println("The server will calculate the square root of the number");
				socketOut = new PrintWriter(connection.getOutputStream(), true);
//				System.out.println("Enter a number: ");
				socketIn = new Scanner(new BufferedReader(new InputStreamReader(connection.getInputStream())));

				int number = 0;
				do {
					socketOut.flush();
					number = socketIn.nextInt();

                    double squareRoot;
                    squareRoot = Math.sqrt(number);
					if(number > 0){
					System.out.println("I've received a valid number");
                    socketOut.println("The square root of the number you entered is "+ squareRoot);
					}
				} while (number > 0);
				socketOut.println("Can't find the square root of a negative number");
				System.out.println("The server will be closed");
			}
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
			} catch (IOException e) {
				System.err.println("The socket can't be closed");
			}
		}
	}
}