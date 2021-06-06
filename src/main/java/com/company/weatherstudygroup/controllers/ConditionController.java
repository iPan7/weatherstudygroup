package com.company.weatherstudygroup.controllers;

import models.Condition;
import models.Temperature;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ConditionController {
    static Temperature temp1 = new Temperature(94, 34, 94596);
    static List<Condition> conditionList = new ArrayList<>(Arrays.asList(
            new Condition(9001, temp1, "North", "Grey", "Light Rain"),
            new Condition(37, new Temperature(66,34, 30044), "South", "Purple", "Heavy Rain")
    ));

    @RequestMapping(value = "/condition/{zipcode}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Condition getConditionsById(@PathVariable int zipcode) {
        Condition foundCondition = null;
        System.out.println("hello!");
        for(Condition condition : conditionList) {
            System.out.println(condition.getTemperature().getZipcode());
            if(condition.getTemperature().getZipcode() == zipcode) {
                foundCondition = condition;
                break;
            }
        }
        return foundCondition;
    }





}
