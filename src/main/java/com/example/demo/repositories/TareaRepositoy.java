package com.example.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.TareaModel;
@Repository
public interface TareaRepositoy extends CrudRepository<TareaModel,Long>{
        ArrayList<TareaModel> findByoEstado_iIdEstado(Long iIdEstado);
} 