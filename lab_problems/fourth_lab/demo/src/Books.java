public class Books extends Goods{
    String title;
    String author;

    public Books(){
        this.title = "";
        this.author = "";
        try{
            this.setPrice(0);
        }catch (PriceException e){
            e.getMessage();
        }
        this.setNumber("");
    }

    public Books(String title, String author, String number, double price) throws PriceException {
        super(price, number);
        this.title = title;
        this.author = author;
    }

    @Override
    public void checkPromo(double discount) throws PriceException {
        double curr_price = this.getPrice();
        double new_price = curr_price - (curr_price * discount);
        this.setPrice(new_price);

    }
}
