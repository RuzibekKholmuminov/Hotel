package org.example.dto;

import javax.persistence.*;

@Entity
@Table(name = "convenient")
public class Convenient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;

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

    @Override
    public String toString() {
        return "Convenient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
