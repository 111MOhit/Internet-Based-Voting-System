package com.voting.Entity;




import java.util.List;

import org.hibernate.annotations.Collate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	private String name;
	
	@Column(unique = true)
	private String email;
	
	private String password;
	private String role;                                    //Admin or Voter
	
	
	@OneToMany(mappedBy = "voter")
	private List<VoteEntity>vote;                          //Storing votes cast by this user 
	
	public UserEntity(){                                                                         
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<VoteEntity> getVote() {
		return vote;
	}

	public void setVote(List<VoteEntity> vote) {
		this.vote = vote;
	}
	
	
	
	

}
