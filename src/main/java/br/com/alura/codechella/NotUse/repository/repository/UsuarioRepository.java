package br.com.alura.codechella.NotUse.repository.repository;

import br.com.alura.codechella.NotUse.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
