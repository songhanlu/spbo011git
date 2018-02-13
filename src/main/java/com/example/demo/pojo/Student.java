package com.example.demo.pojo;

import javax.persistence.*;

/**
 * Created by hp on 2018/2/11.
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq002")
    @SequenceGenerator(name = "seq002",sequenceName = "seq002",allocationSize = 1)
    private Long stuid;
    @Column(name = "stuname")
    private String stuName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gra_id")
    private Grade grade;

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", stuName='" + stuName + '\'' +
                '}';
    }

    public Long getStuid() {
        return stuid;
    }

    public void setStuid(Long stuid) {
        this.stuid = stuid;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
