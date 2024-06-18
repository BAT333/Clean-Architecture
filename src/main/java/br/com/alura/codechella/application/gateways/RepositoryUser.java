package br.com.alura.codechella.application.gateways;

import br.com.alura.codechella.Domain.entities.usuario.User;

import java.util.List;

public interface RepositoryUser {
    User registerUser(User user);
    List<User> findAll();
}
