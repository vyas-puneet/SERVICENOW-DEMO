package com.servicenow.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicenow.dto.UserDTO;
import com.servicenow.service.UserServiceInt;

@RestController
@RequestMapping("/api/user")
public class UserCtl {

	@Autowired
	UserServiceInt userServiceInt;

	@GetMapping("getAllList")
	public List<UserDTO> getAllList() {
		return userServiceInt.list();
	}

	@PostMapping("add")
	public void add(@RequestBody UserDTO userDTO) {
		userServiceInt.add(userDTO);
	}

}
