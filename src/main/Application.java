package main;

import robo.*;
import station.ChargingStation;
import station.StationFactory;
import tests.*;

public class Application {
    public static void main(String[] args){

        AbstractRobot robot = RobotFactory.getRobot("Beta", "R2D2");
        ChargingStation station = StationFactory.getStation(0, 0, 0);
        
        System.out.printf("Charging from station test passed %d%%\n",
                           ChargingFromStationTest.runTest(station, robot));


//        AbstractRobot vasilii = RobotFactory.getRobot("Charlie","Vasilii");
//
//        System.out.printf( "Charge test passed %d%%\n", ChargeTest.runTest(vasilii));
//        System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase(vasilii));
//        System.out.printf( "Diagonal walk test passed %d%%\n", DiagonalWalkTest.runTest(vasilii));
    }
}
