package tests;

import robo.AbstractRobot;

public class DiagonalWalkTest {
    public static int testDiagonalWalking(AbstractRobot robot){
        int percentage = 0;
        robot.setCharge(10);


        // Y cannot be more than 100
        robot.setY(100);
        robot.setX(50);
        if (robot.moveDownRight()) {
            System.err.println("Diagonal moving test failed\nREASON: moveDownRight() out of bounds!");
            return percentage;
        }
        percentage +=10;

        robot.setY(100);
        robot.setX(50);
        if (robot.moveDownLeft()) {
            System.err.println("Diagonal moving test failed\nREASON: moveDownLeft() out of bounds!");
            return percentage;
        }
        percentage +=10;


        // Y cannot be less than 0
        robot.setY(0);
        robot.setX(50);
        if (robot.moveUpRight()) {
            System.err.println("Diagonal moving test failed\nREASON: moveUpRight() out of bounds!");
            return percentage;
        }
        percentage +=10;

        robot.setY(0);
        robot.setX(50);
        if (robot.moveUpLeft()) {
            System.err.println("Diagonal moving test failed\nREASON: moveUpLeft() out of bounds!");
            return percentage;
        }
        percentage +=10;


        // X cannot be more than 100
        robot.setY(50);
        robot.setX(100);
        if (robot.moveDownRight()) {
            System.err.println("Diagonal moving test failed\nREASON: moveDownRight() out of bounds!");
            return percentage;
        }
        percentage +=10;

        robot.setY(50);
        robot.setX(100);
        if (robot.moveUpRight()) {
            System.err.println("Diagonal moving test failed\nREASON: moveUpRight() out of bounds!");
            return percentage;
        }
        percentage +=10;


        // Y cannot be less than 0
        robot.setY(50);
        robot.setX(0);
        if (robot.moveUpLeft()) {
            System.err.println("Diagonal moving test failed\nREASON: moveUpLeft() out of bounds!");
            return percentage;
        }
        percentage +=10;

        robot.setY(50);
        robot.setX(0);
        if (robot.moveDownLeft()) {
            System.err.println("Diagonal moving test failed\nREASON: moveDownLeft() out of bounds!");
            return percentage;
        }
        percentage +=10;


        // Checking Movement
        robot.setY(50);
        robot.setX(50);
        while(robot.moveDownLeft());
        if (robot.getCharge() != 4 || robot.getX() != 38 || robot.getY() != 62) {
            System.err.println("Charge test failed\nREASON: The moving system should be calibrated!");
            return percentage;
        }
        percentage += 5;

        robot.setCharge(10);
        robot.setY(50);
        robot.setX(50);
        while(robot.moveUpLeft());
        if (robot.getCharge() != 4 || robot.getX() != 38 || robot.getY() != 38) {
            System.err.println("Charge test failed\nREASON: The moving system should be calibrated!");
            return percentage;
        }
        percentage += 5;

        robot.setCharge(10);
        robot.setY(50);
        robot.setX(50);
        while(robot.moveDownRight());
        if (robot.getCharge() != 4 || robot.getX() != 62 || robot.getY() != 62) {
            System.err.println("Charge test failed\nREASON: The moving system should be calibrated!");
            return percentage;
        }
        percentage += 5;

        robot.setCharge(10);
        robot.setY(50);
        robot.setX(50);
        while(robot.moveUpRight());
        if (robot.getCharge() != 4 || robot.getX() != 62 || robot.getY() != 38) {
            System.err.println("Charge test failed\nREASON: The moving system should be calibrated!");
            return percentage;
        }
        percentage += 5;

    return percentage;
    }
}