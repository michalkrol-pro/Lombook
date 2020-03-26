package apartments;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Apartment {
    String city;
    int area;
    double pricePerMeter;

    public double getFullPrice() {
        return pricePerMeter * 0.95;
    }
}