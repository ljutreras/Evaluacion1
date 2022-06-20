package com.examen1.models;

import javax.persistence.*;

@Entity
@Table(name="pizarrones")

public class Pizarron {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String dimension;
    private String color;

    //Constructor Vacio
    public Pizarron() {
    }

    //Constructor Parametros
    public Pizarron(String marca, String dimension, String color) {
        this.marca = marca;
        this.dimension = dimension;
        this.color = color;
    }

    //Getter & Setter


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
