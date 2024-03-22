package com.boot.demo.SpringBootDemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aid;
    private String city;

    // uni-directional mapping
    //@OneToOne
   // @JoinColumn(name = "cid")
    @ManyToOne
    private Customer customer;
}
