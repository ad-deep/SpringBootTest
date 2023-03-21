package com.nasapets.usermanagementmicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntityRequest {

  private Long id;
  private String userName;
  private String email;
  private String firstName;
  private String lastName;

}
