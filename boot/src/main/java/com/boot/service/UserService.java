package com.boot.service;

import com.boot.payload.UserDto;
import java.util.List;

public interface UserService {

    UserDto createUser(UserDto userDto);

    UserDto updateUser(UserDto userDto, Integer userId);

    UserDto getUserById(Integer userId);

    List<UserDto> getAllUser();

    void deleteUser(Integer userId);
}
