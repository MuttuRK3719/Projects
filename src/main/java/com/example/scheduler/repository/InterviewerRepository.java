package com.example.scheduler.repository;
import com.example.scheduler.entity.Interviewer; import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
public interface InterviewerRepository extends JpaRepository<Interviewer, UUID>{
 Optional<Interviewer> findByEmail(String email);
}