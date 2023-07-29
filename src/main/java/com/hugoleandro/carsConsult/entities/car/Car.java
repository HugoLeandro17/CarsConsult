package com.hugoleandro.carsConsult.entities.car;

import com.hugoleandro.carsConsult.entities.brand.Brand;
import com.hugoleandro.carsConsult.entities.motor.Motor;
import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "Car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brand;

    private String model;

    @Enumerated(EnumType.STRING)
    @Column(name = "segment")
    private Segment segment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "motor_id", nullable = false)
    private Motor motor;

    @Enumerated(EnumType.STRING)
    @Column(name = "gearbox_type")
    private GearboxType gearboxType;

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    public Car() {}

    public Car(UUID id, Brand brand, String model, Segment segment, Motor motor, GearboxType gearboxType, Double price,
               String description) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.segment = segment;
        this.motor = motor;
        this.gearboxType = gearboxType;
        this.price = price;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Segment getSegment() {
        return segment;
    }

    public Motor getMotor() {
        return motor;
    }

    public GearboxType getGearboxType() {
        return gearboxType;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setGearboxType(GearboxType gearboxType) {
        this.gearboxType = gearboxType;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
