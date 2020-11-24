package com.formacionbdi.springboot.app.oauth.services;

import com.formacionbdi.springboot.app.usuarios.models.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}
