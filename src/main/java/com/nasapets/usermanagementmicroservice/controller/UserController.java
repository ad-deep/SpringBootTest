package com.nasapets.usermanagementmicroservice.controller;

import com.nasapets.usermanagementmicroservice.dto.UserEntityRequest;
import java.lang.annotation.Documented;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Documented(value = "users")
public class UserController {

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void createUser(@RequestBody UserEntityRequest userEntityRequest){

  }

}
