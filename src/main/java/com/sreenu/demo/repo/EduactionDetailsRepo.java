package com.sreenu.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sreenu.demo.entity.EducationDetailsEntity;

@Repository
public interface EduactionDetailsRepo extends JpaRepository<EducationDetailsEntity,Integer>{

}
