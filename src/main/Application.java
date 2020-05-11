package main;

import robo.*;
import tests.*;

public class Application {
    public static void main(String[] args){

        AbstractRobot vasilii = RobotFactory.getRobot("Charlie","Vasilii");
        vasilii.setY(100);
        vasilii.setX(50);
        vasilii.setCharge(50);
        vasilii.moveDown();
        System.out.println(vasilii.getY());
//        System.out.printf( "Charge test passed %d%%\n", ChargeTest.testCharge(vasilii));
//        System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase(vasilii));
//        System.out.printf( "Diagonal walk test passed %d%%\n", DiagonalWalkTest.testDiagonalWalking(vasilii));


    }
}