package com.voting.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voting.Entity.ElectionEntity;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ElectionRepository extends JpaRepository<ElectionEntity, Long> {
    List<ElectionEntity> findByStartDateAfterAndEndDateBefore(LocalDate startDate, LocalDate endDate); 
    int a= 5;
}
