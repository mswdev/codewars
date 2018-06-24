package java.eight_kyu;

public class TransportationOnVacation {

    public static int rentalCarCost(int d) {
        int total = 0;
        if (d >= 7) {
            total -= 50;
        } else if (d >= 3) {
            total -= 20;
        }

        return total + (d * 40);
    }

}

