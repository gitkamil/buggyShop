package edu.kamil.buggyShop.persistance.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "CLIENT", schema = "buggyshop")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLIENT_ID")
    private int id;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STREET")
    private String street;

    @Column(name = "HOUSE_NUMBER")
    private String houseNumber;

    @Column(name = "TELEPHON_NUMBER")
    private String telephonNumber;


}
