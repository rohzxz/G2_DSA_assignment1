
// Main.java (Driver class)
package main;

import department.AdminDepartment;
import department.HrDepartment;
import department.TechDepartment;

public class Main {
    public static void main(String[] args) {
        AdminDepartment adminDept = new AdminDepartment();
        HrDepartment hrDept = new HrDepartment();
        TechDepartment techDept = new TechDepartment();

        // Display functionalities
        System.out.println("Welcome to " + adminDept.departmentName());
        System.out.println(adminDept.getTodaysWork());
        System.out.println(adminDept.getWorkDeadline());
        System.out.println(adminDept.isTodayAHoliday());

        System.out.println("Welcome to " + hrDept.departmentName());
        System.out.println(hrDept.doActivity("team Lunch"));
        System.out.println(hrDept.getTodaysWork());
        System.out.println(hrDept.getWorkDeadline());
        System.out.println(hrDept.isTodayAHoliday());

        System.out.println("Welcome to " + techDept.departmentName());
        System.out.println(techDept.getTodaysWork());
        System.out.println(techDept.getWorkDeadline());
        System.out.println(techDept.getTechStackInformation());
        System.out.println(techDept.isTodayAHoliday());
    }
}
