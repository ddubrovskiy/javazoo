package org.yourcompany.yourproject.animals;

import org.yourcompany.yourproject.care.MedicalCheckable;

public class Snake extends Animal implements MedicalCheckable {
    public Snake(String name) {
        super(name, "Snake", "Once a week (mice)");
    }

    @Override
    public void feed() {
        System.out.println(name + " (Snake) received a mouse: " + feedingSchedule);
    }

    @Override
    public void performMedicalCheckup() {
        System.out.println("Shedding and health check completed for snake " + name + ".");
    }

    @Override
    public void clean() {
        System.out.println("Sterilizing terrarium for snake " + name);
    }
}