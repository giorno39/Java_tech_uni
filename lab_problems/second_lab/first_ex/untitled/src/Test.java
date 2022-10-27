public class Test {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.setName("Ivan");
//        System.out.println(p1.getName());
//        Person p2 = new Person("Georgi", "02...10");
//        System.out.println(p2.getName());

        Course c1 = new Course("Java programming");
        Course c2 = new Course("Algorithms with C");
        Course c3 = new Course("Semiconductors");

        Teacher t1 = new Teacher("ALex", "89..10", c1);
        Teacher t2 = new Teacher("Petar", "89..10", c2);
        Teacher t3 = new Teacher("Gosho", "89..10", c3);
        Teacher[] teachers = {t1, t2, t3};
        for(Teacher teacher: teachers){
            System.out.println("Hello i am "+teacher.getName());
            System.out.print("I will be you teacher for the discipline named: ");
            System.out.println(teacher.getCourse().getCourseName());
        }
    }
}
