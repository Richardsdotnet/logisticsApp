//package service;
//
//import logisticsApp.data.model.User;
//import logisticsApp.dto.requests.RegisterUserRequest;
//import logisticsApp.dto.responses.RegisterUserResponse;
//import logisticsApp.service.UserService;
//import logisticsApp.service.UserServiceImp;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class UserServiceImpTest {
//    private UserService userService;
//    @BeforeEach
//    public void setUp() {
//        userService = new UserServiceImp();
//    }
//
//
//@Test
//public void registerUserTest(){
//    RegisterUserRequest request = new RegisterUserRequest();
//    request.setPhoneNumber("phoneNumber");
//    request.setLastName("lastName");
//    request.setFirstName("firstName");
//    request.setAddress("address");
//    request.setEmail("email");
//    RegisterUserResponse user =  userService.registerNewUser(request);
//    assertEquals(1,user.getId());
//    User foundUser = userService.findUser(1);
//    assertEquals(user,foundUser);
//}
//
//@Test
//    public void findUserTest(){
//    User foundUser = new User();
//    foundUser = userService.findUser(1);
//    foundUser = userService.findUser(2);
//    foundUser = userService.findUser(3);
//
//
//
//    assertEquals(3,foundUser.getId());
//    System.out.println(foundUser.getId());
//    }
//}