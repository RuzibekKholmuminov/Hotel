package org.example.dto;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "guestPassport")
public class GuestPassport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @Column(name = "guest_id")
    private Guest guest_id;
    @Column(name = "number")
    private String number;
    @Column(name = "startDate")
    private LocalDate startDate;
    @Column(name = "validity_period")
    private String validity_period;
    @Column(name = "submitter_name")
    private String submitter_name;
    @Column(name = "place")
    private String place;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getValidity_period() {
        return validity_period;
    }

    public void setValidity_period(String validity_period) {
        this.validity_period = validity_period;
    }

    public String getSubmitter_name() {
        return submitter_name;
    }

    public void setSubmitter_name(String submitter_name) {
        this.submitter_name = submitter_name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
