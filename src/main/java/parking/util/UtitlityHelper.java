package parking.util;

import parking.space.Level;
import parking.space.ParkingSpace;
import parking.space.Spot;

/**
 * Created by Manish on 7/16/17.
 *
 */
public class UtitlityHelper {

    public static int getDistance(Level level, Spot spot){
        int x = spot.getX();
        int y = spot.getY();

        int totalDistance = 0;
        totalDistance += x*Contant.MAX_ROW + y;
        totalDistance += level.getLevelIndex()*Contant.MAX_CAPACITY;

        return totalDistance;
    }
}
