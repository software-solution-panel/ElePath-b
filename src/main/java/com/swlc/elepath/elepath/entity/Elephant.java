package com.swlc.elepath.elepath.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "elephant")
public class Elephant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eid;


}
