public class Book extends Product {
    String author;
    String title;

    public Book(int inventoryNumber, double price, int quantity, Provider provider, String author, String title) {
        super(inventoryNumber, price, quantity, provider);
    }

    @Override
    public double getPromotionalPrice() {
        double discount = this.price * 0.5;
        this.price -= discount;
        return discount;
    }

    @Override
    public boolean sellProduct(int piece) throws NoMoreProductsException {
        if (piece < this.quantity) {
            this.quantity -= piece;
            return true;
        } else {
            throw new NoMoreProductsException();
        }
    }
}
