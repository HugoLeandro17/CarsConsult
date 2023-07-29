package com.hugoleandro.carsConsult.entities.car;

public enum Segment {
    MINI_COMPACT, SUB_COMPACT, COMPACT, MID_SIZE, LARGE, TWO_SEATER, MINIVAN, SUV;

    @Override
    public String toString() {
        switch (this) {
            case MINI_COMPACT:
                return "MiniCompact";
            case SUB_COMPACT:
                return "SubCompact";
            case COMPACT:
                return "Compact";
            case MID_SIZE:
                return "Mid-size";
            case LARGE:
                return "Large";
            case TWO_SEATER:
                return "Two-seater";
            case MINIVAN:
                return "Minivan";
            case SUV:
                return "SUV";
            default:
                return null;
        }
    }
}
