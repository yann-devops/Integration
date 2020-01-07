package com.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

}
