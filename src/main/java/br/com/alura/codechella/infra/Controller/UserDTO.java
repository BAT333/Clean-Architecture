package br.com.alura.codechella.infra.Controller;

import java.time.LocalDate;

public record UserDTO(
        String cpf,

        String name,

        LocalDate birth,

        String email
) {
}
