package hibernateUtil;

import entity.Students;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class StudentsUtil implements DataBaseOperations{
    private static Session session = HibernateUtil.getSessionFactory().openSession();

    public void addStudent(Integer studentCode, String fullName, Integer groupNumber, String yearOfAdmission) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Students student = new Students(studentCode, fullName, groupNumber, yearOfAdmission);
        session.save(student);
        transaction.commit();
        session.close();
    }

    public List listStudents() {
        Transaction transaction = session.beginTransaction();
        List<Students> from_students = session.createQuery("FROM Students").list();

        transaction.commit();
        return from_students;
    }

    public List listStudentsByIdName(List<String> names) {

        Transaction transaction = session.beginTransaction();
        List<Students> students_by_names = new ArrayList<>();
        List<Students> from_students = session.createQuery("FROM Students").list();
        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < from_students.size(); j++) {
                if (names.get(i).equals(from_students.get(j).getFull_name())) {
                    students_by_names.add(from_students.get(j));
                }
            }
        }
        transaction.commit();
        session.close();
        return students_by_names;
    }
    public List listStudentsById(List<Integer> ids) {

        Transaction transaction = session.beginTransaction();
        List<Students> students_by_id = new ArrayList<>();
        List<Students> from_students = session.createQuery("FROM Students").list();
        for (int i = 0; i < ids.size(); i++) {
            for (int j = 0; j < from_students.size(); j++) {
                if (ids.get(i).equals(from_students.get(j).getStudentCode())) {
                    students_by_id.add(from_students.get(j));
                }
            }
        }

        transaction.commit();
        return students_by_id;
    }
}
