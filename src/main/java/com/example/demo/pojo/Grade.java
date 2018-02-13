package com.example.demo.pojo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hp on 2018/2/11.
 */
@Entity
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq001")
    @SequenceGenerator(name = "seq001",sequenceName = "seq001",allocationSize = 1)
    private Long graID;
    @Column
    private String graname;
    @OneToMany(mappedBy = "grade")
    private Set<Student> students = new HashSet<>();

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "graID=" + graID +
                ", graName='" + graname  +
                '}';
    }

    public Long getGraID() {
        return graID;
    }

    public void setGraID(Long graID) {
        this.graID = graID;
    }

    public String getGraname() {
        return graname;
    }

    public void setGraname(String graname) {
        this.graname = graname;
    }
}
