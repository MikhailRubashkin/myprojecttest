package com.example.myprojecttest.controllers;

import com.example.myprojecttest.domain.HistoryMessage;
import com.example.myprojecttest.repos.HistoryMessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

@Controller
public class HistoryMessageController {

    @Autowired
    private HistoryMessageRepo historyMessageRepo;




    @PostMapping(value = "/api/temperatures", consumes = "application/json;charset=UTF-8", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createHistoryMessege(  @Valid @RequestBody HistoryMessage request ){

        request.getText ();
        request.getTag ();
        request.getInd ();
        request.getLocalDate ();
        request.getLocalTime ();

        historyMessageRepo.save(request);
    }
}
