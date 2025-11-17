package com.example.scheduler.service;
import com.example.scheduler.entity.*; import com.example.scheduler.exception.ApiException;
import com.example.scheduler.repository.CandidateRepository; import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class CandidateService {
 private final CandidateRepository repo;
 public CandidateService(CandidateRepository repo){this.repo=repo;}
 public Candidate create(Candidate c){
  repo.findByEmail(c.getEmail()).ifPresent(x->{throw new ApiException("Email exists");});
  return repo.save(c);
 }
 public List<Candidate> getAll(){return repo.findAll();}
 public Candidate getById(UUID id){return repo.findById(id).orElseThrow(()->new ApiException("Not found"));}
}