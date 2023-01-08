package com.user.lab9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<AppUser> getUsers(){
        return userRepository.findAll();
    }

    public void addUsers(AppUser user) {
        userRepository.save(user);
    }
}
