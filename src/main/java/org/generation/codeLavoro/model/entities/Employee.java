package org.generation.codeLavoro.model.entities;
// impiegati: id, nome, cognome, data di assunzione, sesso, id dipartimento

import java.util.Date;

public class Employee {
    private Long id;
    private String name;
    private Date creatdAt;
    private Sex sex;
    private Department department;

    public Employee(Long id, String name, Date creatdAt, Sex sex, Department department) {
        this.id = id;
        this.name = name;
        this.creatdAt = creatdAt;
        this.sex = sex;
        this.department = department;
    }
    public Employee(){

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

    public Date getCreatdAt() {
        return creatdAt;
    }

    public void setCreatdAt(Date creatdAt) {
        this.creatdAt = creatdAt;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
