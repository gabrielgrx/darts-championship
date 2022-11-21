package com.mentoriajava.dart.controller;

import com.mentoriajava.dart.service.AthleteService;

public class AthleteController {
    public static void main(String[] args) {
        AthleteService athleteService = new AthleteService();

        athleteService.save();
        athleteService.athleteClassificationByDistance();
    }
}
