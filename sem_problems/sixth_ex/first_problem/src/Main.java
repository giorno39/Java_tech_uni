import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Voter> voters = new ArrayList<>();
        voters.add(new Voter("Ivan", "Sofia", "Kocho Chestimenski", 6));
        voters.add(new Voter("Georgi", "Plovdiv", "Glavnata", 16));
        voters.add(new Voter("Sasho", "Sofia", "Ivan Vazov", 66));
        voters.add(new Voter("Ico", "Pazardjick", "Hristo Botev", 76));

        voters = voters.stream().
                filter(v ->v.getCity().equals("Sofia")).
                sorted(Comparator.comparing(Voter::getStreet).thenComparing(Voter::getAddress)).
                collect(Collectors.toList());


        for(Voter e: voters){
            System.out.println(e.toString());
        }
    }


}