package acc.br.SpringThymeLeaf.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import acc.br.SpringThymeLeaf.model.User;
import acc.br.SpringThymeLeaf.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
