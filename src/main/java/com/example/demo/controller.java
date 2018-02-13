package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.Grade;
import com.example.demo.pojo.Student;
import com.example.demo.service.GradeService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hp on 2018/2/11.
 */
@RestController
public class controller {
    @Autowired
    private GradeService gradeService;
    @Autowired
    private StudentService studentService;
    @OneToMany(mappedBy = "grade")
    private Set<Student> students = new HashSet<>();

    @RequestMapping("savegrade")
    public String saveGrade(Grade grade) {
        gradeService.saveGrade(grade);
        return "save_success";
    }

    @RequestMapping("savestudent")
    public String saveStudent(Student s) {
        studentService.save(s);
        return "save_success";
    }

    @RequestMapping("findAllStudent")
    public String findAllStudent() {
        return JSON.toJSONString(studentService.findAll());
    }

    @RequestMapping("findStudentByID")
    public String findStudentByID(Long id) {
        return JSON.toJSONString(studentService.findStudentByStuID(id));
    }

    @RequestMapping("findGradeByID")
    public String findGradeByID(Long id){
        return JSON.toJSONString(gradeService.findGradeByID(id));
    }

    @RequestMapping("findStudentByPage")
    public String findStudentByPage(Integer pageNum, Integer pageSize) {
        Page<Student> page = studentService.findStudentByPage(pageNum, pageSize);
        List<Student> students = page.getContent();
        for (Student student : students) {
            System.out.println(student);
        }
        return JSON.toJSONString(students);
    }
}
