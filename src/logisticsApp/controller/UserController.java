package logisticsApp.controller;


import logisticsApp.dto.responses.ApiResponse;
import logisticsApp.service.UserService;
import logisticsApp.dto.requests.RegisterUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")

    public ResponseEntity<?> registerNewUser(@RequestBody RegisterUserRequest user) {
       return new ResponseEntity<>(new ApiResponse(true, userService.registerNewUser(user)),HttpStatus.CREATED);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> findUserById(@PathVariable String id) {
        try {
            return new ResponseEntity<>(new ApiResponse(true, userService.findUser(id)), HttpStatus.FOUND);
        } catch (IllegalArgumentException ex) {
            return new ResponseEntity<>(new ApiResponse(false, ex.getMessage()), HttpStatus.NOT_FOUND);
        }
    }
}