package com.example.myprojecttest.controllers;

import com.example.myprojecttest.domain.Temperature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.nio.charset.Charset;
import java.util.Date;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TemperatureControllerTest {

    @Autowired
    TemperatureController temperatureController;

    @Autowired
    private MockMvc mockMvc;

    public static final MediaType APPLICATION_JSON_UTF8 = new MediaType (MediaType.APPLICATION_JSON.getType ( ), MediaType.APPLICATION_JSON.getSubtype ( ), Charset.forName ("utf8"));

    @Test
    public void createTemperature () throws Exception{

        String url = "/api/temperatures";
        Temperature temperature = new Temperature ( );
        temperature.setId (1);
        temperature.setText ("температура");
        temperature.setTag ("коридор");
        temperature.setInd ("16");
        temperature.setLocalTime (new Date ( ));
        temperature.setLocalDate (new Date ( ));
        ObjectMapper mapper = new ObjectMapper ( );
        mapper.configure (SerializationFeature.WRAP_ROOT_VALUE, false);
        ObjectWriter ow = mapper.writer ( ).withDefaultPrettyPrinter ( );
        String requestJson = ow.writeValueAsString (temperature);

        mockMvc.perform (MockMvcRequestBuilders.put (url).contentType (APPLICATION_JSON_UTF8)
                                 .content (requestJson))
                .andExpect (status ( ).isCreated ( ));
    }
}



