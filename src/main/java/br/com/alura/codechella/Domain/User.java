package br.com.alura.codechella.Domain;

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String cpf;
    private String name;
    private LocalDate birth;
    private String email;

    public User(){}
    public User(String cpf,String name,LocalDate birth,String email){
        this.cpf = cpf;
        this.name = name;
        this.birth = birth;
        this.email = email;
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
}
