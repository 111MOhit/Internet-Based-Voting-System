package com.voting.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class CandidateEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	
	private Long id ;
	private String name;
	private String party;
	
	@ManyToOne
	@JoinColumn(name = "election_id")
	private ElectionEntity election  ;
	
	
	@OneToMany(mappedBy = "candidate")
	private List<VoteEntity> votes ;
	
	public CandidateEntity() {
		
	}
	
	
	public CandidateEntity(Long id, String name, String party, ElectionEntity election, List<VoteEntity> votes) {
		super();
		this.id = id;
		this.name = name;
		this.party = party;
		this.election = election;
		this.votes = votes;
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

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public ElectionEntity getElection() {
		return election;
	}

	public void setElection(ElectionEntity election) {
		this.election = election;
	}

	public List<VoteEntity> getVotes() {
		return votes;
	}

	public void setVotes(List<VoteEntity> votes) {
		this.votes = votes;
	}

	
	

}
