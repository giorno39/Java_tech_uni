public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop(200, "interl i3", 8, 1024);
        Laptop l2 = new Laptop(200, "interl i5", 16, 2092);
        System.out.println(l2.isBetter(l1));
        System.out.println(l1.toString());
    }
}