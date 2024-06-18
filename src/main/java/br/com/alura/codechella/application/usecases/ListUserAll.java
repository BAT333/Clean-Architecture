package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.Domain.entities.usuario.User;
import br.com.alura.codechella.application.gateways.RepositoryUser;

import java.util.List;

public class ListUserAll {
    private final RepositoryUser repositoryUser;

    public ListUserAll(RepositoryUser repositoryUser) {
        this.repositoryUser = repositoryUser;
    }


    public List<User> listALL() {

        return repositoryUser.findAll();
    }


}
