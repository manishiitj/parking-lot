package parking.exception;

/**
 * Created by Manish on 7/16/17.
 *
 */
public class NoVehicleFoundException extends Exception {
    public NoVehicleFoundException() {
    }

    public NoVehicleFoundException(String message) {
        super(message);
    }
}
