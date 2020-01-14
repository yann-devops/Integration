package com.blo;

import java.util.ArrayList;

import com.dto.Mission;

public interface MissionBLO {
        //salut
	public ArrayList<Mission> getInfoMission(String numTrain) throws MissionException;

}
