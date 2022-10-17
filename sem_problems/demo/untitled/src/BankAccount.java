import java.util.Scanner;

public class BankAccount {
    final float INTEREST = 0.02f;
    protected float currentBalance;

    public void deposit(){
        Scanner scan = new Scanner(System.in);
        this.currentBalance = scan.nextInt();
    }

    public void calculateInterest(){
        this.currentBalance *= 1 + INTEREST;
    }

    public float getCurrentBalance(){
        return this.currentBalance;
    }

}
