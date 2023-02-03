package com.sreenu.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sreenu.demo.entity.IncomeDetailsEntity;

@Repository
public interface IncomeDetailsRepo extends JpaRepository<IncomeDetailsEntity, Integer> {

}
