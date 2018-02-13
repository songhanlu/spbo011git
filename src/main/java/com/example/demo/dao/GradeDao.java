package com.example.demo.dao;

import com.example.demo.pojo.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hp on 2018/2/11.
 */
public interface GradeDao extends JpaRepository<Grade,Long>{

}
