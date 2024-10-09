package com.voting.Entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.jdbc.core.support.AbstractLobCreatingPreparedStatementCallback;

import ch.qos.logback.classic.pattern.LineOfCallerConverter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ElectionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	
	public Long id ;
	
	public String name ;                               // Name of Election "Lok Sabha"
	public LocalDate startdate;
	public LocalDate endDate;
	
	
	public ElectionEntity(Long id, String name, LocalDate startdate, LocalDate endDate,
			List<CandidateEntity> candidate) {
		super();
		this.id = id;
		this.name = name;
		this.startdate = startdate;
		this.endDate = endDate;
		this.candidate = candidate;
	}

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

	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public List<CandidateEntity> getCandidate() {
		return candidate;
	}

	public void setCandidate(List<CandidateEntity> candidate) {
		this.candidate = candidate;
	}

	@OneToMany(mappedBy = "election")
	private List<CandidateEntity>candidate ;
	
	@OneToMany(mappedBy = "election")
	private List<VoteEntity>vote;
	
	public ElectionEntity() {
		
	}
	
	

}
