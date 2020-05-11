package robo;

public abstract class AbstractRobot {

    // Setters
    public abstract void setName(String name);
    public abstract void setModel(String model);
    public abstract void setX(int x);
    public abstract void setY(int y);
    public abstract void setCharge(int charge);

    // Getters
    public abstract String getName();
    public abstract String getModel();
    public abstract int getX();
    public abstract int getY();
    public abstract byte getCharge();

    // Moving methods
    public abstract boolean moveRight();
    public abstract boolean moveLeft();
    public abstract boolean moveDown();
    public abstract boolean moveUp();
    public abstract boolean moveDownRight();
    public abstract boolean moveUpRight();
    public abstract boolean moveDownLeft();
    public abstract boolean moveUpLeft();
}