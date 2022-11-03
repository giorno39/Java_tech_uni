public class SickPatient extends Patient {
    String epicris;
    Boolean isSick;
    int day;

    public SickPatient() {
        super();
        this.epicris = "";
        this.isSick = true;
        this.day = 0;
    }



    public SickPatient(String egn, String user, String location, String epicri, Boolean sick, int date) {
        super(egn, user, location);
        this.epicris = epicri;
        this.isSick = sick;
        this.day = date;
    }


    @Override
    public void cure(String supplementName, int mg) {
        String oldEpicrisis = this.epicris;
        String newEpicrisis = oldEpicrisis+"\n The patient has taken "+mg+"mg of "+supplementName;
        this.epicris = newEpicrisis;
    }

}
