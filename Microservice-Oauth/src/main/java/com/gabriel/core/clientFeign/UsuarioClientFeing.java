package com.gabriel.core.clientFeign;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gabriel.core.beans.Usuario;




@FeignClient(name = "MS-Usuarios")
public interface UsuarioClientFeing {
	
    @GetMapping(path = "/users/find/usr/{email}") 
	public Optional<Usuario> findByEmail(@PathVariable String email);
}