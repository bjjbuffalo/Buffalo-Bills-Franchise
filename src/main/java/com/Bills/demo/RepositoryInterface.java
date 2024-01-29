package com.Bills.demo;

import com.Bills.demo.QBDataObjectService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
//Repository for QB entity class
public interface RepositoryInterface extends  JpaRepository<QBDataObjectService, Integer> {  //Make sure to change data access layer variable to Integer
    QBDataObjectService retrievingYear(String year);  //Temporary mark as string

    }

