
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Embeddable
@Access(AccessType.PROPERTY)
public class PersonalRecord {

	// Attributes --------------------------------------------------------------

	private String	fullName;
	private String	photo;
	private String	email;
	private String	phone;
	private String	linkedInUrl;


	// Constructors -----------------------------------------------------------

	public PersonalRecord() {
		super();
	}

	// Getters & Setters -------------------------------------------------------

	@NotBlank
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(final String fullName) {
		this.fullName = fullName;
	}

	@URL
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(final String photo) {
		this.photo = photo;
	}

	@Email
	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@Pattern(regexp = "^([+-]\\d+\\s+)?(\\([0-9]+\\)\\s+)?([\\d\\w\\s-]+)$")
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}

	@URL
	public String getLinkedInUrl() {
		return this.linkedInUrl;
	}

	public void setLinkedInUrl(final String linkedInUrl) {
		this.linkedInUrl = linkedInUrl;
	}
}
