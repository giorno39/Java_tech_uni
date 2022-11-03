public class Vacation extends BaseVacation{
    private String nameOfHOtel;

    public Vacation(String goal, int day, double money, String hotel){
        super(goal, day, money);
        this.nameOfHOtel = hotel;
    }



    @Override
    public void fixPrice(double percent) {
        double oldPrice = this.getPrice();
        double newPrice = oldPrice + (oldPrice * percent);
        this.setPrice(newPrice);
    }

    public String getNameOfHOtel() {
        return nameOfHOtel;
    }

    public void setNameOfHOtel(String nameOfHOtel) {
        this.nameOfHOtel = nameOfHOtel;
    }
}
