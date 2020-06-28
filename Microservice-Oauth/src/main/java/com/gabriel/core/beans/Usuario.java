package com.gabriel.core.beans;

import java.time.LocalDateTime;
import java.util.List;


public class Usuario{
	
	private String id;
	private String email;
	private String password;
	private LocalDateTime fechaCreado;
	private boolean enabled;
	private List<Rol> roles;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Rol> getRoles() {
		return roles;
	}
	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
	public LocalDateTime getFechaCreado() {
		return fechaCreado;
	}
	public void setFechaCreado(LocalDateTime fechaCreado) {
		this.fechaCreado = fechaCreado;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
