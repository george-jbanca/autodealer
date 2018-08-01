package com.sda.model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy = "employees",cascade = CascadeType.ALL)
    private Roles role;

    @OneToMany(mappedBy = "employees",cascade = CascadeType.ALL)
    private List<CarSale> carSaleList;

    public Roles getRole() {
        return this.role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public List<CarSale> getCarSaleList() {
        return this.carSaleList;
    }

    public void setCarSaleList(List<CarSale> carSaleList) {
        this.carSaleList = carSaleList;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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
