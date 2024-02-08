package com.Bills.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface RBRepositoryInterface extends JpaRepository<RBDataObjectService, Integer> {

//Repository for RB entity class

       // RBDataObjectService retrievingYear(Integer year);  //This method is intended to be used for retrieving an instance of RBDataObjectService based on the provided year.
       List<RBDataObjectService> findByYear(Integer year);

}
