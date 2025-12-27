package com.leetcode.coding.questions;

import java.util.LinkedList;

public class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id=id;
        this.name=name;
    }

    private Employee manager;
    private LinkedList<Employee> subordinates = new LinkedList<>();

    public void setManager(Employee e){
        this.manager=e;
    }

    public Employee getManager() {
        return this.manager;
    }

    public void addSuboridnates (Employee e) {
        subordinates.add(e);
    }
}
