package com.example.myprojecttest.controllers;

import com.example.myprojecttest.domain.Temperature;
import com.example.myprojecttest.repos.TemperatureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;



@Controller
public class TemperatureController {

    @Autowired
    private TemperatureRepo temperatureRepo;

    @PutMapping (value = "/api/temperatures", consumes = "application/json;charset=UTF-8", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createTemperature(  @Valid @RequestBody Temperature request ){
        request.getId();
        request.getText ();
        request.getTag ();
        request.getInd ();
        request.getLocalDate ();
        request.getLocalTime ();

        temperatureRepo.save(request);
    }


}
