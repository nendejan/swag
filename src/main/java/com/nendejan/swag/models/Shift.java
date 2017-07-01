package com.nendejan.swag.models;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by nico on 6/30/2017.
 */
public class Shift {

    @Id
    private int id;

    @NotNull
    private String name;
    private Date date;
    private int laborHours;
    private int laborCost;
    private ArrayList<Employee> employeesOfShift;

    public Shift(int id, String name, Date date, int laborHours, int laborCost, ArrayList<Employee> employeesOfShift) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.laborHours = laborHours;
        this.laborCost = laborCost;
        this.employeesOfShift = employeesOfShift;
    }

    public Shift() {
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLaborHours() {
        return laborHours;
    }

    public void setLaborHours(int laborHours) {
        this.laborHours = laborHours;
    }

    public int getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(int laborCost) {
        this.laborCost = laborCost;
    }

    public ArrayList<Employee> getEmployeesOfShift() {
        return employeesOfShift;
    }

    public void setEmployeesOfShift(ArrayList<Employee> employeesOfShift) {
        this.employeesOfShift = employeesOfShift;
    }
}
