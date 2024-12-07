package com.jfsdsdp.electionmonitoringsystem.admin;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically generates the id
    private Long id;

    private String name;
    private String symbol;
    private String participantName;
    
    private int votes;

    // Constructors, getters and setters

    public Party() {}

    public Party(String name, String symbol, String participantName) {
        this.name = name;
        this.symbol = symbol;
        this.participantName = participantName;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}
    
    

    
}