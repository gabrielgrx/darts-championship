package com.mentoriajava.dart.service;

import com.mentoriajava.dart.model.Athlete;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class AthleteService {
    ArrayList<Athlete> athleteList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public List<Athlete> save() {
        Athlete athlete;

        for (int i = 1; i < 11; i++) {

            athlete = new Athlete();
            System.out.println("Enter the Athlete " + i + " name");
            athlete.setName(scanner.next());
            System.out.println("Enter the Athelete " + i + " country:");
            athlete.setCountry(scanner.next());
            System.out.println("Enter the distance (meters) of the Athlete " + i);
            athlete.setDistance(scanner.nextInt());
            athleteList.add(athlete);
        }
        return athleteList;
    }

    public void athleteClassificationByDistance() {
        athleteList.sort(Comparator.comparing(Athlete::getDistance).reversed());
        System.out.println("Gold: " + athleteList.get(0).getName() + " - " + athleteList.get(0).getCountry() + " Result: " + athleteList.get(0).getDistance() + "m");
        System.out.println("Silver: " + athleteList.get(1).getName() + " - " + athleteList.get(1).getCountry() + " Result: " + athleteList.get(1).getDistance() + "m");
        System.out.println("Gold: " + athleteList.get(2).getName() + " - " + athleteList.get(2).getCountry() + " Result: " + athleteList.get(2).getDistance() + "m");
    }
}


