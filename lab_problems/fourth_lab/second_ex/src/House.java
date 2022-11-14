//клас House, който допълнително задава брой етажи (цяло число) и име на
//        собственик (низ с произволна дължина).

import java.util.Scanner;

public class House extends Building {
    private int floors;
    private String owner;

    public House(int floors, String owner,int height, double surface, String adress) throws NegativeHeightExceptions, NegativeSurface {
        super(height, surface, adress);
        this.floors = floors;
        this.owner = owner;
    }

    public static House createHouse() throws NegativeHeightExceptions, NegativeSurface {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter floors");
        int curr_floors = scan.nextInt();
        scan.nextLine();
        System.out.println("Please Enter owner");
        String curr_owner = scan.nextLine();
        System.out.println("Please Enter height");
        int curr_height = scan.nextInt();
        System.out.println("Please Enter surface");
        double curr_surface = scan.nextDouble();
        scan.nextLine();
        System.out.println("Please Enter adress");
        String curr_adress = scan.nextLine();

        return new House(curr_floors, curr_owner, curr_height, curr_surface, curr_adress);

    }

    public void printHouse(){
        System.out.println("This house has "+this.floors+"floors, it's surface is"+this.getSurface());
    }


    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
