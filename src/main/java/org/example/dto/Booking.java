package org.example.dto;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @Column(name = "guest_id")
    private Guest guest_id;
    @ManyToOne
    @Column(name = "room_id")
    private Room room_id;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "date_count")
    private String date_count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Guest getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(Guest guest_id) {
        this.guest_id = guest_id;
    }

    public Room getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Room room_id) {
        this.room_id = room_id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDate_count() {
        return date_count;
    }

    public void setDate_count(String date_count) {
        this.date_count = date_count;
    }
}
