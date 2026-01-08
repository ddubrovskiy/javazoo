package org.yourcompany.yourproject.animals;

import org.yourcompany.yourproject.care.Exhibitable;
import org.yourcompany.yourproject.care.MedicalCheckable;

public class Parrot extends Animal implements MedicalCheckable, Exhibitable {
    public Parrot(String name) {
        super(name, "Parrot", "Every 4 hours (seeds, fruits)");
    }

    @Override
    public void feed() {
        System.out.println(name + " (Parrot) received seeds and fruits: " + feedingSchedule);
    }

    @Override
    public void performMedicalCheckup() {
        System.out.println("Medical checkup for parrot " + name + ": feathers, beak, plumage — excellent.");
    }

    @Override
    public void prepareForExhibition() {
        System.out.println(name + " learned a new phrase for the exhibition!");
    }
}