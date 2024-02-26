package opgave02;

import com.sun.source.tree.NewArrayTree;

import java.util.Arrays;
import java.util.Scanner;

public class to {
    public static void main(String[] args) {
        double[][] numbers = {{}, {}, {}, {}};
        averageMajorDiagonal(numbers);
    }

    public static double averageMajorDiagonal(double[][] m) {
        Scanner scan = new Scanner(System.in);
        int placering = 0;
        int placering2;
        double svar = 0;


        while (placering < 4) {
            System.out.println("Indtast 4 tal");
            placering2 = 0;
            while (placering2 < 4) {
                double tal = scan.nextDouble();
                svar += tal;
                placering2++;
            }
            placering++;
        }

        System.out.println("det giver: " + svar /16);
        scan.close();
        return svar / 16;
    }

}
