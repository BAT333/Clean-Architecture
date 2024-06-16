package br.com.alura.codechella.NotUse.service;

import br.com.alura.codechella.NotUse.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}
