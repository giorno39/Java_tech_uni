public class Teacher extends Person {
    private Course course;

    public Teacher(String n, String e, Course c){
        super(n, e);
        this.course = c;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
