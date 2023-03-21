package com.nasapets.usermanagementmicroservice.repository;

import com.nasapets.usermanagementmicroservice.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
