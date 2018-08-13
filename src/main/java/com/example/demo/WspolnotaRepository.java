package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WspolnotaRepository extends JpaRepository<Wspolnota,Long> {


    @Query(value = "select * from wspolnota ", nativeQuery = true)
    List<Wspolnota> findAll();

}
