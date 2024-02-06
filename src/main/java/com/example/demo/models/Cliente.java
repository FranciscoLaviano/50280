package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import io.swagger.v3.oas.annotations.media.Schema;

@Getter
@Setter
@Entity


public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description="Id del usuario generado por la DB", requiredMode= Schema.RequiredMode.AUTO, example="1")

    private Long id;

    @Column

    private String nombre;


    @Column(name = "correo")

    private String email;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
