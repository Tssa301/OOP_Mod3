package hierarchy.application;

import hierarchy.entities.Cat;

public class Program {

    public static void main(String[] args) {

        /*
         * Herança - As classes são independentes, porém algumas classes herdam
         * atributos e métodos de outras classes. Por exemplo: A classe Mamífero herda
         * da classe Natureza, e classe Gato herda da classe Mamífero.
         * Usando a palavra reservada "Super" é possível chamar a implementação de uma
         * superclasse(Natureza).
         */

        // Created a Cat object.
        Cat wildCat = new Cat("Brindle", "4 legs", "Meow", "long coat", "Terrestrial", "Rodents, Birds, geckos");
        Cat domesticCat = new Cat("Black", "4 legs", "Meow", "normal coat", "Terrestrial", "Pet food");

        System.out.println("Wild Cat: " + wildCat);
        System.out.println("Domestic Cat: " + domesticCat);
    }

}
