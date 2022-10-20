import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String name = "Vasko";
//        printName(name);
        int i = 1;
//        modifyMethod(i);

        int[] arr = {1,2,3};
        modifyMethod(arr);
        System.out.println(Arrays.toString(arr));


    }
//    public static void printName(String s){
//        System.out.println(s);
//        printName();
//    }
    // will work
//    public static void printName(){
//        System.out.println("Nasko");
//    }
//
    public static void modifyMethod(int[] arr){ // rabotim s kopie na dannite, a ako e referenten tip(arr) shte se promeni
        // stoinostta v stacka na masiv e pointer i zatova kato gi podavame se promenqt
        for(int i = 0;i < arr.length; i++){
            arr[i]++;
        }
    }
}