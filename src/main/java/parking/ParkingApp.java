package parking;

import javafx.application.Application;
import javafx.stage.Stage;
import parking.space.ParkingSpace;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Manish on 7/16/17.
 *
 */
public class ParkingApp extends Application{

    public void start(Stage primaryStage) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ParkingSpace parkingSpace = ParkingSpace.getInstance(Integer.parseInt(br.readLine()));

    }

}
