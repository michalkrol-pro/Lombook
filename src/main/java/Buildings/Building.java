package Buildings;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Building {
    String city;
    double area;
    double pricePerMeter;
    int numOfRooms;
    int numOfWindows;
    int numOfFlats;
    boolean isGarage;
    boolean isGarden;
    boolean isGym;

    public double getFullPrice() {
        return area * pricePerMeter * 0.95;
    }
}
