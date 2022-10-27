public class Main {
    public static void main(String[] args) {
        MultiProcessor proces = new MultiProcessor(3, 4, 2.3);
        System.out.println(proces.refreshRateToNormal());
        System.out.println(proces.toString());
        System.out.println(proces.fromNormalToMultiTime(20,2.4));
    }
}