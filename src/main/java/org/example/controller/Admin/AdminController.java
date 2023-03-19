package org.example.controller.Admin;

import org.example.dto.Room;
import org.example.service.AdminService;
import org.example.util.ScannerUtil;

import java.util.Scanner;

public class AdminController {
    private AdminService adminService = new AdminService();
    public void start() {
        boolean game = true;
        while (game) {
            menu();
            int action = ScannerUtil.getAction();
            switch (action) {
                case 1 -> room();
                case 0 -> game = false;
                default -> System.out.println("Mazgi nima bu");
            }
        }
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
                3.Employee Type
                4.Employee
                5.Guest
                6.Booking
                7.OutCome
                8.Tozalangan
                9.Arznomalar
                """);
    }
}
