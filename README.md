📘 1) Problem Statement

Manually coordinating interviews often results in overlapping schedules, double-booking of interviewers, and inefficient communication.
Companies lack a centralized system to manage availability, leading to human errors and delays.

💡 2) Proposed Solution

Build an automated scheduling system that manages interviewer and candidate data, validates time slots, and prevents scheduling conflicts.
Expose clean REST APIs to ensure accurate, reliable, and efficient interview coordination.

🛠 3) How We Solved It

Implemented a layered Spring Boot architecture with Controllers, Services, Repositories, and Entities.
Added robust time-conflict detection, DTO-based request handling, and global exception management.
Used JPA/Hibernate for relational mapping and H2 for fast testing.

🎯 4) Result / Outcome

The system delivers conflict-free interview scheduling and centralized data management for HR teams.
It reduces manual errors, speeds up coordination, and provides a clean, scalable backend similar to real ATS systems.

🧰 5) Tech Stack / Technologies Used

Java 21, Spring Boot 3x, 
Spring Web (REST APIs), 
Spring Data JPA / Hibernate, 
Spring Validation, 
H2 In-Memory Database,
Maven, Postman,
IntelliJ IDEA





