package com.bridgelabz.payrolljdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeePayroll
{

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Name");
        EmployeeDetails details = new EmployeeDetails();
        details.setName(s.next());

        EmployeeRepo repo = new EmployeeRepo();
        repo.insertRecord(details);
    }
}