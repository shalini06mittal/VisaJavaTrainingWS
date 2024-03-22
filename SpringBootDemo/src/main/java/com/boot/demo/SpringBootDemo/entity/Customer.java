package com.boot.demo.SpringBootDemo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 * Create class Blogger , 1 blogger can write many blogs
 * Create class Blogs
 */
@Entity // used to tell hinernate that this class is a database managed entity
@Getter
@Setter
@ToString
@Table(name = "cust")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    @Column(name = "cname", length = 100, nullable = false)
    private String custname;
    @Column(unique = true)
    private String email;

//    @ElementCollection
//    @JoinTable(name = "notifications", joinColumns = @JoinColumn(name = "cid"))
//    @Column(name = "notify")
//    private List<String> notifications;

    // bi-directional mapping
    // mappedby=> tells hibernate not to add aid as foreign key in customer table since the foreign key is already mapped in the address table
   // @OneToOne(mappedBy = "customer")
    //@JoinColumn(name = "aid")
    @OneToMany(mappedBy = "customer")
    private List<Address> address;
}
