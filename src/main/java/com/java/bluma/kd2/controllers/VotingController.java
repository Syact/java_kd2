package com.java.bluma.kd2.controllers;

import com.java.bluma.kd2.forms.AuthoriseForm;
import com.java.bluma.kd2.forms.InsertNewPartyForm;
import com.java.bluma.kd2.models.Candidate;
import com.java.bluma.kd2.models.Party;
import com.java.bluma.kd2.models.User;
import com.java.bluma.kd2.services.CandidateService;
import com.java.bluma.kd2.services.PartyService;
import com.java.bluma.kd2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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
    public String authoriseGet(Model model)
    {
        model.addAttribute("authoriseForm", new AuthoriseForm());
        return "authorise";
    }


    @PostMapping(value="/authorise")
    public String authorisePost(@ModelAttribute AuthoriseForm authoriseForm)
    {

        return "";
    }


    @GetMapping(value="/admin/insertnewparty")
    public String insertPartyGet(Model model)
    {
        model.addAttribute("insertNewPartyForm", new InsertNewPartyForm());
        return "insertNewParty";
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
    public String showAllPartiesGet(Model model)
    {
        List<Party> allParties = partyService.retrieveAllParties();
        model.addAttribute("allParties", allParties);
        return "showAllParties";
    }

    @GetMapping(value="/admin/showallcandidates")
    public String showAllcandidatesGet(Model model)
    {
        List<Candidate> allCandidates = candidateService.retrieveAllCandidates();
        model.addAttribute("allCandidates", allCandidates);
        return "showAllCandidates";
    }


    @GetMapping(value="/admin/showallcandidates/{id}")
    public String showAllcandidatesGetByParty()
    {
        return "";
    }

    @GetMapping(value="/admin/showallusers")
    public String showAllUsersGet(Model model)
    {
        List<User> allUsers = userService.retrieveAllUsers();
        model.addAttribute("allUsers", allUsers);
        return "showAllUsers";
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