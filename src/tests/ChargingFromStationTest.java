package tests;

import interfaces.HasBatteryInterface;
import robo.AbstractRobot;
import station.ChargingStation;

public class ChargingFromStationTest {
    public static int runTest(ChargingStation station, AbstractRobot chargeable){
        int percentage = 0;

        station.setX(10);
        station.setY(10);
        station.setCharge(100);

        chargeable.setX(20);
        chargeable.setY(20);
        chargeable.setCharge(50);


        if (station.charge(chargeable)) {
            System.err.println("Charging from station test failed\nREASON: The station is charging" +
                               " an object from another coordinates");
            return percentage;
        }

        percentage += 33;

        chargeable.setY(10);
        chargeable.setX(10);

        if (!station.charge(chargeable) || station.getCharge() != 95 || chargeable.getCharge() != 100){
            System.err.println("Charging from station test failed\nREASON: The station " +
                               "doesn't charge correctly.");
            return percentage;
        }

        percentage += 33;

        if (station.charge(chargeable)){
            System.err.println("Charging from station test failed\nREASON: The station is charging an"+
                               "object with a full battery");
            return percentage;
        }

        percentage += 34;
        return percentage;
    }
}