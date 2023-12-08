package com.servicenow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicenow.dto.ErrorDTO;

public interface ErrorRepository extends JpaRepository<ErrorDTO, Long> {

}
