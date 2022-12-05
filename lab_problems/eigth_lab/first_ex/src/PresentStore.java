import java.util.ArrayList;

public class PresentStore {
    ArrayList<GetProductsTo>products = new ArrayList<GetProductsTo>();
    ArrayList<DeliveryAPI>devApi = new ArrayList<DeliveryAPI>();

    public PresentStore(Product1 p1, Product2 p2, Product3 p3){
        products.add(p1);
        products.add(p2);
        products.add(p3);
        devApi.add(p1);
        devApi.add(p2);
        devApi.add(p3);
    }

    public ArrayList<GetProductsTo> getProductsByPrice(double maxPrice){
        ArrayList<GetProductsTo> currProducts = new ArrayList<GetProductsTo>(products);
        for(GetProductsTo currProduct: this.products){
            if(currProduct.getPrice() > maxPrice){
                currProducts.remove(currProduct);
            }
        }
        return currProducts;
    }

    public ArrayList<DeliveryAPI> getProductsByDev(String Provider){
        ArrayList<DeliveryAPI> currProducts = new ArrayList<DeliveryAPI>(devApi);
        for(DeliveryAPI currProduct: this.devApi){
            if(!currProduct.getIdOfProvider().equals(Provider)){
                currProducts.remove(currProduct);
            }
        }
        return currProducts;
    }

}
