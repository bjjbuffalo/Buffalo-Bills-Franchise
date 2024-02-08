package com.Bills.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//****************   In progress class   *******************
@Service
public class CRUD {
    @Autowired
    private RepositoryInterface qbRepository;

    public List<QBDataObjectService> getAllQBData() {
        return qbRepository.findAll();
    }

   // public Optional<QBDataObjectService> getQBDataByYear(String year) {
        //return qbRepository.findById(year);
  //  }

    public QBDataObjectService saveQBData(QBDataObjectService qbData) {
        return qbRepository.save(qbData);
    }

    public void deleteQBDataByYear(String year) {
      //  qbRepository.deleteById(year);
    }
}
