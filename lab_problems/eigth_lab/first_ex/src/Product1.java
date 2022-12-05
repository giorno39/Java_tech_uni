public class Product1 implements DeliveryAPI, GetProductsTo{
    String type;
    double price;
    String idOfProvider;
    int number;

    public Product1(String type, double price, String idOfProvider, int number){
        this.type = type;
        this.price = price;
        this.idOfProvider = idOfProvider;
        this.number = number;
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
    public String toString() {
        return price +"-"+ idOfProvider;
    }
}
