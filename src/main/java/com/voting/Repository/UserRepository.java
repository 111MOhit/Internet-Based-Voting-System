package com.voting.Repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username); // Find user by username
    Boolean existsByUsername(String username); // Check if username exists
    Boolean existsByEmail(String email); // Check if email exists
}
