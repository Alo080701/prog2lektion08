package opgave04.models;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;

public class TheaterFloor {
    int[][] seats = {{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10}, {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {20, 20, 30, 30, 40, 40, 30, 30, 20, 20}, {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
            {30, 40, 50, 50, 50, 50, 50, 50, 40, 30}};

    /**
     * Hvis plads seat på række row er ledig reserveres pladsen og der returneres true
     * Der returneres false hvis pladsen er optaget.
     *
     * @param row
     * @param seat
     * @return
     */

    public boolean buySeat(int row, int seat) {
        boolean svar = false;
        if (seats[row - 1][seat - 1] != 0) {
            seats[row - 1][seat - 1] = 0;
            svar = true;
        }

        return svar;
    }

    /**
     * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
     * der returneres true. Der returneres false, hvis der ikke er nogen pladser ledige
     * til den pågældende pris.
     *
     * @param price
     * @return
     */
    public boolean buySeat(int price) {
        boolean svar = false;

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == price) {
                    while (svar != true) {
                        seats[i][j] = 0;
                        svar = true;
                    }
                }

            }
        }

        return svar;

    }

    public void printTheaterFloor() {
        System.out.println("Ledige pladser er angivet ved deres pris: ");
        System.out.print("Række: ");
        for (int i = 0; i < seats.length; i++) {
            System.out.print(i + 1 + "   ");

        }
        System.out.println();
        System.out.println("-------------------------------");

        int i = 0;
        for (int j = 0; j < seats[i].length; j++) {
            System.out.print("sæde " + (j + 1) + ": ");

            while (i < seats.length) {
                if (seats[i][j] != 0) {
                    System.out.print(seats[i][j] + ", ");
                } else {
                    System.out.print("--, ");
                }
                i++;
            }
            i = 0;
            System.out.println(" ");
        }

    }
}

