package org.example.dto;

import javax.persistence.*;

@Entity
@Table(name = "complain")
public class Complain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "guest_id")
    private Guests guest_1_id;
    @Column(name = "status")
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Complain{" +
                "id=" + id +
                ", guest_1_id=" + guest_1_id +
                ", status='" + status + '\'' +
                '}';
    }
}
