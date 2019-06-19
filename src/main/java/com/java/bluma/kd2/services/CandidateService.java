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
    @Autowired
    private PartyService partyService;

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

    public void generateCandidates(){

        Candidate cand1 = new Candidate("Janis", "Berzins", 0, partyService.retrievePartyByName("Latvijai"));
        Candidate cand2 = new Candidate("Baiba", "Jauka", 2, partyService.retrievePartyByName("Latvijai"));
        Candidate cand3 = new Candidate("Liga", "Forsa", 5, partyService.retrievePartyByName("Eiropai"));
        Candidate cand4 = new Candidate("Peteris", "Kalnins", 0, partyService.retrievePartyByName("Eiropai"));

        candidateRepo.save(cand1);
        candidateRepo.save(cand2);
        candidateRepo.save(cand3);
        candidateRepo.save(cand4);
    }

    public List<Candidate> retrieveAllCandidates(){
        List<Candidate> candidates = new ArrayList<>();
        for (Candidate cand:candidateRepo.findAll()) {
            candidates.add(cand);
        }
        return candidates;
    }
}
