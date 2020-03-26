package Buildings;

import lombok.Builder;

public class Block extends Building {
    @Builder
    public Block(String city, double area, double pricePerMeter, int numOfRooms, int numOfWindows, int numOfFlats, boolean isGarage, boolean isGarden, boolean isGym) {
        super(city, area, pricePerMeter, numOfRooms, numOfWindows, numOfFlats, isGarage, isGarden, isGym);
    }
}
