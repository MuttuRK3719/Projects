package com.example.scheduler.repository;
import com.example.scheduler.entity.Candidate; import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*; 
public interface CandidateRepository extends JpaRepository<Candidate, UUID>{
 Optional<Candidate> findByEmail(String email);
}