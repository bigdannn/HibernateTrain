package HibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Polygon {

    public static void main(String[] args) {

        StudentRunner sr = new StudentRunner();
        System.out.println(sr.listStudents());
//        sr.addStudent(9,"Bogdan Yakovenko", 9, "23.01.2000");
    }

}