package org.example.dto;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "guests")
public class Guests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "phone", length = 13)
    private String phone;
    @Column(name = "passportNumber")
    private String pNumber;
    @Column(name = "pGivenDate")
    private LocalDate pGivenDate;
    @Column(name = "pExpiredDate")
    private LocalDate pExpiredDate;
    @Column(name = "pGivenBy")
    private String pGivenBy;

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    public LocalDate getpGivenDate() {
        return pGivenDate;
    }

    public void setpGivenDate(LocalDate pGivenDate) {
        this.pGivenDate = pGivenDate;
    }

    public LocalDate getpExpiredDate() {
        return pExpiredDate;
    }

    public void setpExpiredDate(LocalDate pExpiredDate) {
        this.pExpiredDate = pExpiredDate;
    }

    public String getpGivenBy() {
        return pGivenBy;
    }

    public void setpGivenBy(String pGivenBy) {
        this.pGivenBy = pGivenBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Guests{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", pNumber='" + pNumber + '\'' +
                ", pGivenDate=" + pGivenDate +
                ", pExpiredDate=" + pExpiredDate +
                ", pGivenBy='" + pGivenBy + '\'' +
                '}';
    }
}
