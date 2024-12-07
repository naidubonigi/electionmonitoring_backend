package com.jfsdsdp.electionmonitoringsystem.citizen;


import com.jfsdsdp.electionmonitoringsystem.admin.Party;
import com.jfsdsdp.electionmonitoringsystem.admin.Voter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "voter_id", nullable = false)
    private Voter voter;

    @ManyToOne
    @JoinColumn(name = "party_id", nullable = false)
    private Party party;

    // Getters and setters
}

