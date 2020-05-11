package tests;

import robo.*;

public class ChargeTest {
    public static int testCharge(AbstractRobot robot) {
        int percentage = 0;


        // Charge cannot be les than 0
        robot.setCharge(-100);
        if (robot.getCharge() < 0){
            System.err.println("Charge test failed\nREASON: Values les than 0 not allowed!");
            return percentage;
        }
        percentage += 33;


        // Charge cannot be more than 100
        robot.setCharge(1000);
        if (robot.getCharge() > 100){
            System.err.println("Charge test failed\nREASON: Values more than 0 not allowed!");
            return percentage;
        }
        percentage += 33;


        // Checking Movement
        robot.setCharge(50);
        while(robot.moveRight());
        System.out.println("The charge level is: " + robot.getCharge());
        if (robot.getCharge() != 4 || robot.getX() != 92){
            System.err.println("Charge test failed\nREASON: The moving system should be calibrated!");
            return percentage;
        }
        percentage += 34;
        return percentage;
    }
}