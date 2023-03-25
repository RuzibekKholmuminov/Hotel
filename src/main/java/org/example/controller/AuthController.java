package org.example.controller;

import org.example.dto.Complain;
import org.example.dto.Employee;
import org.example.dto.Guests;
import org.example.service.AdminService;
import org.example.service.EmployeeService;
import org.example.util.ScannerUtil;

import java.time.LocalDateTime;
import java.util.Scanner;

public class AuthController {

    public void start() {

        boolean game = true;
        while (game) {

            menu();
            int action = ScannerUtil.getAction();

            switch (action) {
                case 1 -> login();
                case 2 -> complain();
                case 0 -> game = false;
                default -> System.out.println("Mazgi nima bu");
            }
        }


    }

    private void complain() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter complain: ");
        String complain = scanner.next();
        System.out.print("Enter yourId: ");
        Integer id = scanner.nextInt();

        Guests guests = new Guests();
        guests.setId(id);

        Complain complain1 = new Complain();
        complain1.setStatus(complain);
        complain1.setGuest_id(guests);
        AdminService adminService = new AdminService();
        adminService.addComplain(complain1);
    }


    private void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone: ");
        String phone = scanner.next();

        System.out.print("Enter password: ");
        String password = scanner.next();

        EmployeeService employeeService=new EmployeeService();
        employeeService.login(phone,password);

    }




    private void menu() {
        System.out.println("*****  MENU  *****");

        System.out.println("1.Login");
        System.out.println("2.Complain");
        System.out.println("0.Exit");
    }

}
