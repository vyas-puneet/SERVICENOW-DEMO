package com.servicenow.service;

import java.util.List;

import com.servicenow.dto.UserDTO;

public interface UserServiceInt {
	
	public UserDTO add(UserDTO userDTO);
	
	public void delete(Long id);
	
	public List<UserDTO> list();
	
	public UserDTO getById(Long id);

}
