package com.jfsdsdp.electionmonitoringsystem.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoterService {

    @Autowired
    private VoterRepository voterRepository;

    // Method to add a voter
    public Voter addVoter(Voter voter) {
        return voterRepository.save(voter);
    }

    // Method to get all voters
    public List<Voter> getAllVoters() {
        return voterRepository.findAll();
    }
    
    public Voter getById(long id) {
    	return voterRepository.findById(id).get();
    }
}
