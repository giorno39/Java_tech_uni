public class Main {
    public static void main(String[] args) {
        Car Mclaren = new Car(320, "Mclaren P1", 280000, 800);
        HoverCraft Pippo = new HoverCraft(60, "Pippo Twelve", 9000, 10);
        Ship Titanic = new Ship(120, "Titanic", 823000, 1300);

        System.out.println("Mclaren old Price"+Mclaren.getPrice()+"\nNew Price"+Mclaren.checkPromo());
        System.out.println("Pippo old Price"+Pippo.getPrice()+"\nNew Price"+Pippo.checkPromo());
        System.out.println("Titanic old Price"+Titanic.getPrice()+"\nNew Price"+Titanic.checkPromo());
        Mclaren.enterLand();
    }
}