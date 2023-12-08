package com.servicenow.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CONTACT")
public class ContactDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, unique = true)
	private Long id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "MIDDLE_NAME")
	private String middleName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "PREFIX")
	private String prefix;

	@Column(name = "SUFFEX")
	private String suffex;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "COMPANY_NAME")
	private String companyName;

	@Column(name = "JOB_DESCRIPTION")
	private String jobDescription;

	@Column(name = "JOB_TITLE")
	private String jobTitle;

	@Column(name = "JOB_ROLE")
	private String jobRole;

	@Column(name = "JOB_LEVEL")
	private String jobLevel;

	@Column(name = "EVENT_TYPE")
	private String eventType;

	@Column(name = "TIME_ZONE")
	private String timeZone;

	@Column(name = "PREFERRED_LANGUAGE")
	private String preLanguage;

	@Column(name = "KEY_CONTACT")
	private String keyContact;

	@Column(name = "KEY_CONTACT_RANK")
	private String keyContactRank;

	@Column(name = "KEY_CONTACT_DEPARTMENT")
	private String keyContactDepartment;

	@Column(name = "NOTES")
	private String notes;

	@Column(name = "BIRTH_YEAR")
	private String birthYear;

	@Column(name = "AGE")
	private int age;

	@Column(name = "ORIGINAL_FIRST_NAME")
	private String originalFirstName;

	@Column(name = "CREATED_BY")
	private String createdBy = "root";

	@CreatedDate
	@Column(name = "CREATED_DATE")
	private Date createdDate = new Date();

	@Column(name = "UPDATE_BY")
	private String updateBy = "root";

	@LastModifiedDate
	@Column(name = "UPDATE_DATE")
	private Date updatedDate = new Date();

	@Column(name = "SFDC_ID")
	private String sfdcId;

	@Column(name = "PURGE_DATE")
	private Date purgeDate = new Date();

	@Column(name = "PURGE_REASON")
	private String purgeReason;

	@Column(name = "ADDRESS_ONE")
	private String address1;

	@Column(name = "ADDRESS_TWO")
	private String address2;

	@Column(name = "ADDRESS_THREE")
	private String address3;

	@Column(name = "ADDRESS_FOURTH")
	private String address4;

	@Column(name = "CITY")
	private String city;

	@Column(name = "STATE_CODE")
	private int stateCode;

	@Column(name = "STATE_NAME")
	private String stateName;

	@Column(name = "POSTAL_CODE")
	private String postalCode;

	@Column(name = "COUNTRY_CODE")
	private int countryCode;

	@Column(name = "COUNTRY_NAME")
	private String countryName;

	@Column(name = "BUSINESS_PHONE")
	private String businessPhone;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "MOBILE_PHONE")
	private String mobilePhone;

	@Column(name = "HOME_PHONE")
	private String homePhone;

	@Column(name = "FAX")
	private String fax;

	@Column(name = "ACTIVE_FLAG")
	private String activeFlag;

	@Column(name = "KEY_CONTACT_ROLE")
	private String keyContactRole;

	@Column(name = "MARKETABLE_FLAG")
	private String marketableFlag;

	@Column(name = "EXPLICIT_CONSENT_DATE")
	private Date explicitConsentDate = new Date();

	@Column(name = "EXPLICIT_CONSENT_SOURCE")
	private String explicitConsentSource;

	@Column(name = "DO_NOT_CONTACT_INDICATOR")
	private String doNotContactIndicator;

	@Column(name = "DO_NOT_CALL_INDICATOR")
	private String doNotCallIndicator;

	@Column(name = "DO_NOT_SYNCTO_MARKETO")
	private String doNotSynctoMarketo;

	@Column(name = "LINKED_IN", length = 1000)
	private String linkedIn;

	@Column(name = "FACEBOOK", length = 1000)
	private String facebook;

	@Column(name = "TWITTER", length = 1000)
	private String twitter;
	
	@Column(name = "PRIMARY_PHOTO")
	private String primaryPhoto;

}
