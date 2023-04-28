package logisticsApp.service;

import logisticsApp.data.model.User;
import logisticsApp.data.repository.UserRepository;
import logisticsApp.dto.requests.RegisterUserRequest;
import logisticsApp.dto.responses.RegisterUserResponse;
import logisticsApp.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
    @Autowired
     private  UserRepository userRepository;


    @Override
    public RegisterUserResponse registerNewUser(RegisterUserRequest request) {
        User newUser = Mapper.map(request);
        User savedUser = userRepository.save(newUser);
        return Mapper.map(savedUser);
    }


    @Override
    public User findUser(String id) {
        var user = userRepository.findById(id);
       if(user.isEmpty()) throw new IllegalArgumentException("User does not exist");
       return userRepository.findById(id).get();
    }
}
