package com.servicenow.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicenow.dto.ContactDTO;
import com.servicenow.service.ContactServiceInt;

@RestController
@RequestMapping("/api/contact")
public class ContactCtl {

	@Autowired
	ContactServiceInt contactServiceInt;

	@GetMapping("getAllList")
	public List<ContactDTO> getAllList() {
		return contactServiceInt.list();
	}

	@PostMapping("add")
	public void add(@RequestBody ContactDTO contactDTO) {
		contactServiceInt.add(contactDTO);
	}

}
