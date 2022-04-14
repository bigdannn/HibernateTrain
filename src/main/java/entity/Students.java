package entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "Students")
public class Students implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_code", nullable = false)
    private Integer studentCode;
    @Column(name = "full_name", nullable = false)
    private String fullName;
    @Column(name = "group_number", nullable = false)
    private Integer groupNumber;
    @Column(name = "year_of_admission", nullable = false)
    private String yearOfAdmission;

    public Students() {
    }

    public Students(Integer studentCode, String fullName, Integer groupNumber, String yearOfAdmission) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.groupNumber = groupNumber;
        this.yearOfAdmission = yearOfAdmission;
    }

    public Integer getStudentCode() {return studentCode; }

    public String getFull_name() {
        return fullName;
    }

    public int getGroup_number() {
        return groupNumber;
    }

    public String getYear_of_admission() {
        return yearOfAdmission;
    }

    @Override
    public String toString() {
        return "Student{" + "Student code=" + studentCode + ", full_name='" + fullName + '\'' +
                ", group_number=" + groupNumber +
                ", year_of_admission='" + yearOfAdmission + '\'' +
                '}';
    }
}
