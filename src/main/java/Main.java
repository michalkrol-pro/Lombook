import apartments.Apartment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apartment a1 = new Apartment("Warsaw", 80, 8500);
        Apartment a2 = new Apartment("Cracow", 30, 8000);
        Apartment a3 = new Apartment("Gdansk", 100, 7500);

        List<Apartment> apartmentsList = new ArrayList<>(Arrays.asList(a1, a2, a3));

        double apartmentsAveragePrice = 0;
        for (Apartment apartment : apartmentsList) {
            apartmentsAveragePrice += apartment.getFullPrice();
            System.out.println(String.format("Apartment in %s costs %.2f.", apartment.getCity(), apartment.getFullPrice()));
        }
        System.out.println("Average price is " + apartmentsAveragePrice);
    }
}