package br.com.alura.codechella.infra.Controller;
import br.com.alura.codechella.Domain.entities.usuario.User;
import br.com.alura.codechella.application.usecases.CreateUser;
import br.com.alura.codechella.application.usecases.ListUserAll;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    private final CreateUser createUser;
    private final ListUserAll all;

    public UserController(CreateUser createUser, ListUserAll all) {
        this.createUser = createUser;
        this.all = all;
    }

    @PostMapping
    public ResponseEntity<UserDTO> register(@RequestBody @Valid UserDTO usuario, UriComponentsBuilder uriBuilder) {
        var user = createUser.registerUser(new User(usuario.cpf(), usuario.name(),usuario.birth(),usuario.email()));
        return ResponseEntity.ok(new UserDTO(user.getCpf(), user.getName(),user.getBirth(),user.getEmail()));
    }
    @GetMapping
    public ResponseEntity<List<UserDTO>> listResponseEntity(){
        return ResponseEntity.ok(all.listALL().stream().map(user->new UserDTO(user.getCpf(), user.getName(),user.getBirth(),user.getEmail())).toList());
    }
}
