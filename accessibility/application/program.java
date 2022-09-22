package accessibility.application;

import accessibility.entities.AccountA;
import accessibility.entities.AccountB;
import accessibility.entities.AccountC;

public class program {

    public static void main(String[] args) {

        // Created an object from Accounts A, B, and C.
        // AccountC extends AccountA(Superclass and Subclass)
        AccountA accA = new AccountA("Maria Jose", 1234, 1100.0);
        AccountB accB = new AccountB("Pedro Henrique", 5678, 1350.0);
        AccountC accC = new AccountC("Nuno Silva", 8901, 1000.0);

        System.out.println("AccountA: " + accA.toString());
        System.out.println("AccountB: " + accB.toString());
        System.out.println("AccountC: " + accC.toString());

    }

}
