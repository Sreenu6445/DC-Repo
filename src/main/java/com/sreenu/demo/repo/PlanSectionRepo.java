package com.sreenu.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sreenu.demo.entity.PlanSectionEntity;

@Repository
public interface PlanSectionRepo extends JpaRepository<PlanSectionEntity, Integer> {

}
