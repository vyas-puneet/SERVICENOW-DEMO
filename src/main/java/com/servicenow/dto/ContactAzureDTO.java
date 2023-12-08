package com.servicenow.dto;

import java.util.Date;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Container(containerName = "ContactDB")
public class ContactAzureDTO {

	@Id
	@GeneratedValue
	private String id;

	private Long contactId;

	private String firstName;

	private String middleName;

	private String lastName;

	private String prefix;

	private String suffex;

	private String companyName;

	private String jobDescription;

	private String jobTitle;

	private String jobRole;

	private String jobLevel;

	private String eventType;

	private String timeZone;

	private String preLanguage;

	private String keyContact;

	private String keyContactRank;

	private String keyContactDepartment;

	private String notes;

	private String sfdcId;

	private String address1;

	private String address2;

	private String address3;

	private String address4;

	private String city;

	private int stateCode;

	private String stateName;

	private String postalCode;

	private int countryCode;

	private String countryName;

	private String businessPhone;

	private String email;

	private String mobilePhone;

	private String homePhone;

	private String fax;

	private String activeFlag;

	private String keyContactRole;

	private Date explicitConsentDate;

	private String explicitConsentSource;

	private String doNotContactIndicator;

	private String doNotCallIndicator;

	private String doNotSynctoMarketo;

	private String linkedIn;

	private String facebook;

	private String twitter;

	private String primaryPhoto;

	public ContactAzureDTO(String firstName, String middleName, String lastName, String prefix, String suffex,
			String companyName, String jobDescription, String jobTitle, String jobRole, String jobLevel,
			String eventType, String timeZone, String preLanguage, String keyContact, String keyContactRank,
			String keyContactDepartment, String notes, String sfdcId, String address1, String address2, String address3,
			String address4, String city, int stateCode, String stateName, String postalCode, int countryCode,
			String countryName, String businessPhone, String email, String mobilePhone, String homePhone, String fax,
			String activeFlag, String keyContactRole, Date explicitConsentDate, String explicitConsentSource,
			String doNotContactIndicator, String doNotCallIndicator, String doNotSynctoMarketo, String linkedIn,
			String facebook, String twitter, String primaryPhoto) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.prefix = prefix;
		this.suffex = suffex;
		this.companyName = companyName;
		this.jobDescription = jobDescription;
		this.jobTitle = jobTitle;
		this.jobRole = jobRole;
		this.jobLevel = jobLevel;
		this.eventType = eventType;
		this.timeZone = timeZone;
		this.preLanguage = preLanguage;
		this.keyContact = keyContact;
		this.keyContactRank = keyContactRank;
		this.keyContactDepartment = keyContactDepartment;
		this.notes = notes;
		this.sfdcId = sfdcId;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.address4 = address4;
		this.city = city;
		this.stateCode = stateCode;
		this.stateName = stateName;
		this.postalCode = postalCode;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.businessPhone = businessPhone;
		this.email = email;
		this.mobilePhone = mobilePhone;
		this.homePhone = homePhone;
		this.fax = fax;
		this.activeFlag = activeFlag;
		this.keyContactRole = keyContactRole;
		this.explicitConsentDate = explicitConsentDate;
		this.explicitConsentSource = explicitConsentSource;
		this.doNotContactIndicator = doNotContactIndicator;
		this.doNotCallIndicator = doNotCallIndicator;
		this.doNotSynctoMarketo = doNotSynctoMarketo;
		this.linkedIn = linkedIn;
		this.facebook = facebook;
		this.twitter = twitter;
		this.primaryPhoto = primaryPhoto;
	}

}
