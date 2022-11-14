public class Main {
    public static void main(String[] args) throws PriceException {
        Books book = new Books("Ruined King", "Phreak", "1-345", 4.5);
        Television tv = new Television("G500", "Samsung", 250, 2000.99, "0749-5");



        tv.checkPromo(0.09);
        book.checkPromo(0.15);
        System.out.println(tv.getPrice());
        System.out.println(book.getPrice());
        try{
        Books book3 = new Books("Ruined King", "Phreak", "1-345", -4.5);
        }catch (PriceException e){
            System.err.println(e.getMessage());
        }
        System.out.println("It continued");

        try {
            tv.CalcConsumption(10000);
        }catch(PowerException e){
            System.err.println(e.getMessage());
        }
        }

    }
