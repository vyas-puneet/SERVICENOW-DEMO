package com.servicenow.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.servicenow.dto.UserDTO;
import com.servicenow.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserServiceInt {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDTO add(UserDTO userDTO) {
		UserDTO dto = userRepository.save(userDTO);
		return dto;
	}

	@Override
	public void delete(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public List<UserDTO> list() {
		return userRepository.findAll();
	}

	@Override
	public UserDTO getById(Long id) {
		return userRepository.getById(id);
	}

}
