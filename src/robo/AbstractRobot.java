package robo;

import interfaces.*;

public abstract class AbstractRobot implements Has2DCoordinatesInterface, Moveable2DInterface, HasBatteryInterface {

    // Setters
    public abstract void setName(String name);
    public abstract void setModel(String model);

    // Getters
    public abstract String getName();
    public abstract String getModel();
}