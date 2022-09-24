package hierarchy.entities;

public class Nature {

    protected String color;
    protected String paws;
    protected String sound;
    protected String characteristic;
    protected String environment;
    protected String favoriteFood;

    // Constructor
    public Nature(String color, String paws, String sound, String characteristic, String environment,
            String favoriteFood) {
        this.color = color;
        this.paws = paws;
        this.sound = sound;
        this.characteristic = characteristic;
        this.environment = environment;
        this.favoriteFood = favoriteFood;
    }

    // Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {

    }

    public String getPaws() {
        return paws;
    }

    public void setPaws(String paws) {

    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {

    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {

    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {

    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {

    }

    // Method - toString
    public String toString() {
        return "Color: " + color
                + " - Paws: " + paws
                + " - Sound: " + sound
                + " - Characteristic: " + characteristic
                + " - Environment: " + environment
                + " - Favorite food: " + favoriteFood;
    }
}
