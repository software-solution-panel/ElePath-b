package com.swlc.elepath.elepath.dto;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

public class ElephantDTO {
    private Long eid;
    private Double latitude;
    private Double longitude;
    private String imagePath;
    private LocalDateTime lastUpdateTime;

    public ElephantDTO() {
    }

    public ElephantDTO(Long eid, Double latitude, Double longitude, String imagePath, LocalDateTime lastUpdateTime) {
        this.eid = eid;
        this.latitude = latitude;
        this.longitude = longitude;
        this.imagePath = imagePath;
        this.lastUpdateTime = lastUpdateTime;
    }

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
