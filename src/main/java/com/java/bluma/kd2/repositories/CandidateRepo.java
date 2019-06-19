package com.java.bluma.kd2.repositories;

import com.java.bluma.kd2.models.Candidate;
import org.springframework.data.repository.CrudRepository;

public interface CandidateRepo extends CrudRepository<Candidate, Integer> {
}
