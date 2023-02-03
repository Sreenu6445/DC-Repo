package com.sreenu.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sreenu.demo.entity.KidDetailsEntity;

@Repository
public interface KidDetailsRepo extends JpaRepository<KidDetailsEntity, Integer> {

}
