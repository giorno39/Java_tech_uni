import java.text.DecimalFormat;
import java.util.ArrayList;


public class CStudent {
    public String name;
    public ArrayList<Double> grades;
    public String facultyNum;


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
        if (sum == 0)
        {
            return 0;
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
