package com.voting.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class VoteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id ;
	
	@ManyToOne 
	@JoinColumn(name = "user_id")
	private UserEntity user;
	
	@ManyToOne
	@JoinColumn(name ="elecition_id")
	private ElectionEntity election;
	
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private CandidateEntity candidate;
	
	
	
	public VoteEntity() {
    }

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public UserEntity getUser() {
		return user;
	}


	public void setUser(UserEntity user) {
		this.user = user;
	}


	public ElectionEntity getElection() {
		return election;
	}


	public void setElection(ElectionEntity election) {
		this.election = election;
	}


	public CandidateEntity getCandidate() {
		return candidate;
	}


	public void setCandidate(CandidateEntity candidate) {
		this.candidate = candidate;
	}


	public VoteEntity(long id, UserEntity user, ElectionEntity election, CandidateEntity candidate) {
		super();
		this.id = id;
		this.user = user;
		this.election = election;
		this.candidate = candidate;
	}
	
}
