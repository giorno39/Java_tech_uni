import java.util.Scanner;

public class BMICalculator {
    public static void printIntroduction(){
        System.out.println("BMI калкулаторът пресмята вашият индекс по определена " +
                "формула, спрямо теглото, което ще му подадете.");
    }
    public static double getBMI(Scanner scanner){
        int height;
        double weight;
        System.out.println("Enter your height in inches");
        height = scanner.nextInt();
        System.out.println("Enter your weight in pounds");
        weight = scanner.nextDouble();
        return BMIFor(height, weight);

    }

    public static double BMIFor(int h, double w){
        double bodyMassIndex;
        bodyMassIndex = w*703/(h*h);
        return bodyMassIndex;
    }

    public static String getStatus(double BMI){
        String statusType;
        if(BMI < 18.5){
            statusType = "underweight";
        } else if (BMI < 25) {
            statusType = "normal";
        } else if (BMI < 30) {
            statusType = "overweight";
        } else if (BMI >= 30) {
            statusType = "obese";
        }else{
            statusType = "got an unvalid BMI";
        }
        return statusType;
    }
    public static void ReportResult(int x,double BMI, String status){
        BMI = Math.round(BMI*100.0)/100.0;
        System.out.println("Person with number "+x+" has a BMI equal to "+BMI+" you can consider yourself "+status);
    }
}
