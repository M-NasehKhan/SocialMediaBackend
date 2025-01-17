package com.naseh.socialmediabackend.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tenants")
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "enabled", nullable = false)
    private Boolean isEnabled;

}
