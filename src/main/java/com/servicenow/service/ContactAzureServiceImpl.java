package com.servicenow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.servicenow.dto.ContactAzureDTO;
import com.servicenow.dto.ContactTriggerDTO;
import com.servicenow.dto.ErrorDTO;
import com.servicenow.repository.ContactAzureReposotory;

@Service
@Transactional
public class ContactAzureServiceImpl implements ContactAzureServiceInt {

	@Autowired
	ContactAzureReposotory contactAzureReposotory;

	@Autowired
	ErrorServiceInt errorServiceInt;

	@Override
	public void save(ContactAzureDTO contectCosmosDTO) {
		contactAzureReposotory.save(contectCosmosDTO);
	}

	@Override
	public List<ContactAzureDTO> getAll() {
		return (List<ContactAzureDTO>) contactAzureReposotory.findAll();
	}

	@Override
	public void readSQLWriteCosmos(List list) {
		try {

			if (list.size() > 0) {
				for (int i = 0; i < list.size(); i++) {
					ContactTriggerDTO contactTriggerDTO = (ContactTriggerDTO) list.get(i);

					if (contactTriggerDTO.getStatus().equalsIgnoreCase("Insert")) {

						List<ContactAzureDTO> contactAzurelist = contactAzureReposotory
								.findByContactId(contactTriggerDTO.getId());

						if (contactAzurelist.size() > 0) {

							for (int j = 0; j < contactAzurelist.size(); j++) {
								ContactAzureDTO azureDTO = contactAzurelist.get(j);

								if (!(contactTriggerDTO.getId()).equals(azureDTO.getContactId())) {

									ContactAzureDTO contactAzureDTO = new ContactAzureDTO();
									contactAzureDTO.setContactId(contactTriggerDTO.getId());
									contactAzureDTO.setFirstName(contactTriggerDTO.getFirstName());
									contactAzureDTO.setMiddleName(contactTriggerDTO.getMiddleName());
									contactAzureDTO.setLastName(contactTriggerDTO.getLastName());
									contactAzureDTO.setPrefix(contactTriggerDTO.getPrefix());
									contactAzureDTO.setSuffex(contactTriggerDTO.getSuffex());
									contactAzureDTO.setCompanyName(contactTriggerDTO.getCompanyName());
									contactAzureDTO.setJobDescription(contactTriggerDTO.getJobDescription());
									contactAzureDTO.setJobTitle(contactTriggerDTO.getJobTitle());
									contactAzureDTO.setJobRole(contactTriggerDTO.getJobRole());
									contactAzureDTO.setJobLevel(contactTriggerDTO.getJobLevel());
									contactAzureDTO.setEventType(contactTriggerDTO.getEventType());
									contactAzureDTO.setTimeZone(contactTriggerDTO.getTimeZone());
									contactAzureDTO.setPreLanguage(contactTriggerDTO.getPreLanguage());
									contactAzureDTO.setKeyContact(contactTriggerDTO.getKeyContact());
									contactAzureDTO.setKeyContactRank(contactTriggerDTO.getKeyContactRank());
									contactAzureDTO
											.setKeyContactDepartment(contactTriggerDTO.getKeyContactDepartment());
									contactAzureDTO.setNotes(contactTriggerDTO.getNotes());
									contactAzureDTO.setSfdcId(contactTriggerDTO.getSfdcId());
									contactAzureDTO.setAddress1(contactTriggerDTO.getAddress1());
									contactAzureDTO.setAddress2(contactTriggerDTO.getAddress2());
									contactAzureDTO.setAddress3(contactTriggerDTO.getAddress3());
									contactAzureDTO.setAddress4(contactTriggerDTO.getAddress4());
									contactAzureDTO.setCity(contactTriggerDTO.getCity());
									contactAzureDTO.setStateCode(contactTriggerDTO.getStateCode());
									contactAzureDTO.setStateName(contactTriggerDTO.getStateName());
									contactAzureDTO.setPostalCode(contactTriggerDTO.getPostalCode());
									contactAzureDTO.setCountryCode(contactTriggerDTO.getCountryCode());
									contactAzureDTO.setCountryName(contactTriggerDTO.getCountryName());
									contactAzureDTO.setBusinessPhone(contactTriggerDTO.getBusinessPhone());
									contactAzureDTO.setEmail(contactTriggerDTO.getEmail());
									contactAzureDTO.setMobilePhone(contactTriggerDTO.getMobilePhone());
									contactAzureDTO.setHomePhone(contactTriggerDTO.getHomePhone());
									contactAzureDTO.setFax(contactTriggerDTO.getFax());
									contactAzureDTO.setActiveFlag(contactTriggerDTO.getActiveFlag());
									contactAzureDTO.setKeyContactRole(contactTriggerDTO.getKeyContactRole());
									contactAzureDTO.setExplicitConsentDate(contactTriggerDTO.getExplicitConsentDate());
									contactAzureDTO
											.setExplicitConsentSource(contactTriggerDTO.getExplicitConsentSource());
									contactAzureDTO
											.setDoNotContactIndicator(contactTriggerDTO.getDoNotContactIndicator());
									contactAzureDTO.setDoNotCallIndicator(contactTriggerDTO.getDoNotCallIndicator());
									contactAzureDTO.setDoNotSynctoMarketo(contactTriggerDTO.getDoNotSynctoMarketo());
									contactAzureDTO.setLinkedIn(contactTriggerDTO.getLinkedIn());
									contactAzureDTO.setFacebook(contactTriggerDTO.getFacebook());
									contactAzureDTO.setTwitter(contactTriggerDTO.getTwitter());
									contactAzureDTO.setPrimaryPhoto(contactTriggerDTO.getPrimaryPhoto());
									contactAzureReposotory.save(contactAzureDTO);
								}
							}

						} else {

							ContactAzureDTO contactAzureDTO = new ContactAzureDTO();
							contactAzureDTO.setContactId(contactTriggerDTO.getId());
							contactAzureDTO.setFirstName(contactTriggerDTO.getFirstName());
							contactAzureDTO.setMiddleName(contactTriggerDTO.getMiddleName());
							contactAzureDTO.setLastName(contactTriggerDTO.getLastName());
							contactAzureDTO.setPrefix(contactTriggerDTO.getPrefix());
							contactAzureDTO.setSuffex(contactTriggerDTO.getSuffex());
							contactAzureDTO.setCompanyName(contactTriggerDTO.getCompanyName());
							contactAzureDTO.setJobDescription(contactTriggerDTO.getJobDescription());
							contactAzureDTO.setJobTitle(contactTriggerDTO.getJobTitle());
							contactAzureDTO.setJobRole(contactTriggerDTO.getJobRole());
							contactAzureDTO.setJobLevel(contactTriggerDTO.getJobLevel());
							contactAzureDTO.setEventType(contactTriggerDTO.getEventType());
							contactAzureDTO.setTimeZone(contactTriggerDTO.getTimeZone());
							contactAzureDTO.setPreLanguage(contactTriggerDTO.getPreLanguage());
							contactAzureDTO.setKeyContact(contactTriggerDTO.getKeyContact());
							contactAzureDTO.setKeyContactRank(contactTriggerDTO.getKeyContactRank());
							contactAzureDTO.setKeyContactDepartment(contactTriggerDTO.getKeyContactDepartment());
							contactAzureDTO.setNotes(contactTriggerDTO.getNotes());
							contactAzureDTO.setSfdcId(contactTriggerDTO.getSfdcId());
							contactAzureDTO.setAddress1(contactTriggerDTO.getAddress1());
							contactAzureDTO.setAddress2(contactTriggerDTO.getAddress2());
							contactAzureDTO.setAddress3(contactTriggerDTO.getAddress3());
							contactAzureDTO.setAddress4(contactTriggerDTO.getAddress4());
							contactAzureDTO.setCity(contactTriggerDTO.getCity());
							contactAzureDTO.setStateCode(contactTriggerDTO.getStateCode());
							contactAzureDTO.setStateName(contactTriggerDTO.getStateName());
							contactAzureDTO.setPostalCode(contactTriggerDTO.getPostalCode());
							contactAzureDTO.setCountryCode(contactTriggerDTO.getCountryCode());
							contactAzureDTO.setCountryName(contactTriggerDTO.getCountryName());
							contactAzureDTO.setBusinessPhone(contactTriggerDTO.getBusinessPhone());
							contactAzureDTO.setEmail(contactTriggerDTO.getEmail());
							contactAzureDTO.setMobilePhone(contactTriggerDTO.getMobilePhone());
							contactAzureDTO.setHomePhone(contactTriggerDTO.getHomePhone());
							contactAzureDTO.setFax(contactTriggerDTO.getFax());
							contactAzureDTO.setActiveFlag(contactTriggerDTO.getActiveFlag());
							contactAzureDTO.setKeyContactRole(contactTriggerDTO.getKeyContactRole());
							contactAzureDTO.setExplicitConsentDate(contactTriggerDTO.getExplicitConsentDate());
							contactAzureDTO.setExplicitConsentSource(contactTriggerDTO.getExplicitConsentSource());
							contactAzureDTO.setDoNotContactIndicator(contactTriggerDTO.getDoNotContactIndicator());
							contactAzureDTO.setDoNotCallIndicator(contactTriggerDTO.getDoNotCallIndicator());
							contactAzureDTO.setDoNotSynctoMarketo(contactTriggerDTO.getDoNotSynctoMarketo());
							contactAzureDTO.setLinkedIn(contactTriggerDTO.getLinkedIn());
							contactAzureDTO.setFacebook(contactTriggerDTO.getFacebook());
							contactAzureDTO.setTwitter(contactTriggerDTO.getTwitter());
							contactAzureDTO.setPrimaryPhoto(contactTriggerDTO.getPrimaryPhoto());
							contactAzureReposotory.save(contactAzureDTO);
						}

					} else if (contactTriggerDTO.getStatus().equalsIgnoreCase("Update")) {

						List<ContactAzureDTO> contactAzurelist = contactAzureReposotory
								.findByContactId(contactTriggerDTO.getId());

						for (int j = 0; j < contactAzurelist.size(); j++) {
							ContactAzureDTO azureDTO = contactAzurelist.get(j);
							azureDTO.setFirstName(contactTriggerDTO.getFirstName());
							azureDTO.setMiddleName(contactTriggerDTO.getMiddleName());
							azureDTO.setLastName(contactTriggerDTO.getLastName());
							azureDTO.setPrefix(contactTriggerDTO.getPrefix());
							azureDTO.setSuffex(contactTriggerDTO.getSuffex());
							azureDTO.setCompanyName(contactTriggerDTO.getCompanyName());
							azureDTO.setJobDescription(contactTriggerDTO.getJobDescription());
							azureDTO.setJobTitle(contactTriggerDTO.getJobTitle());
							azureDTO.setJobRole(contactTriggerDTO.getJobRole());
							azureDTO.setJobLevel(contactTriggerDTO.getJobLevel());
							azureDTO.setEventType(contactTriggerDTO.getEventType());
							azureDTO.setTimeZone(contactTriggerDTO.getTimeZone());
							azureDTO.setPreLanguage(contactTriggerDTO.getPreLanguage());
							azureDTO.setKeyContact(contactTriggerDTO.getKeyContact());
							azureDTO.setKeyContactRank(contactTriggerDTO.getKeyContactRank());
							azureDTO.setKeyContactDepartment(contactTriggerDTO.getKeyContactDepartment());
							azureDTO.setNotes(contactTriggerDTO.getNotes());
							azureDTO.setSfdcId(contactTriggerDTO.getSfdcId());
							azureDTO.setAddress1(contactTriggerDTO.getAddress1());
							azureDTO.setAddress2(contactTriggerDTO.getAddress2());
							azureDTO.setAddress3(contactTriggerDTO.getAddress3());
							azureDTO.setAddress4(contactTriggerDTO.getAddress4());
							azureDTO.setCity(contactTriggerDTO.getCity());
							azureDTO.setStateCode(contactTriggerDTO.getStateCode());
							azureDTO.setStateName(contactTriggerDTO.getStateName());
							azureDTO.setPostalCode(contactTriggerDTO.getPostalCode());
							azureDTO.setCountryCode(contactTriggerDTO.getCountryCode());
							azureDTO.setCountryName(contactTriggerDTO.getCountryName());
							azureDTO.setBusinessPhone(contactTriggerDTO.getBusinessPhone());
							azureDTO.setEmail(contactTriggerDTO.getEmail());
							azureDTO.setMobilePhone(contactTriggerDTO.getMobilePhone());
							azureDTO.setHomePhone(contactTriggerDTO.getHomePhone());
							azureDTO.setFax(contactTriggerDTO.getFax());
							azureDTO.setActiveFlag(contactTriggerDTO.getActiveFlag());
							azureDTO.setKeyContactRole(contactTriggerDTO.getKeyContactRole());
							azureDTO.setExplicitConsentDate(contactTriggerDTO.getExplicitConsentDate());
							azureDTO.setExplicitConsentSource(contactTriggerDTO.getExplicitConsentSource());
							azureDTO.setDoNotContactIndicator(contactTriggerDTO.getDoNotContactIndicator());
							azureDTO.setDoNotCallIndicator(contactTriggerDTO.getDoNotCallIndicator());
							azureDTO.setDoNotSynctoMarketo(contactTriggerDTO.getDoNotSynctoMarketo());
							azureDTO.setLinkedIn(contactTriggerDTO.getLinkedIn());
							azureDTO.setFacebook(contactTriggerDTO.getFacebook());
							azureDTO.setTwitter(contactTriggerDTO.getTwitter());
							azureDTO.setPrimaryPhoto(contactTriggerDTO.getPrimaryPhoto());
							contactAzureReposotory.save(azureDTO);
						}

					} else if (contactTriggerDTO.getStatus().equalsIgnoreCase("Delete")) {

						List<ContactAzureDTO> contactAzurelist = contactAzureReposotory
								.findByContactId(contactTriggerDTO.getId());

						for (int j = 0; j < contactAzurelist.size(); j++) {
							ContactAzureDTO azureDTO = contactAzurelist.get(j);
							contactAzureReposotory.delete(azureDTO);
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			ErrorDTO errorDTO = new ErrorDTO();
			errorDTO.setMessage(e.getMessage());
			errorServiceInt.add(errorDTO);
		}
	}
}