package com.hugoleandro.carsConsult.entities.car;

public enum GearboxType {
    MANUAL, AUTOMATIC;

    @Override
    public String toString() {
        switch (this) {
            case MANUAL:
                return "Manual";
            case AUTOMATIC:
                return "Automatic";
            default:
                return null;
        }
    }
}
