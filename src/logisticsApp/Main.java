package logisticsApp;

import logisticsApp.controller.UserController;
import logisticsApp.dto.requests.RegisterUserRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@SpringBootApplication
public class Main {
    private static final UserController userController = new UserController();

    public static void main(String... params) {
        SpringApplication.run(Main.class, params);
//        String mainMenu = """
//                Hi, What do you want to do?
//                1. Register new user
//                2. Find Registered User
//                """;
//        int userInput = collectUserInput(mainMenu);
//        switch (userInput){
//            case 1: registerUser();
//            case 2: findRegisteredUser();
//        }
    }


    private static void registerUser() {
        String firstName = collectStringInput("Enter first name");
        String lastName = collectStringInput("Enter last name");
        String address = collectStringInput("Enter address");
        String email = collectStringInput("Enter email");
        String phoneNumber = collectStringInput("Enter phone Number");
        RegisterUserRequest request = new RegisterUserRequest();

        request.setAddress(address);
        request.setEmail(email);
        request.setFirstName(firstName);
        request.setLastName(lastName);
        request.setPhoneNumber(phoneNumber);
        display(userController.registerNewUser(request).toString());
        main();
    }
    private static int collectUserInput(String mainMenu) {
        return Integer.parseInt(JOptionPane.showInputDialog(mainMenu));
    }


    private static String collectStringInput(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    private static void findRegisteredUser() {
        String userId = collectStringInput("Enter user id");
        display(userController.findUserById(userId).toString());
        main();

    }
    private static void display(String prompt){
        JOptionPane.showInputDialog(prompt);
    }

}
