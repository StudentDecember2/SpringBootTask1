package springboot.SpringBootTask1.service;



import springboot.SpringBootTask1.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);
    void deleteUser(Long id);

    void updateUser(Long id, User user);
    User getUserById(Long id);

    List<User> getAllUsers();

}