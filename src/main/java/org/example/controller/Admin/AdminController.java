package org.example.controller.Admin;

import org.example.dto.*;
import org.example.service.AdminService;
import org.example.util.ScannerUtil;

import java.time.LocalDateTime;
import java.util.Scanner;

public class AdminController {
    private final AdminService adminService = new AdminService();
    public void start() {
        boolean game = true;
        while (game) {
            menu();
            int action = ScannerUtil.getAction();
            switch (action) {
                case 1 -> room();
                case 2 -> convenient();
                case 3 -> employee();
                case 4 -> guest();
                case 0 -> game = false;
                default -> System.out.println("Mazgi nima bu");
            }
        }
    }

    private void guest() {
        boolean game = true;
        while (game) {
            guestMenu();
            int action = ScannerUtil.getAction();
            switch (action) {
                case 1 -> addGuest();
                case 2 -> guestList();
                case 0 -> game = false;
                default -> System.out.println("Mazgi nima bu");
            }
        }
    }

    private void guestList() {
        adminService.guestList();
    }

    private void addGuest() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter Surname: ");
        String surname = scanner.next();
        System.out.print("Enter Phone: ");
        String phone = scanner.next();
        System.out.print("Enter Passport Number: ");
        String pNumber = scanner.next();
        System.out.print("Enter Passport given date: ");
        LocalDateTime pGivenDate = LocalDateTime.parse(scanner.next());
        System.out.print("Enter Passport expired date: ");
        LocalDateTime pExpiredDate = LocalDateTime.parse(scanner.next());
        System.out.print("Enter Passport given by: ");
        String givenBy = scanner.next();

        Guests guests = new Guests();
        guests.setName(name);
        guests.setSurname(surname);
        guests.setPhone(phone);
        guests.setpNumber(pNumber);
        guests.setpGivenDate(pGivenDate);
        guests.setpExpiredDate(pExpiredDate);
        guests.setpGivenBy(givenBy);

        adminService.addGuest(guests);
    }

    private void guestMenu() {
        System.out.println("""
                        ** GUEST MENU **
                1.Add Guest
                2.List
                """);
    }

    private void employee() {
        boolean game = true;
        while (game) {
            convenientMenu();
            int action = ScannerUtil.getAction();
            switch (action) {
                case 1 -> addEmployee();
                case 2 -> employeeList();
                case 3 -> deleteEmployee();
                case 0 -> game = false;
                default -> System.out.println("Mazgi nima bu");
            }
        }
    }

    private void deleteEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Id: ");
        Integer id = scanner.nextInt();
        adminService.deleteEmployee(id);
    }

    private void employeeList() {
        adminService.employeeList();
    }

    private void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter Surname: ");
        String surname = scanner.next();
        System.out.print("Enter Phone: ");
        String phone = scanner.next();
        System.out.print("Enter password: ");
        String psw = scanner.next();
        System.out.print("Enter Status: ");
        String status = scanner.next();
        System.out.print("Enter type: ");
        String type = scanner.next();

        Employee employee = new Employee();
        employee.setName(name);
        employee.setSurname(surname);
        employee.setPhone(phone);
        employee.setPsw(psw);
        employee.setDate(LocalDateTime.now());
        employee.setStatus(status);
        employee.setType(type);

        EmployeeType employeeType = new EmployeeType();
        employeeType.setType(type);

        adminService.addEmployee(employee);
        adminService.addEmployeeType(employeeType);
    }

    private void convenient() {
        boolean game = true;
        while (game) {
            convenientMenu();
            int action = ScannerUtil.getAction();
            switch (action) {
                case 1 -> addConvenient();
                case 2 -> convenientList();
                case 3 -> deleteConvenient();
                case 0 -> game = false;
                default -> System.out.println("Mazgi nima bu");
            }
        }
    }

    private void deleteConvenient() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Id: ");
        Integer id = scanner.nextInt();
        adminService.deleteConvenient(id);
    }

    private void convenientList() {
        adminService.convenientList();
    }

    private void addConvenient() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.next();
        Convenient convenient = new Convenient();
        convenient.setName(name);
        adminService.AddConvenient(convenient);
    }

    private void convenientMenu() {
        System.out.println("""
                        ** CONVENIENT MENU **
                1.Add
                2.List
                3.Delete
                """);
    }

    private void room() {
        boolean game = true;
        while (game) {
            roomMenu();
            int action = ScannerUtil.getAction();
            switch (action) {
                case 1 -> addRoom();
                case 2 -> roomList();
                case 3 -> deleteRoom();
                case 4 -> updateRoom();
                case 5 -> findRoom();
                case 0 -> game = false;
                default -> System.out.println("Mazgi nima bu");
            }
        }
    }

    private void findRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id: ");
        Integer id = scanner.nextInt();
        adminService.find(id);
    }

    private void updateRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        Integer number = scanner.nextInt();
        System.out.print("Enter floor: ");
        Integer floor = scanner.nextInt();
        System.out.print("Enter type: ");
        String type = scanner.next();
        System.out.print("Enter price: ");
        Integer price = scanner.nextInt();
        System.out.print("Enter area: ");
        Integer area = scanner.nextInt();

        Room room = new Room();
        room.setRoomNumber(number);
        room.setFloor(floor);
        room.setRoomType(type);
        room.setPrice(price);
        room.setArea(area);

        adminService.updateRoom(room);
    }

    private void deleteRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Id: ");
        Integer id = scanner.nextInt();
        adminService.deleteRoom(id);
    }

    private void roomList() {
        adminService.roomList();
    }

    private void addRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        Integer number = scanner.nextInt();
        System.out.print("Enter floor: ");
        Integer floor = scanner.nextInt();
        System.out.print("Enter type: ");
        String type = scanner.next();
        System.out.print("Enter price: ");
        Integer price = scanner.nextInt();
        System.out.print("Enter area: ");
        Integer area = scanner.nextInt();

        Room room = new Room();
        room.setRoomNumber(number);
        room.setFloor(floor);
        room.setRoomType(type);
        room.setPrice(price);
        room.setArea(area);

        adminService.addRoom(room);
    }

    private void roomMenu() {
        System.out.println("""
                        ** ROOM MENU **
                1.Add
                2.List
                3.Delete
                4.Update
                5.Find
                6.Room convenient
                """);
    }

    private void menu() {
        System.out.println("""
                        ** ADMIN MENU **
                1.Room
                2.Convenient
                3.Employee
                4.Guest
                5.Booking
                6.OutCome
                7.Tozalangan
                8.Arznomalar
                """);
    }
}
