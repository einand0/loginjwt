package com.einando.loginjwt.entities;

import com.einando.loginjwt.dtos.UserDTORequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "tb_users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String email;
    private String password;

    public User(UserDTORequest dto){
        this.id = UUID.randomUUID();
        this.name = dto.name();
        this.email = dto.email();
        this.password = dto.password();
    }
}
