package com.example.scheduler.entity;
import jakarta.persistence.*; import lombok.*; import java.util.UUID;
@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Interviewer {
 @Id @GeneratedValue(strategy = GenerationType.UUID)
 private UUID id;
 @Column(nullable=false) private String name;
 @Column(nullable=false, unique=true) private String email;
 private String department;
}