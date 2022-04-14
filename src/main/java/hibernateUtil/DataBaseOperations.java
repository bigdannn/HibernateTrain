package hibernateUtil;

import java.util.List;

public interface DataBaseOperations {

    void addStudent(Integer student_code, String full_name, Integer group_number, String year_of_admission);
    List listStudents();
    List listStudentsByIdName(List<String> names);
    List listStudentsById(List<Integer> ids);
}
