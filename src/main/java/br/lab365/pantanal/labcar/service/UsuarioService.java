package br.lab365.pantanal.labcar.service;

import br.lab365.pantanal.labcar.model.UsuarioModel;

public interface UsuarioService {

    UsuarioModel salvar(UsuarioModel usuario) throws Exception;

    Boolean existe(String email);

}
