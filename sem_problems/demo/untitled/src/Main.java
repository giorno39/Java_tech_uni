import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] numbers;
//        numbers = new int[5];
//        int result = 0;
//
//        Scanner scan = new Scanner(System.in);
//        for(int i =0;i < numbers.length; ++i){
//            numbers[i] = scan.nextInt();
//        }
//
//
//        for (int number : numbers) {
//            System.out.print(number + " ");
//            result += number;
//        }
//
//        System.out.println();
//        System.out.print(""+result);

        main2();
    }
    public static void main2() {
        Utility print = new Utility();
        BankAccount firstUser = new BankAccount();
        BankAccount secondUser = new BankAccount();

        BankAccount[] users;
        users = new BankAccount[2];
        users[0] = firstUser;
        users[1] = secondUser;

        for (BankAccount user : users) {
            float balance;

            print.to_str("Please enter the current balance of you bank account: ");
            user.deposit();

            user.calculateInterest();
            balance = user.getCurrentBalance();

            print.to_str("Your balance after the interest increasement will be: " + balance);
            System.out.println("");

        }
    }


}
