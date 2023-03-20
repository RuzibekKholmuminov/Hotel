package org.example.service;

import org.example.dto.Convenient;
import org.example.dto.Employee;
import org.example.dto.EmployeeType;
import org.example.dto.Room;
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
}
