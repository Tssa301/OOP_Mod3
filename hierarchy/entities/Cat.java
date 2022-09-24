package hierarchy.entities;

public class Cat extends Mammal {

    // Subclass that extends Mammal by inheriting its attributes and methods.
    public Cat(String color, String paws, String sound, String characteristic, String environment,
            String favoriteFood) {
        super(color, paws, sound, characteristic, environment, favoriteFood);
    }
}
