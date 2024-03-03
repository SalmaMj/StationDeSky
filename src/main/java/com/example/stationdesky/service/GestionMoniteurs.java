package com.example.stationdesky.service;

import com.example.stationdesky.entities.Moniteur;
import com.example.stationdesky.repository.IMoniteurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GestionMoniteurs implements IGestionMoniteurs{

    @Autowired
    private IMoniteurRepo moniteurRepo;
    @Override
    public List retrieveAllMoniteurs() {
        return moniteurRepo.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepo.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepo.save(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepo.findById(numMoniteur).orElse(null);
    }
}
