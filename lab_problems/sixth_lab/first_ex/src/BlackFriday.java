import org.w3c.dom.ls.LSOutput;

import java.io.IOException;

public class BlackFriday {
    Electronics[] electronics = new Electronics[2];
    Book[] books = new Book[2];
    int idx = 0;

    void processSales(){
        ProductLoader loader = new ProductLoader();
        int numbersOfProducts = ProductLoader.getNumberOfRows();
        Object[] products = new Object[numbersOfProducts];

        try {
            products = loader.importDataFromFile();
        } catch (IOException e) {
            System.err.println("No such file found");
        }
        for (Object product : products) {

            if (!(product instanceof Book)){
                Book restored = (Book) product;
                restored.getPromotionalPrice();
                products[idx] = restored;
            }else{
                    Electronics restored = (Electronics) product;
                    restored.getPromotionalPrice();
                    products[idx] = restored;
            }
            idx += 1;
        }

    }

}
