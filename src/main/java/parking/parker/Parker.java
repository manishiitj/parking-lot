package parking.parker;

import parking.vehicle.Car;
import parking.vehicle.MotorCycle;
import parking.vehicle.Vehicle;

/**
 * Created by Manish on 7/16/17.
 *
 */
public class Parker {
    private String name;

    public Parker(String name) {
        this.name = name;
    }

    public void park(Vehicle vehicle){
        if(vehicle instanceof MotorCycle){

        }else if(vehicle instanceof Car){

        }else{

        }
    }

    public void unPark(Vehicle vehicle){

    }
}
