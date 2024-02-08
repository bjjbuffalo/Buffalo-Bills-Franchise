package com.Bills.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface RBRepositoryInterface extends JpaRepository<RBDataObjectService, Integer> {

//Repository for RB entity class

       List<RBDataObjectService> findByYear(Integer year); //there will be multiple rb's

}
