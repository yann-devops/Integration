package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.blo.MissionBLO;

@RestController
//@RequestMapping("/path")
class MissionController {

	@Autowired
	MissionBLO missionService;

	// Methode GET
	@RequestMapping(value = "/mission", method = RequestMethod.GET)
	@ResponseBody
	public String recover(@RequestParam(required = false, value = "numTrain") String numTrain) {
		System.out.println("Appel GET");

		//ArrayList<Mission> listMission = missionService.getInfoMission(numTrain);
		return "JSON";
	}

	// Methode POST
	//TODO
	
	// Methode PUT
	//TODO

}
