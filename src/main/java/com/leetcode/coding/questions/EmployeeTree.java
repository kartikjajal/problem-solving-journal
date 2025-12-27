package com.leetcode.coding.questions;

import java.util.*;

public class EmployeeTree {
    public static void main (String args[] ) {
        Map<Integer,Employee> allEmployees = new HashMap<>();

        Employee a = new Employee(1,"A");
        Employee b = new Employee(2, "B");
        b.setManager(a);

        Employee c = new Employee(3,"C");
        c.setManager(a);

        Employee d = new Employee(4, "D");
        d.setManager(c);

        Employee e = new Employee(5, "E");
        e.setManager(b);

        a.addSuboridnates(b);
        a.addSuboridnates(c);

        c.addSuboridnates(d);
        b.addSuboridnates(e);

        allEmployees.put(1,a);
        allEmployees.put(2,b);
        allEmployees.put(3,c);
        allEmployees.put(4, d);
        allEmployees.put(5, e);

        int begin =2;
        int end = 4;

        EmployeeTree employeeTree = new EmployeeTree();
        ArrayList<Integer> tofill = new ArrayList<>();
        employeeTree.getManagerId(allEmployees.get(4), tofill, 2);

        System.out.println(tofill);

    }

    public void getManagerId(Employee e, List<Integer> tofill, int id) {
        if(e.getManager()!=null) {
            tofill.add(e.getManager().id);
            if(e.getManager().id!=id) {
                getManagerId(e.getManager(), tofill, id);
            }
        }
    }
}
