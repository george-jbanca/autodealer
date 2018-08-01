package com.sda.model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "car_sales")
public class CarSale {

    @Id
    @Column(name = "sale_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int saleId;

    @Column(name = "customer_id",nullable = false)
    private String customerId;

    @Column(name = "employee_id",nullable = false)
    private String employeeId;

    @OneToMany(mappedBy = "car_sales", cascade = CascadeType.ALL)
    private List<Car> cars;

    public List<Car> getCars() {
        return this.cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public int getSaleId() {
        return this.saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
