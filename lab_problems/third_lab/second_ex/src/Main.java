import javax.sql.rowset.Joinable;

public class Main {
    public static void main(String[] args) {
        Journey euJourney = new Journey("EU", 5,600,4);
        Vacation turkey = new Vacation("EU", 5,600,"Docker");
        euJourney.fixPrice(0.1);
        System.out.println("Price for the journey with transport: "+euJourney.getPrice());
        euJourney.nightsByDays(5);
        turkey.fixPrice(0.4);
        System.out.println("Price for the journey with transport: "+turkey.getPrice());

    }
}