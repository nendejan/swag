package com.nendejan.swag.models;

import javax.persistence.*;

/**
 * Created by nico on 7/1/2017.
 */

@Entity
public class EmployeeCategory {

    @Id
    private int id;
    private String name;

    public EmployeeCategory(String name) {
        this.name = name;
    }

    public EmployeeCategory() {
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
}
