public abstract class Goods {
    private double price;
    private String number;

    public Goods(){
        this.price = 0;
        this.number = "";
    }

    public Goods(double price, String number) throws PriceException {
        this.setNumber(number);
        this.setPrice(price);
    }

    public abstract void checkPromo(double discount) throws PriceException;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws PriceException {
        if(price < 0) {
            throw new PriceException();
        }
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}


//1211 staq za lab v ponedelnik 11:30