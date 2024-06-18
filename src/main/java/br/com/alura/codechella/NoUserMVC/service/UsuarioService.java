package br.com.alura.codechella.NoUserMVC.service;

import br.com.alura.codechella.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}
