package com.jfsdsdp.electionmonitoringsystem.ElectionObserver;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class ElectionObserverController {
		private ElectionObserverRepository erepo;
		public ElectionObserverController(ElectionObserverRepository erepo) {
			this.erepo=erepo;
		}
		
		@GetMapping("/observers")
		public List<ElectionObserver> getObservers() {
			return erepo.findAll();
		}
		
		@PostMapping("/observers")
		public void addObserver(@RequestBody ElectionObserver observer) {
			erepo.save(observer);
		}
	
}
