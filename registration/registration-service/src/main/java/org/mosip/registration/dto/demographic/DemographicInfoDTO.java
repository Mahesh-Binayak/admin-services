package org.mosip.registration.dto.demographic;

import java.util.Date;

import org.mosip.registration.dto.BaseDTO;

/**
 * This class used to capture the Demographic details of the Individual
 * 
 * @author Dinesh Asokan
 * @since 1.0.0
 */
public class DemographicInfoDTO extends BaseDTO {
	private String fullName;
	private Date dateOfBirth;
	private String gender;
	private AddressDTO addressDTO;
	private String emailId;
	private String mobile;
	private String languageCode;
	private boolean isChild;

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName
	 *            the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the addressDTO
	 */
	public AddressDTO getAddressDTO() {
		return addressDTO;
	}

	/**
	 * @param addressDTO
	 *            the addressDTO to set
	 */
	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the languageCode
	 */
	public String getLanguageCode() {
		return languageCode;
	}

	/**
	 * @param languageCode
	 *            the languageCode to set
	 */
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	/**
	 * @return the isChild
	 */
	public boolean isChild() {
		return isChild;
	}

	/**
	 * @param isChild
	 *            the isChild to set
	 */
	public void setChild(boolean isChild) {
		this.isChild = isChild;
	}

}
