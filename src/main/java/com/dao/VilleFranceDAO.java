package com.dao;
import java.util.ArrayList;
import com.dto.Ville;

/**
 * 
 * @author Yann Hamel
 * 
 */
public interface VilleFranceDAO {
    
    public ArrayList<Ville> allVille();
    public ArrayList<Ville> allCodeCommuneINSEE();
    public ArrayList<Ville> allNomCommune();
    public ArrayList<Ville> allCodePostal();
    public ArrayList<Ville> allLibelleAheminement();
    public ArrayList<Ville> allLatitude();
    public ArrayList<Ville> allLongitude();
    public void addVille(Ville ville);
    public void addEmptyVille(Ville ville);
}
