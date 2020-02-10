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
    
    public ArrayList<Ville> getCodeCommune(String filtre) throws VilleException {
        ArrayList<Ville> response;
        
        response = villeFranceDAO.allCodeCommuneINSEE();
        System.out.println("Nombre de ville récupéré : " + response.size());
        return response;
    }
    
    public ArrayList<Ville> getNomCommune(String filtre) throws VilleException {
        ArrayList<Ville> response;
        if (filtre == null || "".equalsIgnoreCase(filtre)) {
            response = villeFranceDAO.allVille();
        } else {
            response = villeFranceDAO.allNomCommune();
        }
        System.out.println("Nombre de ville récupéré : " + response.size());
        return response;
    }
    
    public ArrayList<Ville> getCodePostal(String filtre) throws VilleException {
        ArrayList<Ville> response;
        if (filtre == null || "".equalsIgnoreCase(filtre)) {
            response = villeFranceDAO.allVille();
        } else {
            response = villeFranceDAO.allCodePostal();
        }
        System.out.println("Nombre de ville récupéré : " + response.size());
        return response;
    }
    
    public ArrayList<Ville> getLibelle(String filtre) throws VilleException {
        ArrayList<Ville> response;
        if (filtre == null || "".equalsIgnoreCase(filtre)) {
            response = villeFranceDAO.allVille();
        } else {
            response = villeFranceDAO.allLibelleAheminement();
        }
        System.out.println("Nombre de ville récupéré : " + response.size());
        return response;
    }
    
    public ArrayList<Ville> getLatitude(String filtre) throws VilleException {
        ArrayList<Ville> response;
        if (filtre == null || "".equalsIgnoreCase(filtre)) {
            response = villeFranceDAO.allVille();
        } else {
            response = villeFranceDAO.allLatitude();
        }
        System.out.println("Nombre de ville récupéré : " + response.size());
        return response;
    }
    
    public ArrayList<Ville> getLongitude(String filtre) throws VilleException {
        ArrayList<Ville> response;
        if (filtre == null || "".equalsIgnoreCase(filtre)) {
            response = villeFranceDAO.allVille();
        } else {
            response = villeFranceDAO.allLongitude();
        }
        System.out.println("Nombre de ville récupéré : " + response.size());
        return response;
    }
    
   
    public void insererVille(String ville) throws VilleException {
        Ville villeFrance = new Ville();
        villeFranceDAO.addEmptyVille(villeFrance);
    }
}
