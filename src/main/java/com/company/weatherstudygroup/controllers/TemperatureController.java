package com.company.weatherstudygroup.controllers;

import models.Temperature;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TemperatureController {

    private static List<Temperature> tempList = new ArrayList<>(Arrays.asList(
            new Temperature(69.8, 21, 94596),
            new Temperature(100, 37.778, 30044)

    ));


    // this is the get method to get ONE temp via zipcode
    @RequestMapping(value = "/temp/{zipcode}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Temperature getTemperaturesById(@PathVariable int zipcode) {
        Temperature foundTemperature = null;

        for(Temperature temperature : tempList) {
            if(temperature.getZipcode() == zipcode) {
                foundTemperature = temperature;
                break;
            }
        }
        return foundTemperature;
    }
    // end of get method

    // this is the get method to get ALL temp via zipcode
    @RequestMapping(value = "/temp", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Temperature> getAllTemperatures() {

        return tempList;
    }
    // end of get method


}
