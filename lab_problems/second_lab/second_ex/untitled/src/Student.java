public class Student extends People{
    private String fNum;
    private double PIK_grade;
    private double TE_grade;
    private double PPE_grade;

//    public Student(){
//        super();
//        this.fNum = "";
//        this.PIK_grade = 0.0;
//        this.TE_grade = 0.0;
//        this.PPE_grade = 0.0;
//    }
    public Student(String f, String s, String date, double p, double t, double ppe){
        super(f, s, date);
        this.fNum = "";
        this.PIK_grade = p;
        this.TE_grade = t;
        this.PPE_grade = ppe;
    }

    public String getfNum() {
        return fNum;
    }

    public void setfNum(String fNum) {
        this.fNum = fNum;
    }

    public double getPIK_grade() {
        return PIK_grade;
    }

    public void setPIK_grade(double PIK_grade) {
        System.out.println("The student has attended a test and his grade has changed to "+PIK_grade);
        this.PIK_grade = PIK_grade;
    }

    public double getTE_grade() {
        return TE_grade;
    }

    public void setTE_grade(double TE_grade) {
        System.out.println("The student has attended a test and his grade has changed to "+TE_grade);
        this.TE_grade = TE_grade;
    }

    public double getPPE_grade() {
        return PPE_grade;
    }

    public void setPPE_grade(double PPE_grade) {
        System.out.println("The student has attended a test and his grade has changed to "+PPE_grade);
        this.PPE_grade = PPE_grade;
    }
}
