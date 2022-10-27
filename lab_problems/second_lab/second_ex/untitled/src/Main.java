public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Hristo", "Popov", "22", 3.3, 4.5, 5.5);
        st1.setPIK_grade(4.5);
        System.out.println(st1.getPIK_grade());
    }
}