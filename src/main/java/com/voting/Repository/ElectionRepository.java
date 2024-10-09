package com.voting.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voting.Entity.ElectionEntity;

import java.time.LocalDate;
import java.util.List;

public interface ElectionRepository extends JpaRepository<ElectionEntity, Long> {
    List<ElectionEntity> findByStartDateAfterAndEndDateBefore(LocalDate startDate, LocalDate endDate); // Find elections within a date range
}
