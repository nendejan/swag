package com.nendejan.swag.models;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

import javax.validation.constraints.Size;

/**
 * Created by nico on 6/30/2017.
 */

@Entity
public class Employee {

    @Id
    private int id;

    @NotNull
    @Size(min=2, message="Emplyee must have a name.")
    private String name;

    @NotNull
    private int wage;

    private Schedule availability;
    private int swagAmount;
    private int hoursWorked;

    public Employee(String name, int wage, Schedule availability) {
        this.name = name;
        this.wage = wage;
        this.availability = availability;
        }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public Schedule getAvailability() {
        return availability;
    }

    public void setAvailability(Schedule availability) {
        this.availability = availability;
    }

    public int getSwagAmount() {
        return swagAmount;
    }

    public void setSwagAmount(int swagAmount) {
        this.swagAmount = swagAmount;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

