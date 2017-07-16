package parking.vehicle;

import parking.space.Spot;

/**
 * Created by Manish on 7/16/17.
 *
 */
public class Truck extends Vehicle{

    public Boolean canBeParkedAt(Spot spot) {
        if(spot.getType().equals(Spot.SpotType.LARGE))
            return true;
        return false;
    }
}
