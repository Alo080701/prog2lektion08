package opgave03;

import java.util.Arrays;
import java.util.Scanner;

public class tre {
    public static void main(String[] args) {
        double[][] numbers = {{}, {}, {}, {}};
        locateSmallest(numbers);

    }
    public static int[] locateSmallest(double[][] a){
        Scanner scan = new Scanner(System.in);
        int placering = 0;
        int placering2;
        double talsvar = 10;
        int[] svar = new int[2];

        System.out.println("indtast rows og columns");
        int rows = scan.nextInt();
        int columns = scan.nextInt();

        while (placering < rows) {
            System.out.println("Indtast tal");
            placering2 = 0;
            while (placering2 < columns) {
                double tal = scan.nextDouble();
                if (tal <= talsvar){
                    talsvar = tal;
                    svar[0] = placering;
                    svar[1] = placering2;
                }

                placering2++;
            }
            placering++;
        }

        System.out.println("det er: " + Arrays.toString(svar));
        scan.close();

        return svar;
    }

}
