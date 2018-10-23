
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Actor extends DomainEntity {

	//	Attributes -----------------------------------------------------------

	private String	name;
	private String	surname;
	private String	middleName;
	private String	photo;
	private String	email;
	private String	phone;
	private String	address;


	// Constructors -----------------------------------------------------------

	public Actor() {
		super();
	}

	//	Getters and Setters ---------------------------------------------------

	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@NotBlank
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

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

	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}


	// Relationships ----------------------------------------------------------

	private Collection<Box>	boxes;


	public Collection<Box> getBoxes() {
		return this.boxes;
	}

	public void setBoxes(final Collection<Box> boxes) {
		this.boxes = boxes;
	}

}
