package data.repository;

import logisticsApp.data.model.User;
import logisticsApp.data.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImpTest {
    private UserRepository userRepository;
    @BeforeEach
    public void setUp(){
        userRepository = new UserRepositoryImplementation();
    }
    @Test
    @DisplayName("Create new user Test")
    public void createNewUser_countIsOneTest(){
        User newUser = new User();
        assertEquals(0, userRepository.lastIdCreated());
        userRepository.save(newUser);
        assertEquals(1,userRepository.lastIdCreated());
    }
    @Test
    @DisplayName("Generate user id")
    public void saveOneUserId_countIsOneTest(){
        User newUser = new User();
        assertEquals(0,newUser.getId());
        userRepository.save(newUser);
       assertEquals(1,userRepository.lastIdCreated());
    }
    @Test
    @DisplayName("Update user")
    public void deleteUserById(){
        User newUser = new User();
        userRepository.save(newUser);
        assertEquals(1,userRepository.lastIdCreated());
        userRepository.delete(1);
        assertEquals(0,userRepository.lastIdCreated());
    }

    @Test
    @DisplayName("Update user")
    public void deleteUserByUser(){
        User newUser = new User();
        userRepository.save(newUser);
        assertEquals(1,userRepository.lastIdCreated());
        userRepository.delete(newUser);
        assertEquals(0,userRepository.lastIdCreated());
    }
}
