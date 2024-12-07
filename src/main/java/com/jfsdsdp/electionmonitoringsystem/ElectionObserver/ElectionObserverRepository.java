package com.jfsdsdp.electionmonitoringsystem.ElectionObserver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectionObserverRepository extends JpaRepository<ElectionObserver,Integer>{

	
}
