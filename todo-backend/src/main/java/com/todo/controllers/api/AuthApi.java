package com.todo.controllers.api;

import io.swagger.annotations.*;

import static com.todo.utils.Constants.APP_ROOT;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.todo.dto.UserDto;

@Api("authApi")
public interface AuthApi {

    @ApiOperation(value = "Login user", notes = "Creates a new user ", response = UserDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "The connected user.")
    })
    @PostMapping(value = APP_ROOT + "/auth/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<UserDto> loginUser(
            @ApiParam(value = "User DTO", required = true) @RequestBody UserDto user
    );
}
