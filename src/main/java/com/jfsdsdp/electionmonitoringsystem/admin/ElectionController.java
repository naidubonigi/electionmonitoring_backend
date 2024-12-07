package com.jfsdsdp.electionmonitoringsystem.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/elections")
public class ElectionController {

    @Autowired
    private ElectionService electionService;

    @GetMapping
    public ResponseEntity<List<Election>> getAllElections() {
        return new ResponseEntity<>(electionService.getAllElections(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Election> createElection(@RequestBody Election election) {
        return new ResponseEntity<>(electionService.createElection(election), HttpStatus.CREATED);
    }

    // New endpoint to test connection
    @GetMapping("/test")
    public ResponseEntity<String> testConnection() {
        return new ResponseEntity<>("Hello from the backend!", HttpStatus.OK);
    }

    // Endpoint to delete an election by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteElection(@PathVariable Long id) {
        try {
            electionService.deleteElection(id); // Call the service to delete the election
            return ResponseEntity.noContent().build(); // Respond with 204 No Content
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // Handle errors
        }
    }

    // Endpoint to update an existing election
    @PutMapping("/{id}")
    public ResponseEntity<Election> updateElection(@PathVariable Long id, @RequestBody Election electionDetails) {
        try {
            Election updatedElection = electionService.updateElection(id, electionDetails);
            return ResponseEntity.ok(updatedElection); // Respond with 200 OK and the updated election
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // Handle errors
        }
    }
}
