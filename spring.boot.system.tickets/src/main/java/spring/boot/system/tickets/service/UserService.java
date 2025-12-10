package spring.boot.system.tickets.service;

import org.springframework.stereotype.Service;
import spring.boot.system.tickets.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

}
