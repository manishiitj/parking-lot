package parking.space;

import parking.vehicle.Vehicle;

/**
 * Created by Manish on 7/16/17.
 *
 */
public class Spot {
    private int x;
    private int y;
    private Vehicle vehicle;
    private SpotType type;

    public enum SpotType{
        COMPACT,
        REGULAR,
        LARGE
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public SpotType getType() {
        return type;
    }

    public void setType(SpotType type) {
        this.type = type;
    }
}
