package com.example.demo.service;

import com.example.demo.dao.StudentDao;
import com.example.demo.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hp on 2018/2/11.
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public void save(Student student){
        studentDao.save(student);
    }

    public List<Student> findAll(){
        return studentDao.findAll();
    }

    public Student findStudentByStuID(Long id){
        return studentDao.findOne(id);
    }

    public Page<Student> findStudentByPage(Integer pageNum, Integer pageSize){
        return studentDao.findAll(new PageRequest(pageNum,pageSize,new Sort("stuid")));
    }
}
