package object;

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
    @GeneratedValue ( strategy = GenerationType.AUTO )
    @Column( name = "student_code" , nullable = false)
    private Integer student_code;
    @Column( name = "full_name", nullable = false)
    private String full_name;
    @Column( name = "group_number", nullable = false)
    private Integer group_number;
    @Column ( name = "year_of_admission", nullable = false)
    private String year_of_admission;

    public Students(){
    }

    public Students(Integer sc, String fn, Integer gn, String yoa){
        this.student_code = sc;
        this.full_name = fn;
        this.group_number = gn;
        this.year_of_admission = yoa;
    }



    public void setStudent_code(Integer student_code) {
        this.student_code = student_code;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getGroup_number() {
        return group_number;
    }

    public void setGroup_number(int group_number) {
        this.group_number = group_number;
    }

    public String getYear_of_admission() {
        return year_of_admission;
    }

    public void setYear_of_admission(String year_of_admission) {
        this.year_of_admission = year_of_admission;
    }

    @Override
    public String toString() {
        return "Student{" + "Student code=" + student_code + ", full_name='" + full_name + '\'' +
                ", group_number=" + group_number +
                ", year_of_admission='" + year_of_admission + '\'' +
                '}';
    }

}
