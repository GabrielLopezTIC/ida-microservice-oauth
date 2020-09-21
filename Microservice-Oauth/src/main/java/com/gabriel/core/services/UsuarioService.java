package com.gabriel.core.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gabriel.core.beans.Usuario;
import com.gabriel.core.clientFeign.UsuarioClientFeing;


@Service
public class UsuarioService implements UserDetailsService{

	@Autowired
	private UsuarioClientFeing cliente;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    System.out.println("creando usuario con authorities");
		Optional<Usuario> usuario = cliente.findByEmail(username);
		
		if(usuario.isPresent()) {
		    System.out.println("El usuario encontrado es : "+usuario.get().getEmail());
		}else {
		    System.out.println("Usuario no encontrado");
		}
		
		List<GrantedAuthority> authorities = usuario.get().getRoles()
			.stream()
			.map(role -> new SimpleGrantedAuthority(role.getRol()))
			.collect(Collectors.toList());
		
		return new User(usuario.get().getEmail(),usuario.get().getPassword(),
				usuario.get().isEnabled(),true,true,true,authorities);
	}

}
