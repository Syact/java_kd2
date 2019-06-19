package com.java.bluma.kd2.controllers;

import com.java.bluma.kd2.services.CandidateService;
import com.java.bluma.kd2.services.PartyService;
import com.java.bluma.kd2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VotingController {

    @Autowired
    private UserService userService;
    @Autowired
    private PartyService partyService;
    @Autowired
    private CandidateService candidateService;

    @GetMapping(value="/testing")
    public String testing()
    {
        userService.generateUsers();
        partyService.generateParties();
        candidateService.generateCandidates();

        return "home";
    }

    @GetMapping(value="/authorise")
    public String authoriseGet()
    {
        return "";
    }


    @PostMapping(value="/authorise")
    public String authorisePost()
    {
        return "";
    }


    @GetMapping(value="/admin/insertnewparty")
    public String insertPartyGet()
    {
        return "";
    }

    @PostMapping(value="/admin/insertnewparty")
    public String insertPartyPost()
    {
        return "";
    }


    @GetMapping(value="/admin/insertnewcandidate")
    public String insertCandidateGet()
    {
        return "";
    }

    @PostMapping(value="/admin/insertnewcandidate")
    public String insertCandidatePost()
    {
        return "";
    }

    @GetMapping(value="/admin/showallparties")
    public String showAllPartiesGet()
    {
        return "";
    }

    @GetMapping(value="/admin/showallcandidates")
    public String showAllcandidatesGet()
    {
        return "";
    }


    @GetMapping(value="/admin/showallcandidates/{id}")
    public String showAllcandidatesGetByParty()
    {
        return "";
    }

    @GetMapping(value="/admin/showallusers")
    public String showAllUsersGet()
    {
        return "";
    }

    @GetMapping(value="/user/vote/{id}")
    public String voteGet()
    {
        return "";
    }

    @PostMapping(value="/user/vote/{id}")
    public String votePost()
    {
        return "";
    }

    @GetMapping(value="/voted")
    public String votedGet()
    {
        return "";
    }
}