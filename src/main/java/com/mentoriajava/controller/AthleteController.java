package com.mentoriajava.controller;

import com.mentoriajava.service.AthleteService;

public class AthleteController {
    public static void main(String[] args) {
        AthleteService athleteService = new AthleteService();

        athleteService.save();
        athleteService.athleteClassificationByDistance();
    }
}
