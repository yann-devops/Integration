package com.dto;

import java.io.Serializable;


/**
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
**/
public class Mission implements Serializable {	
	
    /**
     * Serial IUD for serialization.
     */
    private static final long serialVersionUID = -8050478362033217382L;
    private int id;
    private String numeroTrain;
    private String dateCirculation;
    private String horaireDepart;
    private String horaireDestination;      
    private LieuMission lieuOrigine;        
    private LieuMission lieuDestination;    
	
	        
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the numeroTrain
     */
    public String getNumeroTrain() {
        return numeroTrain;
    }
    /**
     * @param numeroTrain the numeroTrain to set
     */
    public void setNumeroTrain(String numeroTrain) {
        this.numeroTrain = numeroTrain;
    }
    /**
     * @return the dateCirculation
     */
    public String getDateCirculation() {
        return dateCirculation;
    }
    /**
     * @param dateCirculation the dateCirculation to set
     */
    public void setDateCirculation(String dateCirculation) {
        this.dateCirculation = dateCirculation;
    }
    /**
     * @return the horaireDepart
     */
    public String getHoraireDepart() {
        return horaireDepart;
    }
    /**
     * @param horaireDepart the horaireDepart to set
     */
    public void setHoraireDepart(String horaireDepart) {
        this.horaireDepart = horaireDepart;
    }
    /**
     * @return the horaireDestination
     */
    public String getHoraireDestination() {
        return horaireDestination;
    }
    /**
     * @param horaireDestination the horaireDestination to set
     */
    public void setHoraireDestination(String horaireDestination) {
        this.horaireDestination = horaireDestination;
    }
    /**
     * @return the lieuOrigine
     */
    public LieuMission getLieuOrigine() {
        return lieuOrigine;
    }
    /**
     * @param lieuOrigine the lieuOrigine to set
     */
    public void setLieuOrigine(LieuMission lieuOrigine) {
        this.lieuOrigine = lieuOrigine;
    }
    /**
     * @return the lieuDestination
     */
    public LieuMission getLieuDestination() {
        return lieuDestination;
    }
    /**
     * @param lieuDestination the lieuDestination to set
     */
    public void setLieuDestination(LieuMission lieuDestination) {
        this.lieuDestination = lieuDestination;
    }
 

}
