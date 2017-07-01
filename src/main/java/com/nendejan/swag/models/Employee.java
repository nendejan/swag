package com.nendejan.swag.models;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

import javax.validation.constraints.Size;
import java.util.ArrayList;

/**
 * Created by nico on 6/30/2017.
 */

@Entity
public class Employee {

    @Id
    private int id;

    @NotNull
    @Size(min = 2, message = "Emplyee must have a name.")
    private String name;

    @NotNull
    private int wage;
    private EmployeeCategory employeeCategory;
    //TODO Ask should this be public? Should I create a public method to adjust/set availability instead? Does that belong in the controller/class/can or should the DAO do it?
    public ArrayList<Shift> availability;

    private int swagAmount;
    private int hoursWorked;

    public Employee(String name, int wage, ArrayList<Shift> availability) {
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

    public ArrayList<Shift> getAvailability() {
        return availability;
    }

    public void setAvailability(ArrayList<Shift> availability) {
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

    public EmployeeCategory getEmployeeCategory() { return employeeCategory; }

    public void setEmployeeCategory(EmployeeCategory employeeCategory) {this.employeeCategory = employeeCategory;}
}