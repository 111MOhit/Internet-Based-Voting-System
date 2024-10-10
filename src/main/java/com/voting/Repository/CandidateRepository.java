package com.voting.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voting.Entity.CandidateEntity;

import java.util.List;


@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity, Long> {
    List<CandidateEntity> findByElectionId(Long electionId); // Find candidates by election ID
}
