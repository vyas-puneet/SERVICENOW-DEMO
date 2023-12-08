package com.servicenow.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

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
@Table(name = "CONTACT_STAGE")
public class ContactTriggerDTO {

	@Transient
	private Long id;

	@Transient
	private String firstName;

	@Transient
	private String middleName;

	@Transient
	private String lastName;

	@Transient
	private String prefix;

	@Transient
	private String suffex;

	@Transient
	private String companyName;

	@Transient
	private String jobDescription;

	@Transient
	private String jobTitle;

	@Transient
	private String jobRole;

	@Transient
	private String jobLevel;

	@Transient
	private String eventType;

	@Transient
	private String timeZone;

	@Transient
	private String preLanguage;

	@Transient
	private String keyContact;

	@Transient
	private String keyContactRank;

	@Transient
	private String keyContactDepartment;

	@Transient
	private String notes;

	@Transient
	private String sfdcId;

	@Transient
	private String address1;

	@Transient
	private String address2;

	@Transient
	private String address3;

	@Transient
	private String address4;

	@Transient
	private String city;

	@Transient
	private int stateCode;

	@Transient
	private String stateName;

	@Transient
	private String postalCode;

	@Transient
	private int countryCode;

	@Transient
	private String countryName;

	@Transient
	private String businessPhone;

	@Transient
	private String email;

	@Transient
	private String mobilePhone;

	@Transient
	private String homePhone;

	@Transient
	private String fax;

	@Transient
	private String activeFlag;

	@Transient
	private String keyContactRole;

	@Transient
	private Date explicitConsentDate;

	@Transient
	private String explicitConsentSource;

	@Transient
	private String doNotContactIndicator;

	@Transient
	private String doNotCallIndicator;

	@Transient
	private String doNotSynctoMarketo;

	@Transient
	private String linkedIn;

	@Transient
	private String facebook;

	@Transient
	private String twitter;

	@Transient
	private String primaryPhoto;

	@Transient
	private String status;

	@Transient
	private String recordDate;

}
