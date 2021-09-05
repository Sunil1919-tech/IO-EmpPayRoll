package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * purpose-to create Employee PayRoll Service Project
 * Using IO file stream
 * @author Sunil
 * @version 16.0
 * @since 04/09/2021
 */

public class EmpPayRollService {
    private List<EmpRollData> empPayRollList;
    public EmpPayRollService(List<EmpRollData> empPayRollList) {
        this.empPayRollList = empPayRollList;
    }
    /*
    Declaring Main Method Here
    And Calling The Methods
     */
    public static void main(String[] args){
        ArrayList<EmpRollData> empPayRollList = new ArrayList<>();
        EmpPayRollService empPayRollServices = new EmpPayRollService(empPayRollList);
        Scanner consoleInputReader = new Scanner(System.in);
        empPayRollServices.readEmpPayRollData(consoleInputReader);
        empPayRollServices.writeEmpPayRollData();
        System.out.println("Welcome to Java IO EmpPay Roll Programming");
    }
    /*
    Declaring the Write Employee Roll Data Method
    Printing The Details Of Employee
     */
    private void writeEmpPayRollData() {
        System.out.println("Writing Employee Data To Console :" +empPayRollList);
    }
    /*
    Declaring Read Emp PayRoll Data Method
    Reading The Details From The Scanner
    Adding The Details To List
     */
    private void readEmpPayRollData( Scanner consoleInputReader) {
        System.out.println("Enter Employee Id :");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name :");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary :");
        double salary = consoleInputReader.nextDouble();
        empPayRollList.add(new EmpRollData(id,name,salary));
    }
}
