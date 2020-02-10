package com.blo;

import java.util.ArrayList;
import com.dto.Ville;

public interface VilleBLO {
    
    public ArrayList<Ville> getInfoVille(String filtre) throws VilleException;
    public ArrayList<Ville> getCodeCommune(String filtre) throws VilleException;
    public ArrayList<Ville> getNomCommune(String filtre) throws VilleException;
    public ArrayList<Ville> getCodePostal(String filtre) throws VilleException;
    public ArrayList<Ville> getLibelle(String filtre) throws VilleException;
    public ArrayList<Ville> getLatitude(String filtre) throws VilleException;
    public ArrayList<Ville> getLongitude(String filtre) throws VilleException;
    public void insererVille(String filtre) throws VilleException;
    
}
