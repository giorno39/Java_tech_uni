import java.text.DecimalFormat;
import java.util.ArrayList;


public class CStudent {
    public String name;
    public ArrayList<Double> grades;
    public String facultyNum;

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public CStudent(String name, String facultyNum)
    {
        this.name = name;
        this.facultyNum = facultyNum;
        this.grades = new ArrayList<Double>();
    }

    public double getGrades()
    {
        double sum = 0;
        for(double grade : this.grades)
        {
            sum += grade;
        }
        return sum/this.grades.size();
    }

    public void addGrade(double grade)
    {
        this.grades.add(grade);
    }

    public void getInfo()
    {
        System.out.println(this.name + "\n" + this.grades + "\n" + this.getGrades());
    }
}
