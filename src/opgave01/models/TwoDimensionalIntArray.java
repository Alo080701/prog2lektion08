package opgave01.models;

import java.util.Arrays;

public class TwoDimensionalIntArray {
    /*
a) immplementer setValueAt metoden i klassen TwoDimensionalIntArray
b) Implementer getValueAt metoden i klassen TwoDimensionalIntArray
c) Implementer sumRow metoden i klassen TwoDimensionalIntArray. Metoden skal
summere alle tallene i den angivende række.
d) Implementer sumColumn metoden. Metoden skal summere alle tallene i den
angivende kolonne.
e) Implementer sumAll metoden. Metoden skal summere alle tallene i intArray
attributten.
f) Implementer print metoden. Metoden skal udskrive indholdet af intArray attributten
på en passende måde.
    */
    private int[][] intArray;

    public TwoDimensionalIntArray(int[][] intArray) {
        this.intArray = intArray;
    }

    public void setValueAt(int row, int column, int value) {
        intArray[row][column] = value;
    }

    public int getValueAt(int row, int column) {
        return intArray[row][column];
    }


    public int sumRow(int row) {
        int sum = 0;
        for (int i = 0; i < intArray[row].length; i++) {
            sum += intArray[row][i];
        }
        return sum;
    }

    public int sumColumn(int column) {
        int sum = 0;
        for (int[] ints : intArray) {
            sum += ints[column];
        }
        return sum;
    }

    public int sumAll() {
        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[0].length; j++) {
                sum += intArray[i][j];
            }
        }
        return sum;
    }

    public void print() {
        System.out.println(Arrays.deepToString(intArray));
    }

    public void map(IntFunction function) {

    }


}
