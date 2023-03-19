package org.example.service;

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
}
