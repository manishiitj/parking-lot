package parking.vehicle;

import parking.exception.NoVehicleFoundException;

/**
 * Created by Manish on 7/16/17.
 *
 */

public class VehicleFactory {

    public Vehicle getVehicle(Vehicle.Type type) throws NoVehicleFoundException{
        Vehicle vehicle;
        switch (type){
            case MOTORCYCLE:
                vehicle = new MotorCycle();
                break;

            case CAR:
                vehicle= new Car();
                break;

            case TRUCK:
                vehicle = new Truck();
                break;

            default:
                throw new NoVehicleFoundException("No vehicle found with given type: "+ type.toString());
        }
        return vehicle;
    }
}
