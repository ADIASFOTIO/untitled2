package org.generation.codeLavoro.model.entities;

import java.util.ArrayList;

public class Department {
    // * dipartimento: id, nome, indirizzo, max capacity
    private Long id;
    private String name;
    private String adress;
    private int maxCapacity;
    private ArrayList<Employee> employees;


    public Department(Long id, String name, String adress, int maxCapacity) {
        this.id = id;
        this.name = name;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
