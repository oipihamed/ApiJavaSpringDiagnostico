package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tTarea")
public class TareaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long iIdTarea;
    private String sDescripcionTarea;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iIdEstado")
    private EstadoModel oEstado;
    

    public TareaModel(String sDescripcionTarea, EstadoModel iIdEstado) {
        this.sDescripcionTarea = sDescripcionTarea;
        this.oEstado = iIdEstado;
    }
    public Long getiIdTarea() {
        return iIdTarea;
    }
    public void setiIdTarea(Long iIdTarea) {
        this.iIdTarea = iIdTarea;
    }
    public String getsDescripcionTarea() {
        return sDescripcionTarea;
    }
    public void setsDescripcionTarea(String sDescripcionTarea) {
        this.sDescripcionTarea = sDescripcionTarea;
    }
    public EstadoModel getoEstado() {
        return oEstado;
    }
    public void setoEstado(EstadoModel iIdEstado) {
        this.oEstado = iIdEstado;
    }
    
}
