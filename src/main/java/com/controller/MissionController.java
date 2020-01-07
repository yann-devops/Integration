package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.blo.MissionBLO;
import com.dto.Mission;

@RestController
//@RequestMapping("/path")
class MissionController {

	@Autowired
	MissionBLO missionService;

	@RequestMapping(value = "/mission", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<Mission> recover(@RequestParam(required = false, value = "numTrain") String numTrain) {
		System.out.println("Appel GET");

		ArrayList<Mission> listMission = missionService.getInfoMission(numTrain);
		return listMission;
	}

	// autre méthode avec des mappings via des Map
	/*
	 * @RequestMapping(value="/mission", method=RequestMethod.POST)
	 * 
	 * @ResponseBody //public String insert(@RequestBody String num) { public void
	 * insert(@RequestBody HashMap<String, HashMap<String, String>> requestData) {
	 * 
	 * HashMap<String, String> customerInfo = requestData.get("param"); String num =
	 * customerInfo.get("num"); String date = customerInfo.get("date"); // ...
	 * 
	 * }
	 */
}
