package org.yourcompany.yourproject.animals;

import org.yourcompany.yourproject.care.Exhibitable;
import org.yourcompany.yourproject.care.MedicalCheckable;

public class Lion extends Animal implements MedicalCheckable, Exhibitable {
    public Lion(String name) {
        super(name, "Lion", "Twice a day (meat)");
    }

    @Override
    public void feed() {
        System.out.println(name + " (Lion) received fresh meat according to schedule: " + feedingSchedule);
    }

    @Override
    public void performMedicalCheckup() {
        System.out.println("Medical checkup for lion " + name + ": teeth, claws, weight — all good.");
    }

    @Override
    public void prepareForExhibition() {
        System.out.println(name + " prepared for exhibition: mane combed, enclosure cleaned.");
    }
}