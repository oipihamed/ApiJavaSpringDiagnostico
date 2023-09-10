package com.example.demo.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cEstado")
public class EstadoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long iIdEstado;
    private String sDescripcionEstado;
    @OneToOne(mappedBy = "oEstado",cascade = CascadeType.ALL)
    private TareaModel oTarea;
    
    public EstadoModel(String sDescripcionEstado) {
        this.sDescripcionEstado = sDescripcionEstado;
    }
    public Long getiIdEstado() {
        return iIdEstado;
    }
    public void setiIdEstado(Long iIdEstado) {
        this.iIdEstado = iIdEstado;
    }
    public String getsDescripcionEstado() {
        return sDescripcionEstado;
    }
    public void setsDescripcionEstado(String sDescripcionEstado) {
        this.sDescripcionEstado = sDescripcionEstado;
    }
    public TareaModel getoTarea() {
        return oTarea;
    }
    public void setoTarea(TareaModel oTarea) {
        this.oTarea = oTarea;
    }
    
}
