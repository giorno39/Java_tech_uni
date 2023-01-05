import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {

        CCourse javaCourse = new CCourse("Java Course");

        javaCourse.addStudent( "012654", "Pesho");
        javaCourse.addStudent("123456", "Gosho");

        List<Double> randomGrades = new ArrayList<Double>();
        randomGrades.add(5.5);
        randomGrades.add(3.4);

        try {
            javaCourse.addScore("012654", 4.6);
            javaCourse.addScore("123456", 5.6);
            javaCourse.addScores("123456", randomGrades);
        }
        catch(InvalidStudentExc e)
        {
            e.getMessage();
        }

        javaCourse.displayScores();

        javaCourse.addStudent( "234567", "Stamat");

        javaCourse.displayScores();

    }
}