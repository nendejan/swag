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
    private ArrayList<Shift> shiftsOfWeek;
    private ArrayList<Employee> employeesOfWeek;

    public Schedule(Period scheduleDates, ArrayList<Shift> shiftsOfWeek, ArrayList<Employee> employeesOfWeek) {
        this.scheduleDates = scheduleDates;
        this.shiftsOfWeek = shiftsOfWeek;
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

    public ArrayList<Shift> getShiftsOfWeek() {
        return shiftsOfWeek;
    }

    public void setShiftsOfWeek(ArrayList<Shift> shiftsOfWeek) {
        this.shiftsOfWeek = shiftsOfWeek;
    }

    public ArrayList<Employee> getEmployeesOfWeek() {
        return employeesOfWeek;
    }

    public void setEmployeesOfWeek(ArrayList<Employee> employeesOfWeek) {
        this.employeesOfWeek = employeesOfWeek;
    }
}
