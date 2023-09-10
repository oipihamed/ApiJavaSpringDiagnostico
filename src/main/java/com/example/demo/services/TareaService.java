package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.TareaModel;
import com.example.demo.repositories.TareaRepositoy;

@Service
public class TareaService {
    @Autowired
    TareaRepositoy tareaRepositoy;
    public ArrayList<TareaModel> obtenerTareas() {
        return (ArrayList<TareaModel>) tareaRepositoy.findAll();
    }
        public TareaModel guardarTarea(TareaModel usuario) {
        return tareaRepositoy.save(usuario);
    }

    public Optional<TareaModel> obtenerPorId(Long id) {
        return tareaRepositoy.findById(id);
    }

    public ArrayList<TareaModel> obtenerPorEstado(Long iIdEstado) {
        return tareaRepositoy.findByoEstado_iIdEstado(iIdEstado);
    }

    public boolean eliminarTarea(Long id) {
        try {
            tareaRepositoy.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public TareaModel actualizarTarea(TareaModel tarea){
        return tareaRepositoy.save(tarea);
    }


}
