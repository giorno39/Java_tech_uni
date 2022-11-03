public abstract class BaseVacation {
    private String destination;
    private int days;
    private double price;

    public BaseVacation(String goal, int day, double money){
        this.destination = goal;
        this.days = day;
        this.price = money;
    }

    public abstract void fixPrice(double percent);

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
