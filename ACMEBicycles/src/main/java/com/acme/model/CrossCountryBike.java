package com.acme.model;

import java.math.BigDecimal;

public class CrossCountryBike extends AbstractMountainBike {

    public CrossCountryBike() {
        super(FrameColors.GREEN);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(599.99);
    }

    @Override
    protected int getStartNumber() {
        return 258456;
    }

    @Override
    protected String getPrefix() {
        return "MB605";
    }
}
