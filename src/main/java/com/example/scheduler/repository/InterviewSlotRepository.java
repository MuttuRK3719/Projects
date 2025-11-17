package com.example.scheduler.repository;
import com.example.scheduler.entity.*; import org.springframework.data.jpa.repository.JpaRepository;
import java.time.*; import java.util.*;
public interface InterviewSlotRepository extends JpaRepository<InterviewSlot, UUID>{
 List<InterviewSlot> findByInterviewerAndStartTimeBetween(Interviewer i, LocalDateTime s, LocalDateTime e);
 List<InterviewSlot> findByCandidateAndStartTimeBetween(Candidate c, LocalDateTime s, LocalDateTime e);
}