import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        findSum();

    }
    public static void swapTwoNumbers(){
        double a, b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();
        b = scan.nextDouble();
        if(a > b){
            a = a + b;
            b = a - b;
            a = a - b;
        }
        System.out.println(""+a+" "+b);
    }
    public static void multiplyPoints(){
        int points;
        Scanner scan = new Scanner(System.in);
        points = scan.nextInt();
        if(points >= 1 & points<=3){
            points *= 10;
            System.out.println(points);
        }else if(points >= 4 & points <= 6){
            points *= 100;
        }else if(points >= 7 & points <= 9){
            points *= 1000;
            System.out.println(points);
        }else{
            System.out.println("invalid result");
        }
    }
    public static void typeOfResult(){
        boolean zeroCondition = false;
        int negativeCondition = 0;
        double x, y, z;
        Scanner scan = new Scanner(System.in);
        x = scan.nextDouble();
        y = scan.nextDouble();
        z = scan.nextDouble();
        double[] numbers  = {x, y, z};
        for(double num: numbers){
            if(num == 0){
                zeroCondition = true;
                break;
            }
            if(num < 0){
                negativeCondition++;
            }
        }
        if(zeroCondition){
            System.out.println(0);
        }else if(negativeCondition % 2 == 1){
            System.out.println("-");
        }else{
            System.out.println("+");
        }
    }

    public static void printNumbers(){
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(int i = 1;i <= n; i++){
            if(i % 3 == 0){
                break;
            }else if(i % 7 == 0){
                break;
            }else {
                System.out.print(i+" ");
            }
        }
    }

    public static void pyramid(){
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void matrixGen(){
        int n;
        int[] numbers = new int[20];
        for(int i = 0;i < 20; i++){
            numbers[i] = i+ 1;
        }
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(numbers[j]+" ");
                numbers[j] += 1;
            }
            System.out.println();
        }
    }

    public static void checkEqual(){
        int n = 3;
        int[] firstArr = new int[n], secondArr =  new int[n];
        Scanner scan = new Scanner(System.in);
        firstArr = fillArray(n, firstArr, scan);
        secondArr = fillArray(n, secondArr, scan);
        if(Arrays.equals(firstArr, secondArr)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

    }

    public static int[] fillArray(int index, int[] arr, Scanner s){
        System.out.println("Enter array");
        for(int i = 0;i< index; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void checkIfAsc(){
        System.out.println("Enter how many numbers do you want to enter");
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int[] numbers = new int[n];
        int[] cloned_nums = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = scan.nextInt();
        }
        cloned_nums = numbers.clone();
        Arrays.sort(numbers);
        if(Arrays.equals(cloned_nums, numbers)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
    public static void checkMirror(){
        System.out.println("Enter how many numbers do you want to enter");
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = scan.nextInt();
        }
        boolean isMirror = true;
        for(int i = 0; i < n; i++){
            if(numbers[i] != numbers[n - i - 1]){
                isMirror = false;
            }
        }
        if(isMirror){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void checkEquals(){
        System.out.println("Enter how many numbers do you want to enter");
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            int first = numbers[i];
            for(int j = i + 1; j < n; j++){
                int second = numbers[j];
                if(first == second){
                    System.out.println(first);
                }
            }
        }
    }

    public static void findSum(){
        System.out.println("Enter how many numbers do you want to enter");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sum you are searching for");
        int sum;
        int n;
        n = scan.nextInt();
        sum = scan.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            boolean foundCond = false;
            int first = numbers[i];

            for(int j = i + 1; j < n; j++){
                int second = numbers[j];

                if(first + second == sum){
                    System.out.println(first+", "+second);
                    foundCond = true;
                    break;
                }
                }
            if(foundCond){
                break;
            }
            }
        }
    }

