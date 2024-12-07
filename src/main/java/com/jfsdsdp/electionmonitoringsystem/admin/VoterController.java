package com.jfsdsdp.electionmonitoringsystem.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/voters")
public class VoterController {

    @Autowired
    private VoterService voterService;

    // Endpoint to add a voter
    @PostMapping
    public ResponseEntity<Voter> addVoter(@RequestBody Voter voter) {
        try {
            Voter savedVoter = voterService.addVoter(voter);
            return new ResponseEntity<>(savedVoter, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Endpoint to get all voters
    @GetMapping
    public ResponseEntity<List<Voter>> getVoters() {
        try {
            List<Voter> voters = voterService.getAllVoters();
            return new ResponseEntity<>(voters, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
  
}
