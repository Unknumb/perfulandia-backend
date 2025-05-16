package com.perfulandia.usuarioservice.controller;
import com.perfulandia.usuarioservice.model.Usuario;
import com.perfulandia.usuarioservice.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//hola

@RestController
@RequestMapping("/api/usuarios")

public class UsuarioController {

    private final UsuarioService service;
    //constructor
    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    //Listar
    @GetMapping
    public List<Usuario> listar(){
        return service.listar();
    }

    //Post
    @PostMapping
    public Usuario guardar(@RequestBody Usuario usuario){
        return service.guardar(usuario);
    }

    //Id
    @GetMapping("/{id}")
    public Usuario buscar(@PathVariable Long id){
        return service.buscar(id);
    }

    //Delete
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        service.eliminar(id);
    }

}
