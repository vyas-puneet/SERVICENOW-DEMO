package com.servicenow.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.azure.spring.data.cosmos.repository.Query;
import com.servicenow.dto.ContactAzureDTO;

public interface ContactAzureReposotory extends CosmosRepository<ContactAzureDTO, Long> {

	@Query("SELECT * FROM c WHERE c.contactId = @contactId")
	List<ContactAzureDTO> findByContactId(@Param("contactId") Long contactId);

}
