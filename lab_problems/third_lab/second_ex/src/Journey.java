public class Journey extends BaseVacation implements numOfNigths{
    private int numOfHotels;

    public Journey(String goal, int day, double money, int hotels){
        super(goal, day, money);
        this.numOfHotels = hotels;
    }

    @Override
    public void fixPrice(double percent) {
        double oldPrice = this.getPrice();
        double newPrice = oldPrice + (oldPrice * percent);
        this.setPrice(newPrice);
    }

    @Override
    public void nightsByDays(int days) {
        int overnight_stays = days - 1;
        System.out.println("You are gonna have "+overnight_stays+"overnight stays");
    }

    public int getNumOfHotels() {
        return numOfHotels;
    }

    public void setNumOfHotels(int numOfHotels) {
        this.numOfHotels = numOfHotels;
    }


}
