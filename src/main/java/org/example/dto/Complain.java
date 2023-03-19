package org.example.dto;

import javax.persistence.*;

@Entity
@Table(name = "complain")
public class Complain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @Column(name = "guest_id")
    private Guest guest_id;
    @Column(name = "status")
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
