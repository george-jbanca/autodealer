package com.sda.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @Column(name = "first_name",nullable = false)
    private String firstName;


    @Column(name = "last_name",nullable = false)
    private String lastName;

    @OneToMany(mappedBy = "customers",cascade = CascadeType.ALL)
    private List<CarSale> carSales;

    @Column(name = "email")
    private String email;

    public List<CarSale> getCarSales() {
        return this.carSales;
    }

    public void setCarSales(List<CarSale> carSales) {
        this.carSales = carSales;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
