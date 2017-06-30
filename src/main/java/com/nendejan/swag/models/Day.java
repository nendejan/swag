package com.nendejan.swag.models;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by nico on 6/30/2017.
 */
public class Day {

    @Id
    private int id;

    @NotNull
    private String name;
    private Date date;
    private int laborHours;
    private int laborCost;
    private ArrayList<Employee> employeesOfDay;

    public Day(int id, String name, Date date, int laborHours, int laborCost, ArrayList<Employee> employeesOfDay) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.laborHours = laborHours;
        this.laborCost = laborCost;
        this.employeesOfDay = employeesOfDay;
    }

    public Day() {
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

    public ArrayList<Employee> getEmployeesOfDay() {
        return employeesOfDay;
    }

    public void setEmployeesOfDay(ArrayList<Employee> employeesOfDay) {
        this.employeesOfDay = employeesOfDay;
    }
}
