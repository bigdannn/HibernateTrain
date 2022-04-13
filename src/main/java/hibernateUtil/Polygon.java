package hibernateUtil;

public class Polygon {

    public static void main(String[] args) {

        StudentRunner sr = new StudentRunner();

        sr.addStudent(9,"Bogdan Yakovenko", 9, "23.01.2000");
        sr.addStudent(9,"Bogdan Yakovenko", 9, "23.01.2000");
        sr.addStudent(9,"Bogdan Yakovenko", 9, "23.01.2000");
        sr.addStudent(9,"Bogdan Yakovenko", 9, "23.01.2000");

        System.out.println(sr.listStudents());
    }

}