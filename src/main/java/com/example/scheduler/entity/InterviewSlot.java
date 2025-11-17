package com.example.scheduler.entity;
import jakarta.persistence.*; import lombok.*; import java.time.LocalDateTime; import java.util.UUID;
@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class InterviewSlot {
 @Id @GeneratedValue(strategy = GenerationType.UUID)
 private UUID id;
 @ManyToOne(optional=false) private Candidate candidate;
 @ManyToOne(optional=false) private Interviewer interviewer;
 private LocalDateTime startTime; private LocalDateTime endTime;
 private String mode; private String location;
}