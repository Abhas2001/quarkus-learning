package com.abhas;

public class Employee {
   public int id;
   public String name;
   public String role;
   public int salary;
   public boolean isPermanent;

    public Employee(int ids,String names,String roles,int salaries,boolean isPermanents){
        this.id = ids;
        this.name=names;
        this.role=roles;
        this.salary=salaries;
        this.isPermanent=isPermanents;

    }
}