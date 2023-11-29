package com.acme.model;

public abstract class AbstarctRoadBike extends AbstractBike {

    public AbstarctRoadBike(FrameColors color) {
        super(color);
    }

    @Override
    protected String getWheelType() {
        return "Normal";
    }




}
