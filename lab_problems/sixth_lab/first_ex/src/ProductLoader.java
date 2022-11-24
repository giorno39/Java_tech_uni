import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProductLoader implements ImportData{
    @Override

    public Object[] importDataFromFile() throws IOException {
        int number_of_products = ProductLoader.getNumberOfRows();
        Object[] products = new Object[number_of_products];
        BufferedReader br = null;
        FileReader toRead = null;
        String[] data = new String[8];
        try {

            String currentLine;

            br = new BufferedReader(toRead);
            int line = 0;

            while ((currentLine = br.readLine()) != null) {
                data = currentLine.split("#");
                String manufacture = data[1];
                String phoneNumber = data[2];
                int inventoryNumber = Integer.parseInt(data[3]);
                double price = Double.parseDouble(data[4]);
                int quantity = Integer.parseInt(data[5]);
                String firstExtraData = data[6];
                String secondExtraData = data[7];

                Provider curr_provider = new Provider(phoneNumber, firstExtraData);
                if(data[0].equals("1")){
                    products[line] = new Electronics(inventoryNumber, price, quantity, curr_provider, firstExtraData, secondExtraData);
                }else{
                    products[line] = new Book(inventoryNumber, price, quantity, curr_provider, firstExtraData, secondExtraData);
                }
                line += 1;
            }

        } catch (IOException | WrongPhoneNumberException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return products;
    }

    public static int getNumberOfRows(){
        BufferedReader br = null;
        int numberOfLines = 0;
        FileReader toRead = null;

        try{
            toRead = new FileReader("./salesproducts.txt");
        }catch (FileNotFoundException e){
            System.err.println("No such file is found");
            return 0;
        }

        try {

            String currentLine;

            br = new BufferedReader(toRead);

            while ((currentLine = br.readLine()) != null) {
                numberOfLines += 1;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return numberOfLines;
    }
}
