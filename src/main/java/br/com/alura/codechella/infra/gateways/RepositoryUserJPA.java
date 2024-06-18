package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.Domain.entities.usuario.User;
import br.com.alura.codechella.application.gateways.RepositoryUser;
import br.com.alura.codechella.infra.persistence.UserRepository;
import br.com.alura.codechella.infra.persistence.UsuarioEntity;

import java.util.List;
import java.util.stream.Collectors;

public class RepositoryUserJPA implements RepositoryUser {
    private final UserRepository repository;
    private final UserEntityMapper entityMapper;

    public RepositoryUserJPA(UserRepository repository, UserEntityMapper entityMapper) {
        this.repository = repository;
        this.entityMapper = entityMapper;
    }

    @Override
    public User registerUser(User user) {
        UsuarioEntity entity = entityMapper.toEntity(user);
        var usersave = repository.save(entity);
        return entityMapper.toDomain(usersave);

    }

    @Override
    public List<User> findAll() {
        return repository.findAll().stream().map(entityMapper::toDomain).collect(Collectors.toList());
    }
}
