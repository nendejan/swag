package com.nendejan.swag.models;

import javax.persistence.*;
import java.time.Period;
import java.util.ArrayList;

/**
 * Created by nico on 6/30/2017.
 */

@Entity
public class Schedule {

    @Id
    private int id;
    private Period scheduleDates;
    private ArrayList<Day> daysOfWeek;
    private ArrayList<Employee> employeesOfWeek;

    public Schedule(Period scheduleDates, ArrayList<Day> daysOfWeek, ArrayList<Employee> employeesOfWeek) {
        this.scheduleDates = scheduleDates;
        this.daysOfWeek = daysOfWeek;
        this.employeesOfWeek = employeesOfWeek;
    }

    public Schedule() {
    }

    public int getId() {
        return id;
    }

    public Period getScheduleDates() {
        return scheduleDates;
    }

    public ArrayList<Day> getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(ArrayList<Day> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public ArrayList<Employee> getEmployeesOfWeek() {
        return employeesOfWeek;
    }

    public void setEmployeesOfWeek(ArrayList<Employee> employeesOfWeek) {
        this.employeesOfWeek = employeesOfWeek;
    }
}
