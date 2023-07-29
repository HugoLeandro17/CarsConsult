package com.hugoleandro.carsConsult.entities.motor;

public enum MotorType {
    GASOLINE, DIESEL, HYBRID, ELECTRIC, GPL;

    @Override
    public String toString() {
        switch (this) {
            case GASOLINE:
                return "Gasoline";
            case DIESEL:
                return "Diesel";
            case HYBRID:
                return "Hybrid";
            case ELECTRIC:
                return "Electric";
            case GPL:
                return "GPL";
            default:
                return null;
        }
    }
}
