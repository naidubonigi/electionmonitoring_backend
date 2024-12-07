package com.jfsdsdp.electionmonitoringsystem.citizen;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitizenController {
	private CitizenRepository crepo;
	public CitizenController(CitizenRepository crepo) {
		this.crepo=crepo;
	}
	
	@GetMapping("/citizens")
	public List<Citizen> getCitizens() {
		return crepo.findAll();
	}
	
	@PostMapping("/citizens")
	public void addCitizen(@RequestBody Citizen citizen) {
		crepo.save(citizen);
	}
}
