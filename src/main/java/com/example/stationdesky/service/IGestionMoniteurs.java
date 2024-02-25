package com.example.stationdesky.service;

import com.example.stationdesky.entities.Moniteur;

import java.util.List;

public interface IGestionMoniteurs {

    List retrieveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);
}
