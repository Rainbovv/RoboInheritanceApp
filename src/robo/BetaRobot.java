package robo;

public class BetaRobot extends AlphaRobot {

    // Properties
    protected byte charge;
    protected byte moves = 1;


    //////////////////  CONSTRUCTORS //////////////////
//    protected BetaRobot() {}

    protected BetaRobot(String name, String model) {
        super(name, model);
        setCharge(0);
    }


    //////////////////  SETTERS  //////////////////
    public void setCharge(int charge) {
        if (charge < 0 || charge > 100) System.err.println("You have used a non valid value! " +
                                                           "Use on from the range - [0 - 100]");
        else this.charge = (byte)charge;
    }


    //////////////////  GETTERS  //////////////////
    public byte getCharge() {
        return charge;
    }


    //////////////////  MOVING METHODS  //////////////////
    public boolean moveRight() {
        if (checkCharge() && super.moveRight()) {
            checkMove();
            return true;
        }
        else return false;
    }

    public boolean moveLeft() {
        if (checkCharge() && super.moveLeft()) {
            checkMove();
            return true;
        }
        else return false;
    }

    public boolean moveDown() {
        if (checkCharge() && super.moveDown()) {
            checkMove();
            return true;
        }
        else return false;
    }

    public boolean moveUp() {
        if (checkCharge() && super.moveUp()) {
            checkMove();
            return true;
        }
        else return false;
    }

    public boolean moveDownRight() {
        return false;
    }

    public boolean moveUpRight() {
        return false;
    }

    public boolean moveDownLeft() {
        return false;
    }

    public boolean moveUpLeft() {
        return false;
    }

    protected void checkMove(){
        if (moves % 2 == 0) charge -= 1;
        moves++;
    }

    protected boolean checkCharge(){
        if (charge < 5) {printLowCharge(); return false;}
        else return true;
    }


    // Error Templates
    protected void printLowCharge(){
        System.err.println("Low battery! Please charge up the robot!");
    }
}