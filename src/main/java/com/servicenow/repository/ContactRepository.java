package com.servicenow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicenow.dto.ContactDTO;

public interface ContactRepository extends JpaRepository<ContactDTO, Long> {

}
