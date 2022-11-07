import java.util.Random;
public class CreateEvent {
    Competition typeOfEvent;
    int counter = 0;

    public static Competition getEvent(String competitionType){
        if(competitionType.equals("FootballCompetition")){
            return new FootballCompetition();
        }else if(competitionType.equals("HorseCompetition")){
            return new HorseCompetition();
        }else if(competitionType.equals("FormulaOneCompetition")){
            return new FormulaOneCompetition();
        }
        return null;
    }

    public static void fillSchedule(Competition ob, Participant[] schedule){
        ob.initSchedule(schedule.length);
        Random rand = new Random();
        for(Participant participant: schedule){
            double double_random=rand.nextDouble();
            participant.chanceToWin = double_random + 5;
            participant.betForWin = rand.nextInt(10);
        }
    }

    static void bets(Competition ob, int id, double bet){
        Participant[] curr_schedule;
        curr_schedule = ob.getSchedule();
        for(Participant participant: curr_schedule){
            if(participant.id == id){
                double new_bet = participant.betForWin;
                double old_bet = participant.betForWin;
                old_bet += bet;
                old_bet /= old_bet;
                new_bet -= old_bet;
                if(old_bet < 1.1){
                    new_bet = 1.1;
                }
                participant.chanceToWin = new_bet;
            }

        }

    }
}
