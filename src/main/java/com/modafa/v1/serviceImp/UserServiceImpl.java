package com.modafa.v1.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modafa.v1.entity.User;
import com.modafa.v1.repository.UserRepository;
import com.modafa.v1.services.UserService;


@Service

public class UserServiceImpl implements UserService {
	private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
    	  // Vérifier si l'email existe déjà
        User existingUser = userRepository.findByEmail(user.getEmail());
        if (existingUser != null) {
            // Retourne l'utilisateur existant sans créer de doublon
            return existingUser;
        }

        // Si l'email n'existe pas, sauvegarder le nouvel utilisateur et le retourner
        return userRepository.save(user);
    }    

    @Override
    public User getUserById(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }
    
//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User login(String email, String password) throws Exception {
        User user = findByEmail(email);
//        if (user == null || !passwordEncoder.matches(password, user.getPassword())) {
//            throw new Exception("Invalid login credentials");
//        }
        if (user == null || !password.equals(user.getPassword()) ) {
            throw new Exception("Invalid login credentials");
        }
        return user;
    }
}