package br.com.alura.codechella.NoUserMVC.repository;

import br.com.alura.codechella.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
