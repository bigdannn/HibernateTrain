package hibernateUtil;

import object.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class StudentRunner {
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {
       sessionFactory = new Configuration().configure().buildSessionFactory();

       StudentRunner studentRunner = new StudentRunner();



    }
    public void addStudent(Integer sc, String fn, Integer gn, String yoa){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Student student = new Student(sc, fn, gn, yoa);
        session.save(student);
        transaction.commit();
        session.close();
    }

    public List listStudents() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List developers = session.createQuery("FROM Students").list();

        transaction.commit();
        session.close();
        return developers;
    }
}
