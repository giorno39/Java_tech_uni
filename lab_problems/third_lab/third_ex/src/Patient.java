public abstract class Patient {
    private String EGN;
    private String name;
    private String adress;

    public Patient(){
        this.EGN = "";
        this.name ="";
        this.adress = "";
    }

    public Patient(String egn, String user, String location){
        this.EGN = egn;
        this.name = user;
        this.adress = location;
    }

    public abstract void cure(String supplementName, int mg);

    public String getEGN() {
        return EGN;
    }

    public void setEGN(String EGN) {
        this.EGN = EGN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
