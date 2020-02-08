package com.blo;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.VilleFranceDAO;
import com.dto.Ville;

@Service
public class VilleBLOImpl implements VilleBLO{


    @Autowired
    private VilleFranceDAO villeFranceDAO;
    
    public ArrayList<Ville> getInfoVille(String filtre) throws VilleException {
        ArrayList<Ville> response;
        
        
        if (filtre == null || "".equalsIgnoreCase(filtre)) {
            response = villeFranceDAO.allVille();
        } else {
            response = villeFranceDAO.allVille();
        }
        System.out.println("Nombre de ville récupéré : " + response.size());
        return response;
    }

}
