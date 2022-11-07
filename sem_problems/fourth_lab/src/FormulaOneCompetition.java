public class FormulaOneCompetition implements Competition {
    public String winnersTime;
    public Participant[] schedule;

    @Override
    public Participant[] getSchedule() {
        return this.schedule;
    }

    public void initSchedule(int n){
        this.schedule = new Participant[n];
    }
}
