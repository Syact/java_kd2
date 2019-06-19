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

}
