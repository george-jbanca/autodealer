package com.sda.model;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "cars")

public class Car {

    @Id
    @Column(name = "car_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "brand_name", nullable = false)
    private String brandName;

    @Column(name = "model_name", nullable = false)
    private String modelName;

    @Column(name = "manufacturing_date")
    private Date manufacturingDate;

    @Column(name = "color")
    private String color;

    @Column(name = "price")
    private Double price;

    @ManyToMany(mappedBy = "cars",cascade = CascadeType.ALL)
    private List<CarOption> carOptions;

    public List<CarOption> getCarOptions() {
        return this.carOptions;
    }

    public void setCarOptions(List<CarOption> carOptions) {
        this.carOptions = carOptions;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Date getManufacturingDate() {
        return this.manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
