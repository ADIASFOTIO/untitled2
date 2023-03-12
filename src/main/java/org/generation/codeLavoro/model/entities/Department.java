package org.generation.codeLavoro.model.entities;

import java.util.ArrayList;

public class Department {
    // * dipartimento: id, nome, indirizzo, max capacity
    private Long id;
    private String name;
    private int maxCapacity;
    private ArrayList<Employee> employees;


    public Department(Long id, String name, int maxCapacity, ArrayList employees) {
        this.id = id;
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.employees = employees;
    }
    public Department(Long id, String name, int maxCapacity) {
        this.id = id;
        this.name = name;
        this.maxCapacity = maxCapacity;
    }
    public Department(){
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
    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

}
