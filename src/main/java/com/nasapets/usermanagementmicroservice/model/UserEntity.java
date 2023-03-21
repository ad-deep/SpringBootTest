package com.nasapets.usermanagementmicroservice.model;

import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "users")
public class UserEntity {

  @Id
  private Long id;
  private String userName;
  private String email;
  private String firstName;
  private String lastName;

}
