package com.bridgelabz.payrolljdbc;

import java.sql.Date;

public class Employee {
    public int Id;
    public String Name;
    public float basicPay;
    public String Start_Date;

    public Employee(int id, String Name, float basicPay) {
        this.Id = id;
        this.Name = Name;
        this.basicPay = basicPay;

    }

    public Employee() {

    }

    public String getStart_Date() {
        return Start_Date;
    }
    public void setStart_Date(String start_Date) {
        this.Start_Date = start_Date;
    }
    public float getBasicPay() {
        return basicPay;
    }
    public void setBasicPay(float basicPay) {
        this.basicPay = basicPay;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        this.Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    @Override
    public String toString() {
        return "Employee [Id=" + Id + ", Name=" + Name + ", basicPay=" + basicPay + ", Start_Date=" + Start_Date + "]";
    }



}