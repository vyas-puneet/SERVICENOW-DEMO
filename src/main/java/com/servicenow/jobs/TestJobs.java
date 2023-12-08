package com.servicenow.jobs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.servicenow.dto.ContactTriggerDTO;
import com.servicenow.service.ContactAzureServiceInt;
import com.servicenow.service.ContactServiceInt;

@Component
public class TestJobs {

	@Autowired
	ContactServiceInt contactServiceInt;

	@Autowired
	ContactAzureServiceInt contactAzureServiceInt;

	@Scheduled(cron = "* 0/5 * * * *")
	public void performTask() {
		List<ContactTriggerDTO> contactTestList = contactServiceInt.readDataSql();
		contactAzureServiceInt.readSQLWriteCosmos(contactTestList);
	}

	@Scheduled(cron = "* 0/30 * * * *")
	public void clearDataInTriggerTable() {
		
		List<ContactTriggerDTO> contactTestList = contactServiceInt.readDataSql();
		contactAzureServiceInt.readSQLWriteCosmos(contactTestList);
		
		if (contactTestList.size() > 0) {
			for (int i = 0; i < contactTestList.size(); i++) {
				ContactTriggerDTO dto = contactTestList.get(i);
				contactServiceInt.clearTriggerData(dto.getId());
			}
		}
	}

}
