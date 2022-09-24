package hierarchy.entities;

public class Mammal extends Nature {

    // Subclass that extends Nature by inheriting its attributes and methods.
    public Mammal(String color, String paws, String sound, String characteristic, String environment,
            String favoriteFood) {
        super(color, paws, sound, characteristic, environment, favoriteFood);
    }
}
