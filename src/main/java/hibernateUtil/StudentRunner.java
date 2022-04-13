package hibernateUtil;

import object.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class StudentRunner {
    private static Session session = HibernateUtil.getSessionFactory().openSession();

    public static void main(String[] args) {
       session = HibernateUtil.getSessionFactory().openSession();

       StudentRunner studentRunner = new StudentRunner();



    }
    public void addStudent(Integer sc, String fn, Integer gn, String yoa){
        Session session = HibernateUtil.getSessionFactory().openSession();;
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Student student = new Student(sc, fn, gn, yoa);
        session.save(student);
        transaction.commit();
        session.close();
    }

    public List listStudents() {
        Transaction transaction = session.beginTransaction();
        List<Student> from_students = session.createQuery("FROM Student").list();

        transaction.commit();
        session.close();
        return from_students;
    }
}
