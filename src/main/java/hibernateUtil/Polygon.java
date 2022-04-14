package hibernateUtil;

import java.util.ArrayList;

public class Polygon {

    public static void main(String[] args) {

        StudentsUtil sr = new StudentsUtil();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        names.add("Bog");
        names.add("Bogdan");
        numbers.add(2);
        numbers.add(4);

        sr.addStudent(9,"Bogdan", 9, "23.01.2000");
        sr.addStudent(9,"Yakovenko", 9, "23.01.2000");
        sr.addStudent(9,"Bogovenko", 9, "23.01.2000");
        sr.addStudent(9,"Bog", 9, "23.01.2000");

        System.out.println(sr.listStudents());
        System.out.println(sr.listStudentsById(numbers));
        System.out.println(sr.listStudentsByIdName(names));
    }

}