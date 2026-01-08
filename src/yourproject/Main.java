package org.yourcompany.yourproject;

import java.util.Arrays;
import java.util.List;

import org.yourcompany.yourproject.animals.Animal;
import org.yourcompany.yourproject.animals.Lion;
import org.yourcompany.yourproject.animals.Parrot;
import org.yourcompany.yourproject.animals.Snake;
import org.yourcompany.yourproject.care.Exhibitable;
import org.yourcompany.yourproject.care.MedicalCheckable;
import org.yourcompany.yourproject.reports.ZooReportGenerator;
import org.yourcompany.yourproject.staff.Veterinarian;
import org.yourcompany.yourproject.staff.Zookeeper;

public class Main {
    public static void main(String[] args) {
        Animal leo = new Lion("Trophy");
        Animal kesh = new Parrot("Chicken Parm");
        Animal slither = new Snake("Shoes");

        List<Animal> zooAnimals = Arrays.asList(leo, kesh, slither);

        Zookeeper keeper = new Zookeeper();
        Veterinarian vet = new Veterinarian();

        System.out.println("=== DAILY ZOO CARE ROUTINE ===");

        for (Animal animal : zooAnimals) {
            keeper.feedAnimal(animal);
        }

        System.out.println();

        for (Animal animal : zooAnimals) {
            keeper.cleanEnclosure(animal);
        }

        System.out.println();

        if (leo instanceof MedicalCheckable) vet.checkAnimal((MedicalCheckable) leo);
        if (kesh instanceof MedicalCheckable) vet.checkAnimal((MedicalCheckable) kesh);
        if (slither instanceof MedicalCheckable) vet.checkAnimal((MedicalCheckable) slither);

        System.out.println();

        if (leo instanceof Exhibitable) ((Exhibitable) leo).prepareForExhibition();
        if (kesh instanceof Exhibitable) ((Exhibitable) kesh).prepareForExhibition();

        System.out.println();

        new ZooReportGenerator().generateSummary(zooAnimals);
    }
}