package com.pjatk.car_rental.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private String surname;
    private String phone_number;
    private int have_car;
    private int rents;

    public Customer(Long id, String name, String surname, String phone_number, int have_car, int rents) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.have_car = have_car;
        this.rents = rents;
    }

    public Customer(String name, String surname, String phone_number, int have_car, int rents) {
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.have_car = have_car;
        this.rents = rents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getHave_car() {
        return have_car;
    }

    public void setHave_car(int have_car) {
        this.have_car = have_car;
    }

    public int getRents() {
        return rents;
    }

    public void setRents(int rents) {
        this.rents = rents;
    }
}
