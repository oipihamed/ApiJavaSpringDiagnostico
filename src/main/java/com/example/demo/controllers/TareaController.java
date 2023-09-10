package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.EstadoModel;
import com.example.demo.models.TareaModel;
import com.example.demo.services.TareaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/tarea")
public class TareaController {
    @Autowired
    TareaService tareaService;

    @GetMapping
    public ArrayList<TareaModel> obtenerTareas() {
        return tareaService.obtenerTareas();
    }

    @PostMapping()
    public TareaModel guardaTarea(@RequestBody TareaModel oTarea) {
        return tareaService.guardarTarea(oTarea);
    }

    @GetMapping(path = "/{id}")
    public Optional<TareaModel> obtenerTareaPorId(@PathVariable("id") Long id) {
        return tareaService.obtenerPorId(id);
    }

    @GetMapping(path = "/busca")
    public ArrayList<TareaModel> obtenerPorEstado(@RequestParam("estado") Long id) {
        return tareaService.obtenerPorEstado(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarTarea(@PathVariable("id") Long id) {
        boolean ok = tareaService.eliminarTarea(id);
        if (ok) {
            return "Se ha eliminado el usuario con id" + id;
        } else {
            return "No pudo eliminar el usuario con id" + id;
        }

    }
    @PutMapping(value="/{id}")
    public TareaModel actualizarTarea(@PathVariable Long id, @RequestBody TareaModel oTarea) {
        oTarea.setiIdTarea(id);
        return tareaService.actualizarTarea(oTarea);
    }

}
