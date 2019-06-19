package com.java.bluma.kd2.services;

import com.java.bluma.kd2.models.Party;
import com.java.bluma.kd2.repositories.PartyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartyService {

    @Autowired
    private PartyRepo partyRepo;

    public Party retrievePartyByName(String title){

        List<Party> partiesInDb = new ArrayList<>();
        for (Party party : partyRepo.findAll()){
            partiesInDb.add(party);
        }

        for (Party party : partiesInDb){
            if (party.getTitle().equals(title)){
                return party;
            }
        }
        System.err.println("Party not found");
        return null;
    }

    public void generateParties(){

        Party party1 = new Party("Latvijai");
        Party party2 = new Party("Eiropai");

        partyRepo.save(party1);
        partyRepo.save(party2);
    }

    public List<Party> retrieveAllParties(){
        List<Party> parties = new ArrayList<>();
        for (Party party:partyRepo.findAll()) {
            parties.add(party);
        }
        return parties;
    }
}
