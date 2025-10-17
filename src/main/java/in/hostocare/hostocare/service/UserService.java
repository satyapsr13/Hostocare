package in.hostocare.hostocare.service;

import org.springframework.stereotype.Service;

import in.hostocare.hostocare.entity.User;
import in.hostocare.hostocare.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("user not found"));
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

}
