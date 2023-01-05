import java.util.ArrayList;
import java.util.List;

public class CCourse {

    public List<CStudent> students;
     private String name;

    public CCourse(String name)
    {
        this.name = name;
        this.students = new ArrayList<CStudent>();
    }

    public void addScore(String fn, double grade) throws InvalidStudentExc {
        for(CStudent currStudent: this.students)
        {
            if(currStudent.facultyNum.equals(fn))
            {
                currStudent.addGrade(grade);
                return;
            }
        }
        throw new InvalidStudentExc("There is no such student");
    }

    public void addScores(String fn, List<Double> grades) throws InvalidStudentExc {
        for(CStudent currStudent: this.students)
        {
            if(currStudent.facultyNum.equals(fn))
            {
                currStudent.grades.addAll(grades);
                return;
            }
        }
        throw new InvalidStudentExc("There is no such student");
    }

    public void displayScores()
    {
        for(CStudent students : students)
        {
            students.getInfo();
        }
    }

    public void addStudent(String fn, String name)
    {
        CStudent newStudent = new CStudent(name, fn);
        this.students.add(newStudent);
    }

    public String getName() {
        return name;
    }
}
