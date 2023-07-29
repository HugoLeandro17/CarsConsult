package com.hugoleandro.carsConsult.entities.brand;

import com.hugoleandro.carsConsult.entities.car.Car;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.*;

@Entity
@Table(name = "Brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    private String name;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "foundation_date")
    private Date foundationDate;

    @Column(name = "hq_location")
    private String hqLocation;

    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Car> cars;

    public Brand() {
        this.cars = new ArrayList<>();
    }

    public Brand(UUID id, String name, Date foundationDate, String hqLocation) {
        this.id = id;
        this.name = name;
        this.foundationDate = foundationDate;
        this.hqLocation = hqLocation;
        this.cars = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getFoundationDate() {
        return foundationDate;
    }

    public String getHqLocation() {
        return hqLocation;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFoundationDate(Date foundationDate) {
        this.foundationDate = foundationDate;
    }

    public void setHqLocation(String hqLocation) {
        this.hqLocation = hqLocation;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand = (Brand) o;
        return id.equals(brand.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
