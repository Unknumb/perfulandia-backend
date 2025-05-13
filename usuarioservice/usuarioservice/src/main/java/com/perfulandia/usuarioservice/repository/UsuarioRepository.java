package com.perfulandia.usuarioservice.repository;

import com.perfulandia.usuarioservice.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
//Importe sus metodods para trabajar con un CRUD
//findALL()bo listar
//findById(id)
//save()
//delete()
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
