package com.servicenow.service;

import java.util.List;

import com.servicenow.dto.ContactDTO;
import com.servicenow.dto.ContactTriggerDTO;

public interface ContactServiceInt {

	public ContactDTO add(ContactDTO contactDTO);

	public void delete(Long id);

	public List<ContactDTO> list();

	public ContactDTO getById(Long id);

	public List<ContactTriggerDTO> readDataSql();

	public void clearTriggerData(long id);

}
