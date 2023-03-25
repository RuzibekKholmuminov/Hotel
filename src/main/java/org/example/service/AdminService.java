package org.example.service;

import org.example.dto.*;
import org.example.repository.RoomRepository;

import java.util.List;

public class AdminService {
    private RoomRepository repository = new RoomRepository();

    public void addRoom(Room room) {
        repository.addRoom(room);
    }

    public void roomList() {
        List<Room> roomLists = repository.roomList();
        System.out.println("                        ** ROOM LIST **");
        for (Room room : roomLists) {
            System.out.println(room);
        }
    }

    public void deleteRoom(Integer id) {
        int i = repository.deleteRoom(id);
        if (i == 1){
            System.out.print("DELETED SUCCESSFULLY");
        }
    }

    public void updateRoom(Room room) {
        int i = repository.updateRoom(room);
        if (i == 1){
            System.out.print("UPDATE SUCCESSFULLY");
        }
    }

    public void find(Integer id) {
        Room room = repository.find(id);
        if (room != null){
            System.out.println(room);
        }
    }

    public void AddConvenient(Convenient convenient) {
        int i = repository.addConvenient(convenient);
        if (i == 1){
            System.out.print("CONVENIENT ADDED");
        }
    }

    public void convenientList() {
        List<Convenient> convenient = repository.convenientList();
        System.out.print("       ** CONVENIENT LIST **");
        for (Convenient convenient1 : convenient) {
            System.out.println(convenient1);
        }
    }

    public void deleteConvenient(Integer id) {
        int i = repository.deleteConvenient(id);
        if(i == 1){
            System.out.print("DELETE SUCCESSFULLY");
        }
    }

    public void addEmployee(Employee employee) {
        int i = repository.addEmployee(employee);
        if(i == 1){
            System.out.print("ADDED SUCCESSFULLY");
        }
    }

    public void employeeList() {
        List<Employee> employeeList = repository.employeeList();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public void deleteEmployee(Integer id) {
        repository.deleteEmployee(id);
    }

    public void addEmployeeType(EmployeeType employeeType) {
        repository.addEmployeeType(employeeType);
    }

    public void addGuest(Guests guests) {
        repository.addGuest(guests);
        System.out.println("ADDED SUCCESSFULLY");
    }

    public void guestList() {
        List<Guests> guests = repository.guestList();
        for (Guests guests1 : guests) {
            System.out.println(guests1);
        }
    }

    public void addBooking(Booking booking) {
        repository.addBooking(booking);
        System.out.println("ADDED SUCCESSFULLY");
    }

    public void bookingList() {
        List<Booking> bookingList = repository.bookingList();
        for (Booking booking : bookingList) {
            System.out.println(booking);
        }
    }

    public void listByRoomId(Integer roomId) {
        List<Booking> bookingList = repository.listByRoomId(roomId);
        for (Booking booking : bookingList) {
            System.out.println(booking);
        }
    }

    public void listByGuestId(Integer guestId) {
        List<Booking> bookingList = repository.listByGuestId(guestId);
        for (Booking booking : bookingList) {
            System.out.println(booking);
        }
    }

    public void addComplain(Complain complain) {
        repository.addComplain(complain);
        System.out.println("ADDED SUCCESSFULLY");
    }

    public void addTozalangan(ClearedRoom clearedRoom) {
        repository.addTozalangan(clearedRoom);
        System.out.println("ADDED SUCCESSFULLY");
    }
}
