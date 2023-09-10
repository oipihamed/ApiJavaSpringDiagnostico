package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="tUsuario")
public class UsuarioModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long iId;
    private String sNombre;
    private String sEmail;
    private Integer iPrioridad;
    
    public Long getiId() {
        return iId;
    }
    public void setiId(Long iId) {
        this.iId = iId;
    }
    public String getsNombre() {
        return sNombre;
    }
    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }
    public String getsEmail() {
        return sEmail;
    }
    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }
    public Integer getiPrioridad() {
        return iPrioridad;
    }
    public void setiPrioridad(Integer iPrioridad) {
        this.iPrioridad = iPrioridad;
    }
    
}
