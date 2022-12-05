public class Product3 implements DeliveryAPI, GetProductsTo{
    String type;
    double price;
    String idOfProvider;
    int number;

    int quantity;

    public Product3(String type, double price, String idOfProvider, int number, int quantity){
        this.type = type;
        this.price = price;
        this.idOfProvider = idOfProvider;
        this.number = number;
        this.quantity = quantity;
    }


    @Override
    public int getNumber(String idOfProvider) {
        if(this.idOfProvider.equals(idOfProvider)){
            return number;
        }else{
            return 0;
        }
    }

    @Override
    public String getType(String idOfProvider) {
        if(this.idOfProvider.equals(idOfProvider)){
            return type;
        }else{
            return null;
        }
    }

    @Override
    public String getIdOfProvider() {
        return this.idOfProvider;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return price +"-"+ idOfProvider;
    }
}
