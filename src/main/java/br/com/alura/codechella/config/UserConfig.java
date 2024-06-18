package br.com.alura.codechella.config;

import br.com.alura.codechella.application.gateways.RepositoryUser;
import br.com.alura.codechella.application.usecases.CreateUser;
import br.com.alura.codechella.application.usecases.ListUserAll;
import br.com.alura.codechella.infra.gateways.RepositoryUserJPA;
import br.com.alura.codechella.infra.gateways.UserEntityMapper;
import br.com.alura.codechella.infra.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
   public CreateUser createUser(RepositoryUser repositoryUser){
        return new CreateUser(repositoryUser);
    }

    @Bean
    public RepositoryUserJPA userJPA(UserRepository repository, UserEntityMapper entityMapper){
        return new RepositoryUserJPA(repository,entityMapper);
    }
    @Bean
    public UserEntityMapper mapper(){
        return new UserEntityMapper();
    }
    @Bean
    public ListUserAll listUserAll(RepositoryUser repositoryUser){
        return new ListUserAll(repositoryUser);
    }
}
