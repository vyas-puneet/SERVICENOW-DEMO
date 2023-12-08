package com.servicenow.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicenow.dto.ContactAzureDTO;
import com.servicenow.service.ContactAzureServiceInt;

@RestController
@RequestMapping("/api/contactCos")
public class ContactAzureCtl {

	@Autowired
	ContactAzureServiceInt contectCosmosServiceInt;

	@GetMapping("getAllList")
	public List<ContactAzureDTO> getAllList() {
		return contectCosmosServiceInt.getAll();
	}

	@PostMapping("add")
	public void add(@RequestBody ContactAzureDTO contectCosmosDTO) {
		contectCosmosServiceInt.save(contectCosmosDTO);
	}

}
