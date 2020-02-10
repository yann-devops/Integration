package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.blo.MissionBLO;
import com.blo.VilleBLO;
import com.dao.VilleFranceDAO;
import com.dto.Ville;

@RestController
//@RequestMapping("/path")
class VilleController {

    @Autowired
    VilleBLO villeFrance;
   
    // METHODES GETS
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public String all(@RequestParam(required = false, value = "Nom_commune") String Nom_commune) {
        System.out.println("Appel GET");
        ArrayList<Ville> response = villeFrance.getInfoVille(Nom_commune);
        return response.toString()  ;
    }
    
    @RequestMapping(value = "/code", method = RequestMethod.GET)
    @ResponseBody
    public String codeCommune(@RequestParam(required = false, value = "Nom_commune") String Nom_commune) {
        System.out.println("Appel GET");
        ArrayList<Ville> response = villeFrance.getCodeCommune(Nom_commune);
        return response.toString()  ;
    }
    
    @RequestMapping(value = "/nom", method = RequestMethod.GET)
    @ResponseBody
    public String nom(@RequestParam(required = false, value = "Nom_commune") String Nom_commune) {
        System.out.println("Appel GET");
        ArrayList<Ville> response = villeFrance.getNomCommune(Nom_commune);
        return response.toString()  ;
    }
    
    @RequestMapping(value = "/cp", method = RequestMethod.GET)
    @ResponseBody
    public String cp(@RequestParam(required = false, value = "Nom_commune") String Nom_commune) {
        System.out.println("Appel GET");
        ArrayList<Ville> response = villeFrance.getCodePostal(Nom_commune);
        return response.toString()  ;
    }
    
    @RequestMapping(value = "/libelle", method = RequestMethod.GET)
    @ResponseBody
    public String libelle(@RequestParam(required = false, value = "Nom_commune") String Nom_commune) {
        System.out.println("Appel GET");
        ArrayList<Ville> response = villeFrance.getLibelle(Nom_commune);
        return response.toString()  ;
    }
    
    @RequestMapping(value = "/latitude", method = RequestMethod.GET)
    @ResponseBody
    public String latitude(@RequestParam(required = false, value = "Nom_commune") String Nom_commune) {
        System.out.println("Appel GET");
        ArrayList<Ville> response = villeFrance.getLatitude(Nom_commune);
        return response.toString()  ;
    }
    
    @RequestMapping(value = "/longitude", method = RequestMethod.GET)
    @ResponseBody
    public String longitude(@RequestParam(required = false, value = "Nom_commune") String Nom_commune) {
        System.out.println("Appel GET");
        ArrayList<Ville> response = villeFrance.getLongitude(Nom_commune);
        return response.toString()  ;
    }
    
    // Methode POSTS
   
 
    // /add?value=[codeCommuneInsee=12345, nomCommune=test, codePostal=123, libelleAcheminement=test, ligne5=, lattitude=123.123, longitude=123.123]
    // /add?value=[nomCommune=test, codePostal=123, libelleAcheminement=test, ligne5=, lattitude=123.123, longitude=123.123]
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public void post(@RequestParam(required = false, value = "value") String ville) {
            System.out.println("Appel POST");
            villeFrance.insererVille(ville);
            System.out.println("Ville ajoutée");
    }

    // Methode PUT
    //TODO

}

