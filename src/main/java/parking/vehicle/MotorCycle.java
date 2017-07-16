package parking.vehicle;

import parking.space.Spot;

/**
 * Created by Manish on 7/16/17.
 *
 */
public class MotorCycle extends Vehicle {

    public Boolean canBeParkedAt(Spot spot) {
        if(spot.getType().equals(Spot.SpotType.COMPACT) ||spot.getType().equals(Spot.SpotType.REGULAR) || spot.getType().equals(Spot.SpotType.LARGE))
            return true;
        return false;
    }
}
