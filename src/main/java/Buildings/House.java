package Buildings;

import lombok.Builder;

public class House extends Building {
    @Builder
    public House(String city, double area, double pricePerMeter, int numOfRooms, int numOfWindows, int numOfFlats, boolean isGarage, boolean isGarden, boolean isGym) {
        super(city, area, pricePerMeter, numOfRooms, numOfWindows, numOfFlats, isGarage, isGarden, isGym);
    }
}
