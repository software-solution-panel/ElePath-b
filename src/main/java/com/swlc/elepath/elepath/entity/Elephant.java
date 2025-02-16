package com.swlc.elepath.elepath.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "elephant")
public class Elephant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eid;
    private Double latitude;
    private Double latitude;
    private String imagePath;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime lastUpdateTime;
}
