package com.dto;

import java.io.Serializable;


/**
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
**/
public class LieuMission implements Serializable {	
	
    /**
     * Serial IUD for serialization.
     */
    private static final long serialVersionUID = 6037181396472147356L;
	
    private String UIC;	
    private String LibPr;
    
    /**
     * @return the uIC
     */
    public String getUIC() {
        return UIC;
    }
    /**
     * @param uIC the uIC to set
     */
    public void setUIC(String uIC) {
        UIC = uIC;
    }
    /**
     * @return the libPr
     */
    public String getLibPr() {
        return LibPr;
    }
    /**
     * @param libPr the libPr to set
     */
    public void setLibPr(String libPr) {
        LibPr = libPr;
    }	
	
}
