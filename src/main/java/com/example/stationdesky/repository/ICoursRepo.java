package com.example.stationdesky.repository;

import com.example.stationdesky.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICoursRepo extends JpaRepository<Cours,Long> {

}
