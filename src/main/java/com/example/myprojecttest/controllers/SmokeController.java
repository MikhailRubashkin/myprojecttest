package com.example.myprojecttest.controllers;


import com.example.myprojecttest.domain.Smoke;
import com.example.myprojecttest.repos.SmokeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

@Controller
public class SmokeController {

    @Autowired
    SmokeRepo smokeRepo;

    @PutMapping(value = "/api/smokes", consumes = "application/json;charset=UTF-8", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createSmoke( @Valid @RequestBody Smoke request ){
        request.getId ();
        request.getIp ();
        request.getLocation ();
        request.getValue ();
        request.getLocalTime ();
        request.getLocalDate ();


        smokeRepo.save(request);
    }
}


