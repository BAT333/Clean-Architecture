package br.com.alura.codechella.Domain.entities.usuario;

import br.com.alura.codechella.Domain.Address;
import br.com.alura.codechella.Domain.entities.usuario.infra.ValidationEmail;

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String cpf;
    private String name;
    private LocalDate birth;
    private String email;
    private Address address;

    public User(){}
    public User(String cpf,String name,LocalDate birth,String email) throws RuntimeException {
        if(cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}"))throw new RuntimeException("CPF IS NOT IN THE STANDARD ");
        if(email == null||!ValidationEmail.emailValidation(email))throw new RuntimeException("EMAIL ERROR");
        this.cpf = cpf;
        this.name = name;
        this.birth = birth;
        this.email = email;
    }
    public User(String cpf,String name,LocalDate birth,String email,Address address) throws RuntimeException {
        if(cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}"))throw new RuntimeException("CPF IS NOT IN THE STANDARD ");
        if(email == null||!ValidationEmail.emailValidation(email))throw new RuntimeException("EMAIL ERROR");
        this.cpf = cpf;
        this.name = name;
        this.birth = birth;
        this.email = email;
        this.address =address;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
         this.cpf =cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBirth(){
        return this.birth;
    }
    public void setBirth(LocalDate birth){
        this.birth = birth;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)return false;
        if(this == obj)return true;
        if(this.getClass() != obj.getClass())return false ;
        User user = (User) obj;
        return cpf != null && cpf.equals(user.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "User{" +
                "cpf='" + cpf + '\'' +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
