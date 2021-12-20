package day38Overriding;

import java.util.Scanner;

import static day38Overriding.Employee.*;

import static java.lang.Math.*;


public class EmployeeTest {
    Employee employee = new Employee();
    public static void main(String[] args) {
        Employee em = new Employee();
        FullTimeEmployee ft = new FullTimeEmployee();
//        Contractor ct = new Contractor();
//
//        System.out.println(em.calculateDailyPay(16));
//        System.out.println(ft.calculateDailyPay(16));
//        System.out.println(ct.calculateDailyPay(16));
//
//        System.out.println(ft.isEnough);

        ft.setSuperStaticVariable(true);
        Scanner scanner = new Scanner(System.in);
        System.out.println(abs(4 - 6));
        System.out.println(abs(1 - 60));
        System.out.println(PI);

        ft.calculateDailyPay(4);
        xct(); // Employee has been imported via static way so that we can call static method directly with its name
        Employee.xct();

    }

    Employee employee2 = new Employee();
}
