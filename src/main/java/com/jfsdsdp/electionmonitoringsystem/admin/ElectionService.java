package com.jfsdsdp.electionmonitoringsystem.admin;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectionService {

    @Autowired
    private ElectionRepository electionRepository;

    public List<Election> getAllElections() {
        return electionRepository.findAll();
    }

    public Election createElection(Election election) {
        return electionRepository.save(election);
    }

    public void deleteElection(Long id) {
        if (!electionRepository.existsById(id)) {
            throw new EntityNotFoundException("Election not found with id " + id);
        }
        electionRepository.deleteById(id);
    }

    public Election updateElection(Long id, Election electionDetails) {
        Election election = electionRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Election not found with id " + id));
        
        // Update the election details
        election.setName(electionDetails.getName());
        election.setElectionDate(electionDetails.getElectionDate());
        election.setLocation(electionDetails.getLocation());
        election.setStatus(electionDetails.getStatus());
        
        return electionRepository.save(election); // Save the updated election
    }
}
