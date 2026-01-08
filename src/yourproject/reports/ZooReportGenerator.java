package org.yourcompany.yourproject.reports;

import java.util.List;

import org.yourcompany.yourproject.animals.Animal;

public class ZooReportGenerator {
    public void generateSummary(List<Animal> animals) {
        System.out.println("\n=== MOSCOW ZOO DAILY REPORT ===");
        System.out.println("Total number of animals: " + animals.size());

        System.out.println("\nFeeding schedule:");
        for (Animal a : animals) {
            System.out.println("- " + a.getName() + " (" + a.getSpecies() + "): " + a.getFeedingSchedule());
        }

        System.out.println("\n[System ready for automated feeding and medical checks]\n");
    }
}