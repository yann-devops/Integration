package com.blo;

/**
 * 
 * Classe Modèle pour la BDD ville_france.sql.
 * @author Yann Hamel
 * 
 */
public class VilleFrance {
    
    // Attributs privés
    private String codeCommuneInsee;
    private String nomCommune;
    private String codePostal;
    private String libelleAcheminement;
    private String ligne5;
    private String lattitude;
    private String longitude;
    
    // Constructeurs
    
    /**
     * Constructeur nécessitant des paramètres.
     * @param codeCommuneInsee
     * @param nomCommune
     * @param codePostal
     * @param libelleAcheminement
     * @param ligne5
     * @param lattitude
     * @param longitude
     */
    public VilleFrance(String codeCommuneInsee, String nomCommune, String codePostal, String libelleAcheminement, String ligne5, String lattitude, String longitude) {
        this.codeCommuneInsee = codeCommuneInsee;
        this.nomCommune = nomCommune;
        this.codePostal = codePostal;
        this.libelleAcheminement = libelleAcheminement;
        this.ligne5 = ligne5;
        this.lattitude = lattitude;
        this.longitude = longitude;
    }
    
    /**
     * Constructeur vide.
     */
    public VilleFrance() {
        
    }
    
    // Méthodes
    @Override
    public String toString() {
        return "Ville_France [codeCommuneInsee=" + this.codeCommuneInsee + ", nomCommune=" + this.nomCommune
                + ", codePostal=" + this.codePostal + ", libelleAcheminement=" + this.libelleAcheminement + ", ligne5="
                + this.ligne5 + ", lattitude=" + this.lattitude + ", longitude=" + this.longitude + "]";
    }
    
    // Accesseurs en écritures et lectures
    
    /**
     * @return the codeCommuneInsee
     */
    public String getCodeCommuneInsee() {
        return codeCommuneInsee;
    }
    
    /**
     * @param codeCommuneInsee the codeCommuneInsee to set
     */
    public void setCodeCommuneInsee(String codeCommuneInsee) {
        this.codeCommuneInsee = codeCommuneInsee;
    }
    
    /**
     * @return the nomCommune
     */
    public String getNomCommune() {
        return nomCommune;
    }
    
    /**
     * @param nomCommune the nomCommune to set
     */
    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }
    
    /**
     * @return the codePostal
     */
    public String getCodePostal() {
        return codePostal;
    }
    
    /**
     * @param codePostal the codePostal to set
     */
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
    
    /**
     * @return the libelleAcheminement
     */
    public String getLibelleAcheminement() {
        return libelleAcheminement;
    }
    
    /**
     * @param libelleAcheminement the libelleAcheminement to set
     */
    public void setLibelleAcheminement(String libelleAcheminement) {
        this.libelleAcheminement = libelleAcheminement;
    }
    
    /**
     * @return the ligne5
     */
    public String getLigne5() {
        return ligne5;
    }
    
    /**
     * @param ligne5 the ligne5 to set
     */
    public void setLigne5(String ligne5) {
        this.ligne5 = ligne5;
    }
    
    /**
     * @return the lattitude
     */
    public String getLattitude() {
        return lattitude;
    }
    
    /**
     * @param lattitude the lattitude to set
     */
    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }
    
    /**
     * @return the longitude
     */
    public String getLongitude() {
        return longitude;
    }
    
    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    
}
