package com.bridgelabz.payrolljdbc;

public class Employee {
    public int Id;
    public String Name;
    public float basicPay;

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
        return "Employee [Id=" + Id + ", Name=" + Name + ",  basicPay=" + basicPay + "]";
    }
}