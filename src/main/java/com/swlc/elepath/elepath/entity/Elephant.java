package com.swlc.elepath.elepath.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Table(name = "elephant")
public class Elephant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eid;
    private Double latitude;
    private Double longitude;
    private String imagePath;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime lastUpdateTime;

    public Elephant(Long eid, Double latitude, Double longitude, String imagePath, LocalDateTime lastUpdateTime) {
        this.eid = eid;
        this.latitude = latitude;
        this.longitude = longitude;
        this.imagePath = imagePath;
        this.lastUpdateTime = lastUpdateTime;
    }

    public Elephant() {
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Long getEid() {
        return eid;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String getImagePath() {
        return imagePath;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

}
