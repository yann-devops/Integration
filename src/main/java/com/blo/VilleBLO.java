package com.blo;

import java.util.ArrayList;
import com.dto.Ville;

public interface VilleBLO {
    public ArrayList<Ville> getInfoVille(String filtre) throws VilleException;
    
}
