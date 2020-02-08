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
   

    @RequestMapping(value = "/mission2", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Ville> recover2(@RequestParam(required = false, value = "Nom_commune") String Nom_commune) {
        System.out.println("Appel GET");

        ArrayList<Ville> response = villeFrance.getInfoVille(Nom_commune);
        return response;
    }

    
    


    // Methode POST
    //TODO

    // Methode PUT
    //TODO

}

