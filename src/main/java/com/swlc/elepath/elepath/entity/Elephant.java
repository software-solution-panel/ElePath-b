package com.swlc.elepath.elepath.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "elephant")
public class Elephant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eid;
    private Long location;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateTime;


}
