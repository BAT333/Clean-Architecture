package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.Domain.entities.usuario.User;
import br.com.alura.codechella.infra.persistence.UsuarioEntity;

public class UserEntityMapper {
    public UsuarioEntity toEntity(User user){
        return new UsuarioEntity(user.getName(),user.getEmail(),user.getCpf(),user.getBirth());
    }
    public User toDomain(UsuarioEntity entity){
        try {
            return new User(entity.getCpf(), entity.getNome(), entity.getNascimento(), entity.getEmail());
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
