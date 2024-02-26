package opgave04;

import opgave04.models.TheaterFloor;

public class Opgave04 {
    public static void main(String[] args) {
        TheaterFloor theaterFloor = new TheaterFloor();

        System.out.println(theaterFloor.buySeat(2, 3));
        System.out.println("----------------");
        System.out.println(theaterFloor.buySeat(20));
        System.out.println("----------------");
        theaterFloor.printTheaterFloor();

    }
}
