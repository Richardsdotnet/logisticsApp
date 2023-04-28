package logisticsApp.service;

import logisticsApp.data.model.User;
import logisticsApp.dto.requests.RegisterUserRequest;
import logisticsApp.dto.responses.RegisterUserResponse;

public interface UserService {

    RegisterUserResponse registerNewUser(RegisterUserRequest request);
    User findUser(String id);

}
