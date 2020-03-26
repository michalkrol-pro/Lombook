import Buildings.Apartment;
import Buildings.Block;
import Buildings.Building;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apartment apartment = Apartment.builder().pricePerMeter(20000).build();

        Building block = Block.builder()
                              .city("Cracow")
                              .area(10000)
                              .numOfRooms(8500)
                              .numOfFlats(3)
                              .isGarage(true)
                              .build();

        System.out.println(block.getNumOfWindows());
        System.out.println(apartment.getFullPrice());
    }
}