package by.antimad.graduation_project.service;

import by.antimad.graduation_project.entity.UserEntity;
import by.antimad.graduation_project.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> someMethod() {
        return userRepository.findAll();
    }
}