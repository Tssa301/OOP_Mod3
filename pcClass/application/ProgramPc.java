package pcClass.application;

import java.util.Scanner;

import pcClass.entities.Pc;

public class ProgramPc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter PC information:"); // User data enter
        System.out.print("Brand: ");
        String brand = sc.nextLine();
        System.out.print("Model: ");
        String model = sc.nextLine();
        System.out.print("RAM: ");
        int ram = sc.nextInt();
        System.out.print("HD: ");
        int hd = sc.nextInt();

        Pc pc = new Pc(brand, model, ram, hd); // Create an PC object.

        System.out.println();
        System.out.println("Your PC information: ");
        System.out.println("PC Brand: " + pc.getBrand());
        System.out.println("PC Model: " + pc.getModel());
        System.out.println("PC RAM: " + pc.getRam());
        System.out.println("PC HD: " + pc.getHd());

        sc.close();
    }
}
