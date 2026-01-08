package org.yourcompany.yourproject.staff;

import org.yourcompany.yourproject.care.Cleanable;
import org.yourcompany.yourproject.care.Feedable;

public class Zookeeper {
    public void feedAnimal(Feedable animal) {
        animal.feed();
    }

    public void cleanEnclosure(Cleanable enclosure) {
        enclosure.clean();
    }
}