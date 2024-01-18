package com.Bills.demo;

import com.Bills.demo.QBDataObjectService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

//JpaRepository part of Spring framework
//QbDataObjectService @Entity
//Integer is the primary key type
public interface RepositoryInterface extends  JpaRepository<QBDataObjectService, Integer> {
    QBDataObjectService findByYear(@Param("year") String year);

    }

