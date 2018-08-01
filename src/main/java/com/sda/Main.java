package com.sda;

import com.sda.dao.*;
import com.sda.model.Car;
import com.sda.model.CarOption;
import com.sda.model.CarSale;
import com.sda.model.Customer;
import com.sda.util.HibernateUtil;

import java.util.LinkedList;
import java.util.List;

public class Main {

    private CarDao carDao;
    private CarOptionDao carOptionDao;
    private CarSaleDao carSaleDao;
    private CustomerDao customerDao;
    private EmployeeDao employeeDao;
    private RolesDao rolesDao;
    private List<Car> cars = new LinkedList<Car>();

    public Main() {
        carDao = new CarDao();
        carOptionDao = new CarOptionDao();
        carSaleDao = new CarSaleDao();
        customerDao = new CustomerDao();
        employeeDao = new EmployeeDao();
        rolesDao = new RolesDao();
    }

    public void createCar() {
        Car car  = new Car();
        car.setBrandName("BMW");
        car.setModelName("X3");
        car.setColor("Black");
        car.setPrice(10000D);
        car.setCarOptions(createCarOption());
        cars.add(car);
    }

    public List<CarOption> createCarOption() {
        List<CarOption> carOptionsList = new LinkedList<CarOption>();
        CarOption carOption = new CarOption();
        carOption.setOptionDescription("Latest Features");
        carOption.setOptionName("Full Options");
        carOptionsList.add(carOption);
        return carOptionsList;
    }
//
//    public void createCustomer() {
//        Customer customer = new Customer();
//        customer.setFirstName("Popescu");
//        customer.setLastName("Popescu");
//        customer.setEmail("popescu@popescu.com");
//        customer.setCarSales(createCarSale());
//    }

    public CarSale createCarSale() {
        CarSale carSale = new CarSale();
        List<Car> soldCars = null;
        Car car = cars.get(1);
        Car car2 = cars.get(4);
        soldCars.add(car);
        soldCars.add(car2);
        carSale.setCars(soldCars);
        return carSale;
    }

    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.createCar();
        }
        finally {
            HibernateUtil.close();
        }
    }



}
