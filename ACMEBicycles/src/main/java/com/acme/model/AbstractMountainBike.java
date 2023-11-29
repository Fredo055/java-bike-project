package com.acme.model;

public abstract class AbstractMountainBike  extends AbstractBike {

    public AbstractMountainBike(FrameColors color) {
        super(color);
    }
    @Override
    protected String getWheelType() {
        return "Wide";
    }
}
