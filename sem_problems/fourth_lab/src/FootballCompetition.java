import java.util.regex.Pattern;

public class FootballCompetition implements Competition  {
    public double fastestGoal;
    public Participant[] schedule;

    @Override
    public Participant[] getSchedule() {
        return this.schedule;
    }

    public void initSchedule(int n){
        this.schedule = new Participant[n];
    }
}
