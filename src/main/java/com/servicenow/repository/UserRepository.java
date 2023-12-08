package com.servicenow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicenow.dto.UserDTO;

public interface UserRepository extends JpaRepository<UserDTO, Long> {

}
