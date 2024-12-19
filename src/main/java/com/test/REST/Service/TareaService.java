package com.test.REST.Service;

import com.test.REST.Model.Tarea;
import com.test.REST.Repository.TareaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class TareaService {

    private final TareaRepository tareaRepository;

    // Constructor para la inyección de dependencias
    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    // Obtener todas las Tarea
    public List<Tarea> obtenerTareas() {
        return tareaRepository.findAll();
    }

    // Obtener una Tarea por ID
    public Optional<Tarea> obtenerTareaPorId(Long id) {
        return tareaRepository.findById(id);
    }

    // Crear una nueva Tarea
    public Tarea crearTarea(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    // Actualizar una Tarea existente
    public Tarea actualizarTarea(Long id, Tarea tarea) {
        if (tareaRepository.existsById(id)) {
            return tareaRepository.save(tarea);
        }
        return null; // o lanzar una excepción si no se encuentra el mensaje
    }


    // Eliminar una Tarea por ID
    public void eliminarTarea(Long id) {
        tareaRepository.deleteById(id);
    }
}
