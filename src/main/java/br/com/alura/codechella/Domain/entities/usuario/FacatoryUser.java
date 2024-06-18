package br.com.alura.codechella.Domain.entities.usuario;

import br.com.alura.codechella.Domain.Address;

import java.time.LocalDate;

public class FacatoryUser {
    private User user;

    public User withNameCPFEmailBirth(String name, String cpf, String email, LocalDate birth){
        try {
            this.user = new User(cpf,name,birth,email);
            return user;
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public User includesAddress(String cep,Integer number,String complement){
         this.user.setAddress(new Address(cep,number,complement));
         return this.user;
    }

}
