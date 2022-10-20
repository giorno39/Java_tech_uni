import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        zapzva chas pri veterinaren lekar, pozdrav, - isk li chas za poseshtenie, svobodni chasove
        // opcii za chas -> poroda na jivotnoto, oplakvaniq i tn.
        //v masic svobodnite chasove
        String[] freeHours = {"9:30", "10:45", "12:00", "14:30", "15:45"};
        System.out.println("Hello this is the cute animals vet, do you want to get an hour?\n" +
                "Yes: Type Y\nNo type N");

        Scanner scan = new Scanner(System.in);
        String hourCond;
        hourCond = scan.nextLine();
        switch (hourCond) {
            case "Y" -> {
                System.out.println("There are a few hours available:");
                for (String hour : freeHours) {
                    System.out.println(hour);
                }
                System.out.println("Enter the hour you liked, what type of animal it is" +
                        " and what is the problem with him");
                String likedHour;
                String typeOfAnimal;
                String problem;
                likedHour = scan.nextLine();
                typeOfAnimal = scan.nextLine();
                problem = scan.nextLine();
                System.out.println("You successfully made an appointment at " + likedHour + " for your " + typeOfAnimal + "" +
                        "we will try to cure that " + problem);
            }
            case "N" -> System.out.println("Thanks for passing by");
        }
    }
}