package parking.space;

import parking.parker.Parker;
import parking.util.Contant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manish on 7/16/17.
 *
 */
public class ParkingSpace {
    private static List<Level> levelList;
    private static ParkingSpace parkingSpace;
    private static int levelCount;

    private ParkingSpace(int levelCount) {
        this.levelCount = levelCount;
    }

    public static ParkingSpace getInstance(int levelCount){
        if(parkingSpace == null){
            synchronized (ParkingSpace.class){
                if(parkingSpace == null){
                    parkingSpace = new ParkingSpace(levelCount);
                    initialize();
                }
            }
        }
        return parkingSpace;
    }

    private static void initialize() {
        levelList = new ArrayList<Level>(levelCount);
        Level level;
        Parker parker;
        for(int i=0;i<levelCount;i++){
            parker = new Parker("Parker: "+ i+1);
            level= new Level(Contant.MAX_ROW, Contant.MAX_COL);
            level.setParker(parker);
            levelList.add(level);
        }

    }

    public List<Level> getLevelList() {
        return levelList;
    }

    public void setLevelList(List<Level> levelList) {
        this.levelList = levelList;
    }
}
