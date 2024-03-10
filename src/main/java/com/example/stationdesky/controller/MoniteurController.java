package com.example.stationdesky.controller;

import com.example.stationdesky.entities.Skieur;
import com.example.stationdesky.service.IGestionSkieur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skieur")
public class AbonnementController {
    @Autowired
    IGestionSkieur skieur;
    @GetMapping("/getall")
    public List<Skieur> getAll(){
        return  skieur.retrieveAllSkieur();
    }
    @PostMapping("/addskieur")
    public Skieur ajouterSkieur(@RequestBody Skieur sk){
        return skieur.addSkieur(sk);
    }
    @GetMapping("/getSkieur/{id}")
    public Skieur getSkiD(@PathVariable("id")long id){
        return skieur.retrieveSkieur(id);
    }
    @DeleteMapping("/removeSkieur/{id}")
    public void removeById(@PathVariable("id") long id) {
        skieur.removeSkieur(id);
    }
    @PutMapping("/updateSki/{id}")
    public Skieur updateByid(@RequestBody Skieur ski){
        return skieur.updateSkieur(ski);
    }

}
