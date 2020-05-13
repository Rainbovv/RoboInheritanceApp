package main;

import robo.*;
import tests.*;

public class Application {
    public static void main(String[] args){

        AbstractRobot vasilii = RobotFactory.getRobot("Charlie","Vasilii");

        System.out.printf( "Charge test passed %d%%\n", ChargeTest.testCharge(vasilii));
        System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase(vasilii));
        System.out.printf( "Diagonal walk test passed %d%%\n", DiagonalWalkTest.testDiagonalWalking(vasilii));
    }
}