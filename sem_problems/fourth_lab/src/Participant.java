public class Participant {
    public int id;
    public String name;
    public int age;
    public double chanceToWin;
    public double betForWin;

    public Participant(){
        this.id = 0;
        this.name = "";
        this.age = 0;
        this.chanceToWin = 0.0;
        this.betForWin = 0.0;
    }

    public Participant(String id, String name, int age, double chanceToWin, double betForWin){
        this.id = id;
        this.name = name;
        this.age = age;
        this.chanceToWin = chanceToWin;
        this.betForWin = betForWin;
    }
}
