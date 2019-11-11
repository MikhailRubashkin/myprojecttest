package com.example.myprojecttest.controllers;

import com.example.myprojecttest.domain.HistorySmoke;
import com.example.myprojecttest.repos.HistorySmokeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

@Controller
public class HistorySmokeController {

    @Autowired
    private HistorySmokeRepo historySmokeRepo;

    @PostMapping( value = "/api/smokes", consumes = "application/json;charset=UTF-8", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createHistorySmoke( @Valid @RequestBody HistorySmoke request ){
        request.getIp ();
        request.getLocation ();
        request.getValue ();
        request.getLocalTime ();
        request.getLocalDate ();


        historySmokeRepo.save(request);
    }
}
