package com.jfsdsdp.electionmonitoringsystem.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartyService {

    private final PartyRepository partyRepository;

    @Autowired
    public PartyService(PartyRepository partyRepository) {
        this.partyRepository = partyRepository;
    }

    // Get all parties
    public List<Party> getAllParties() {
        return partyRepository.findAll();
    }

    // Add a new party
    public Party addParty(Party party) {
        return partyRepository.save(party);
    }

    // Delete a party by ID
    public void deleteParty(Long id) {
        partyRepository.deleteById(id);
    }
    
    public int getVotes(long id){
    	Party party=partyRepository.findById(id).get();
    	return party.getVotes();
    }
    
    public void addVotes(long id) {
    	Party party=partyRepository.findById(id).get();
    	party.setVotes(party.getVotes()+1);
    	partyRepository.save(party);
    }
}