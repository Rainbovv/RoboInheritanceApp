package station;

public class StationFactory {
    public static ChargingStation getStation(int x, int y, int charge){
        return new ChargingStation(x,y,charge);
    }
}
