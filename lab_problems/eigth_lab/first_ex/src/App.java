import java.util.ArrayList;

public class App {
    Product1 p1 = new Product1("Food", 67.6, "007", 23);
    Product2 p2 = new Product2("Food", 78.8, "006", 26, 5);
    Product3 p3 = new Product3("Electrical", 550.79, "007", 33, 6);

    PresentStore currentStore = new PresentStore(p1, p2, p3);

    ArrayList<GetProductsTo>products = currentStore.getProductsByPrice(100.10);
    ArrayList<DeliveryAPI>devApi = new ArrayList<DeliveryAPI>(currentStore.getProductsByDev("007"));


    public void printOutByPrice(){
        System.out.println(this.products);
    }

    public void PrintOutByDev(){
        System.out.println(this.devApi);
    }




}
