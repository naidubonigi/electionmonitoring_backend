package com.jfsdsdp.electionmonitoringsystem.DataAnalyst;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataAnalystController {
	private DataAnalystRepository arepo;
	public DataAnalystController(DataAnalystRepository arepo) {
		this.arepo=arepo;
	}
	
	@GetMapping("/analysts")
	public List<DataAnalyst> getAnalysts() {
		return arepo.findAll();
	}
	
	@PostMapping("/analysts")
	public void addAnalyst(@RequestBody DataAnalyst analyst) {
		arepo.save(analyst);
	}

}
