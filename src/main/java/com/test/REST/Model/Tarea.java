package com.test.REST.Model;

import jakarta.persistence.*;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Data
@Table(name = "BDTASK")


public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @Column(name = "titulo")
    @JsonProperty("titulo") // Esto asegura que Jackson mapea correctamente el JSON
    private String titulo;

}
