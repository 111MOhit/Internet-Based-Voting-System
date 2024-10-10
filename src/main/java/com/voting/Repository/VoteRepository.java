package com.voting.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voting.Entity.VoteEntity;

import java.util.Optional;


@Repository
public interface VoteRepository extends JpaRepository<VoteEntity, Long> {
    Optional<VoteEntity> findByVoterIdAndElectionId(Long voterId, Long electionId); // Check if a user has voted in an election
    Long countByCandidateId(Long candidateId); // Count votes for a candidate
}
