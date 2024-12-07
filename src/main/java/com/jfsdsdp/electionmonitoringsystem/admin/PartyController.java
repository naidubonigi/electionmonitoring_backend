package com.jfsdsdp.electionmonitoringsystem.admin;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parties")
public class PartyController {

    private final PartyService partyService;

    public PartyController(PartyService partyService) {
        this.partyService = partyService;
    }

    // Get all parties
    @GetMapping
    public List<Party> getAllParties() {
        return partyService.getAllParties();
    }

    // Add a new party
    @PostMapping
    public Party addParty(@RequestBody Party party) {
        return partyService.addParty(party);
    }

    // Delete a party by ID
    @DeleteMapping("/{id}")
    public void deleteParty(@PathVariable Long id) {
        partyService.deleteParty(id);
    }
    
    @GetMapping("/{id}/votes")
    public int getVoters(@PathVariable long id){
    	return partyService.getVotes(id);
    }
    
    @PostMapping("/{id}/votes")
    public void addVote(@PathVariable long id) {
    	partyService.addVotes(id);
    }
}