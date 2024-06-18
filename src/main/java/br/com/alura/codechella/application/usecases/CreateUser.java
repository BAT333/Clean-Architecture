package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.Domain.entities.usuario.User;
import br.com.alura.codechella.application.gateways.RepositoryUser;

public class CreateUser {
    private final RepositoryUser repositoryUser;

    public CreateUser(RepositoryUser repositoryUser) {
        this.repositoryUser = repositoryUser;
    }

    public User registerUser(User user){
        return repositoryUser.registerUser(user);
    }
}
