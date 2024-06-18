package br.com.alura.codechella.Domain.entities.usuario;

import br.com.alura.codechella.Domain.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class UserTest {


    @Test
    @DisplayName("""
            YOU SHOULD NOT REGISTER USERS WITH THE WRONG CPF
            """)
    void scenario01(){
        Assertions.assertThrows(RuntimeException.class,()-> new User("32","rafael", LocalDate.now(),"legaltudo@gmail.com"));
        Assertions.assertThrows(RuntimeException.class,()-> new User(null,"rafael", LocalDate.now(),"legaltudo@gmail.com"));

    }
    @Test
    @DisplayName("""
            CPF is not giving an error
            """)
    void scenario02(){
        Assertions.assertDoesNotThrow(()-> new User("323.123.123-45","rafael", LocalDate.now(),"legaltudo@gmail.com"));

    }
    @Test
    @DisplayName("""
            YOU SHOULD NOT REGISTER USERS WITH THE WRONG EMAIL
            """)
    void scenario03(){
        Assertions.assertThrows(RuntimeException.class,()-> new User("323.123.123-45","rafael", LocalDate.now(),"raf"));
        Assertions.assertThrows(RuntimeException.class,()-> new User("323.123.123-45","rafael", LocalDate.now(),null));

    }
    @Test
    @DisplayName("""
            EMAIL is not giving an error
            """)
    void scenario04(){
        Assertions.assertDoesNotThrow(()-> new User("323.123.123-45","rafael", LocalDate.now(),"legaltudo@gmail.com"));

    }

    @Test
    @DisplayName("""
            ENTITY CREATION BY FACTORY IS GOING RIGHT
            """)
    void scenario05(){
        FacatoryUser facatoryUser = new FacatoryUser();
        User user = facatoryUser.withNameCPFEmailBirth("RAFAEL","948.464.465-56","rafael@gmail.com",LocalDate.now());
        var userExpec = new User("948.464.465-56","RAFAEL",LocalDate.now(),"rafael@gmail.com");
        Assertions.assertEquals(userExpec.getCpf(),user.getCpf());
        Assertions.assertEquals(userExpec.getName(),user.getName());
        Assertions.assertEquals(userExpec.getBirth(),user.getBirth());
        Assertions.assertEquals(userExpec.getEmail(),user.getEmail());
        facatoryUser.includesAddress("123",6,"complemente");

        userExpec.setAddress(new Address("123",6,"complemente"));

        Assertions.assertEquals(userExpec.getAddress().getCep(),user.getAddress().getCep());
        Assertions.assertEquals(userExpec.getAddress().getNumber(),user.getAddress().getNumber());
        Assertions.assertEquals(userExpec.getAddress().getComplement(),user.getAddress().getComplement());

    }

}