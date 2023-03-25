package org.example.dto;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "guest_id")
    private Guests guest_1_id;
    @ManyToOne
    @JoinColumn(name = "room_id")
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

    public Guests getGuest_id() {
        return guest_1_id;
    }

    public void setGuest_id(Guests guest_1_id) {
        this.guest_1_id = guest_1_id;
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

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", guest_1_id=" + guest_1_id +
                ", room_id=" + room_id +
                ", date=" + date +
                ", date_count='" + date_count + '\'' +
                '}';
    }
}
