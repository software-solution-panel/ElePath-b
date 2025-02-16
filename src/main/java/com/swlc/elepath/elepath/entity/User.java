package com.swlc.elepath.elepath.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;
    @Column(unique = true)
    private String email;
    @Column
    private String mobile;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime creadt;

    public User() {
    }

    public User(Long uid, String email, String mobile, LocalDateTime creadt) {
        this.uid = uid;
        this.email = email;
        this.mobile = mobile;
        this.creadt = creadt;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public LocalDateTime getCreadt() {
        return creadt;
    }

    public void setCreadt(LocalDateTime creadt) {
        this.creadt = creadt;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", creadt=" + creadt +
                '}';
    }
}
