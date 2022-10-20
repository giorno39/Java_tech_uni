import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        BMICalculator.printIntroduction();
        Scanner scan = new Scanner(System.in);
        double BMI;
        BMI = BMICalculator.getBMI(scan);
        String status;
        status = BMICalculator.getStatus(BMI);
        int x = 1;
        BMICalculator.ReportResult(x, BMI, status);

    }
}