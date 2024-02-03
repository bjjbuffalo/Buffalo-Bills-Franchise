package com.Bills.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RBRepositoryInterface extends JpaRepository<RBDataObjectService, Integer> {

//Repository for RB entity class

        RBDataObjectService retrievingYear(Integer year);
}
