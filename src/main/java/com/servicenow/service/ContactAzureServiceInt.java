package com.servicenow.service;

import java.util.List;

import com.servicenow.dto.ContactAzureDTO;

public interface ContactAzureServiceInt {

	public void save(ContactAzureDTO contectCosmosDTO);

	public List<ContactAzureDTO> getAll();

	public void readSQLWriteCosmos(List list);

}
