package com.example.demo.service;

import com.example.demo.dao.GradeDao;
import com.example.demo.pojo.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hp on 2018/2/11.
 */
@Service
public class GradeService {
    @Autowired
    private GradeDao gradeDao;

    public void saveGrade(Grade grade){

        gradeDao.save(grade);
    }

    public Grade findGradeByID(Long id) {
        return gradeDao.findOne(id);
    }
}
