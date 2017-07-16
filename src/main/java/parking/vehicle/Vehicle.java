package parking.vehicle;

import parking.space.Spot;

/**
 * Created by Manish on 7/16/17.
 *
 */
public abstract class Vehicle {
    abstract Boolean canBeParkedAt(Spot spot);

    public enum Type{
        MOTORCYCLE,
        CAR,
        TRUCK
    }
}
