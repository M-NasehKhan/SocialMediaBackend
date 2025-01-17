package com.naseh.socialmediabackend.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;


    @Column(name = "name", length = 100)
    private String name;


    @Column(name = "email", length = 100)
    private String email;

    @NotNull
    @Column(name = "pwd", length = 60, nullable = false)
    private String pwd;

    @Column(name = "enabled", nullable = false)
    private Boolean isEnabled;

}
//    userId (Primary Key): Unique identifier for each user.
//        tenantId (Foreign Key): Refers to the associated tenant.
//        username: Display name of the user.
//        email: Email address of the user.
//        password: Encrypted password.
//        role: Role of the user (e.g., USER, MODERATOR, ADMIN).
//        createdAt: Date and time when the user was registered.