package com.test.REST.Controller;


import com.test.REST.Model.Tarea;
import com.test.REST.Service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarea")

public class TareaController {


    private final TareaService tareaService;

    // Constructor para la inyección de dependencias
    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    // Obtener todas las Tareas
    @GetMapping
    public List<Tarea> obtenerTarea(){
        return tareaService.obtenerTareas();
    }

    // Obtener Tarea por ID
    @GetMapping("/{id}")
    public Optional<Tarea> obtenerTareaPorId(@PathVariable Long id) {
        return tareaService.obtenerTareaPorId(id);
    }

    // Crear una Tarea
    @PostMapping
    public Tarea crearTarea(@RequestBody Tarea tarea) {
        return tareaService.crearTarea(tarea);
    }

    // Actualizar un mensaje existente
    @PutMapping("/{id}")
    public Tarea actualizarTarea(@PathVariable Long id, @RequestBody Tarea tarea) {
        return tareaService.actualizarTarea(id, tarea);
    }

    // Eliminar un mensaje por ID
    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable Long id) {
        tareaService.eliminarTarea(id);
    }
}
