import java.util.Scanner;

public class first_lab {

    public static void main(String[] args) {
//-------------------- ex 10 ------------------------
//        String type;
//        Scanner scan = new Scanner(System.in);
//        type = scan.nextLine();
//        switch (type){
//            case "int":
//                System.out.println("Enter a integer");
//                int number;
//                number = scan.nextInt();
//                System.out.println(number + 1);
//            case "double":
//                System.out.println("Enter a double");
//                double realNumber;
//                realNumber = scan.nextDouble();
//                System.out.println(realNumber + 1);
//            case "String":
//                System.out.println("Enter a string");
//                String str;
//                str = scan.nextLine();
//                System.out.println(str+"*");
//        }
//        ----------- ex 11 ------------------
//        int num;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number");
//        num = scan.nextInt();
//        for(int i = 1; i <=num;i++){
//            System.out.println(i);
//        }
//    }
//


        // -------------- ex 12 -------------------
//        int num;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("How many number do you want to enter");
//        num = scan.nextInt();
//        int[] numbers = new int[num];
//        System.out.println("Enter you numbers on new lines");
//        for(int i = 0; i < num; i++){
//            numbers[i] = scan.nextInt();
//        }
//        int largestValue = Integer.MIN_VALUE;
//        int smallesValue = Integer.MAX_VALUE;
//        int sum = 0;
//        for(int i = 0; i < num; i++){
//            if(numbers[i] > largestValue){
//                largestValue = numbers[i];
//            }
//            if(numbers[i] < smallesValue){
//                smallesValue = numbers[i];
//            }
//            sum += numbers[i];
//        }
//        System.out.println("The largest number is: "+largestValue);
//        System.out.println("The smallest number is: "+smallesValue);
//        System.out.println("The sum of the numbers is: "+sum);
//        int average = sum / numbers.length;
//        System.out.println("The average value of the array is: "+average);
//
        // -------------------------- ex 13 -----------------------
        double[] numbers = new double[10];
        double sum = 0;
        //TODO move all scan declarations outside the cycle
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            numbers[i] = scan.nextDouble();
            sum += numbers[i];
        }
        sum = Math.round(sum * 100.0) / 100.0;
        System.out.println("The sum of the arrays is: "+sum);
}



    // ------------------ ex 1 --------------------
    public static int SumOfThree() {
        Scanner scan = new Scanner(System.in);
        int first, second, third, sum;
        System.out.print("Enter three numbers: ");
        first = scan.nextInt();
        second = scan.nextInt();
        third = scan.nextInt();

        sum = first + second + third;
        return sum;
    }

    // ------------------- ex 2 -------------------
    public static int GtNum() {
        int first, second, greater;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers");
        first = scan.nextInt();
        second = scan.nextInt();

        greater = (first > second) ? first : second;
        return greater;

    }

    // --------------------- ex 3 --------------------
    public static int SumOfFive() {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            int curr_num;
            curr_num = scan.nextInt();
            sum += curr_num;

        }
        return sum;
    }

    // ------------------ ex 4 -------------------------
    public static int[] SumOfDigits() {
        int[] numbers = new int[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers");
        for (int i = 0; i <= 2; i++) {
            numbers[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }
        for (int i = 0; i < numbers.length - 2; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }

        return numbers;
        // TODO Get this in the main method to make it work
//        int[] numbers;
//        numbers = SumOfDigits();
//        int sumOfLargest;
//        int sumOfLowest;
//        sumOfLargest = numbers[2] + numbers[1];
//        sumOfLowest = numbers[1] + numbers[0];
//        System.out.println("Sum of the 2 largest numbers: "+sumOfLargest);
//        System.out.println("Sum of the 2 numbers with lowest values: "+sumOfLowest);
//        System.out.println(numbers[1]);

    }

    // ----------------------- ex 5 ---------------------
    public static double SwapAndPrint() {
        double x, y;
        System.out.println("Enter two numbers:");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;

        if (x > y) {
            return x;
        }
        return y;
    }

    // --------------------- ex 6 --------------------
    public static int GreatestNum() {
        int[] numbers = new int[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            numbers[i] = scan.nextInt();
        }
        int largest_num = Integer.MIN_VALUE;
        for (int i = 0; i <= 2; i++) {
            if (numbers[i] > largest_num) {
                largest_num = numbers[i];
            }
        }
        return largest_num;
    }

    // ----------------------- ex 7 ----------------------
    public static double[] DescSortingOfThree() {
        double first, second, third;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        first = scan.nextDouble();
        second = scan.nextDouble();
        third = scan.nextDouble();
        if (first > second & first > third) {
            if (second > third) {
                return new double[]{first, second, third};
            } else {
                return new double[]{first, third, second};
            }
        }
        if (second > third & second > first) {
            if (third > first) {
                return new double[]{second, third, first};
            } else {
                return new double[]{second, first, third};
            }
        }
        if (third > second & third > first) {
            if (second > first) {
                return new double[]{third, second, first};
            } else {
                return new double[]{third, first, second};
            }
        }
        return new double[0];
        // TODO Get this in the main method to make it work
//        double[] numbers;
//        numbers = DescSortingOfThree();
//        for (double number : numbers) {
//            System.out.println(number);
//        }
    }

    // ------------------------ ex 8 -----------------------
    public static String NameOfNumber(){
        int num;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        switch (num){
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
        }
        return "not a digit";
    }
// -------------------- ex 9 ----------------
    public static int GreatestNumOfFive() {
        int[] numbers = new int[5];
        System.out.println("Enter five number on new lines:");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = scan.nextInt();
        }
        int largest_num = Integer.MIN_VALUE;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] > largest_num) {
                largest_num = numbers[i];
            }
        }
        return largest_num;
    }
}

