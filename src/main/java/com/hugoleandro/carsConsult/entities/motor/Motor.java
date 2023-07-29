package com.hugoleandro.carsConsult.entities.motor;

import com.hugoleandro.carsConsult.entities.car.Car;
import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "Motor")
public class Motor {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(name = "motor_type")
    private MotorType motorType;

    @Column(name = "engine_displacement")
    private Integer engineDisplacement;

    @Column(name = "horsepower")
    private Integer horsepower;

    @OneToMany(mappedBy = "motor", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Car> cars;

    public Motor() {
        this.cars = new ArrayList<>();
    }

    public Motor(UUID id, MotorType motorType, Integer engineDisplacement, Integer horsepower) {
        this.id = id;
        this.motorType = motorType;
        this.engineDisplacement = engineDisplacement;
        this.horsepower = horsepower;
        this.cars = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public MotorType getMotorType() {
        return motorType;
    }

    public Integer getEngineDisplacement() {
        return engineDisplacement;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setMotorType(MotorType motorType) {
        this.motorType = motorType;
    }

    public void setEngineDisplacement(Integer engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Motor motor = (Motor) o;

        return this.id == motor.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
