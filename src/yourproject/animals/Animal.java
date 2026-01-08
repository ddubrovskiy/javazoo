package org.yourcompany.yourproject.animals;

import org.yourcompany.yourproject.care.Cleanable;
import org.yourcompany.yourproject.care.Feedable;

public abstract class Animal implements Feedable, Cleanable {
    protected String name;
    protected String species;
    protected String feedingSchedule;

    public Animal(String name, String species, String feedingSchedule) {
        this.name = name;
        this.species = species;
        this.feedingSchedule = feedingSchedule;
    }

    public String getName() { return name; }
    public String getSpecies() { return species; }
    public String getFeedingSchedule() { return feedingSchedule; }

    @Override
    public void clean() {
        System.out.println("Cleaning enclosure for " + name + " (" + species + ")");
    }
}