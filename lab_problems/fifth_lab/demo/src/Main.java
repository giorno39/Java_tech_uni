import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Do you have an account:");
        String answer;
        Scanner scan = new Scanner(System.in);
        User[] users = new User[10];
        answer = scan.nextLine();
        if (answer.equals("yes")) {
            String username;
            System.out.println("Enter username");
            username = scan.nextLine();
            User curr;
            curr = Validators.checkUser(username, users);
            if (curr == null) {
                System.out.println("There is no such user");
            }
        } else {
            String curr_username;
            String password;
            String number;
            System.out.println("Enter username");
            curr_username = scan.nextLine();
            System.out.println("Enter password");
            password = scan.nextLine();
            System.out.println("Enter number");
            number = scan.nextLine();
            User newUser = new User(curr_username, password, number);
            for (int i = 0; i < 10; ++i) {
                if (users[i] == null) {
                    users[i] = newUser;
                }
            }
        }


    }

}