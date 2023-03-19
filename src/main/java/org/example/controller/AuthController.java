package org.example.controller;

import org.example.dto.Employee;
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
