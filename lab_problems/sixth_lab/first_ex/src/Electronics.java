public class Electronics extends Product{
    String manufacturer;
    String model;

    public Electronics(int inventoryNumber, double price, int quantity, Provider provider,String manufacturer, String model) {
        super(inventoryNumber, price, quantity, provider);
        this.manufacturer = manufacturer;
        this.model = model;
    }


    @Override
    public double getPromotionalPrice() {
        double discount = this.price * 0.1;
        this.price -= discount;
        return this.price;
    }

    @Override
    public boolean sellProduct(int piece) throws NoMoreProductsException {
        if(piece < this.quantity){
            this.quantity -= piece;
            return true;
        }else{
            throw new NoMoreProductsException();
        }
    }
}
