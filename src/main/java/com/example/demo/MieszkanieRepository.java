package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MieszkanieRepository extends JpaRepository<Mieszkanie,Long> {

    @Query(value = "select * from mieszkanie ", nativeQuery = true)
    List<Mieszkanie> findAll();


}
