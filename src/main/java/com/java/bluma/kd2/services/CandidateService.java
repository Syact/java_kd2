package com.java.bluma.kd2.services;

import com.java.bluma.kd2.models.Candidate;
import com.java.bluma.kd2.models.Party;
import com.java.bluma.kd2.repositories.CandidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepo candidateRepo;

    public List<Candidate> retrieveAllCandidatesInParty(Party party_id) {

        List<Candidate> candidatesInExactParty = new ArrayList<>();
        List<Candidate> allCandidatesInDb = new ArrayList<>();


        for (Candidate cand : candidateRepo.findAll()) {
            allCandidatesInDb.add(cand);
        }

        for (Candidate cand : allCandidatesInDb) {
            if (cand.getId_p().equals(party_id)) {
                candidatesInExactParty.add(cand);
            }
        }
        System.err.println("Candidates not found in this party");
        return null;
    }
}
