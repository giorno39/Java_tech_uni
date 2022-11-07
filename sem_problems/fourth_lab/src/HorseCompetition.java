public class HorseCompetition implements Competition {
    public String breed;
    public Participant[] schedule;

    @Override
    public Participant[] getSchedule() {
        return this.schedule;
    }

    public void initSchedule(int n){
        this.schedule = new Participant[n];
    }
}
