package com.servicenow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.servicenow.dto.ErrorDTO;
import com.servicenow.repository.ErrorRepository;

@Service
@Repository
public class ErrorServiceImpl implements ErrorServiceInt {

	@Autowired
	ErrorRepository errorRepository;

	@Override
	public ErrorDTO add(ErrorDTO errorDTO) {
		return errorRepository.save(errorDTO);
	}
}
