
package domain;

import java.util.Calendar;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Future;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Embeddable
@Access(AccessType.PROPERTY)
public class CreditCard {

	// Attributes -------------------------------------------------------------

	private String		holder;
	private String		brand;
	private String		number;
	private Calendar	expirationMonth;
	private Calendar	expirationYear;
	private Integer		CVV;


	// Constructors -----------------------------------------------------------

	public CreditCard() {
		super();
	}

	//	Getters and Setters ---------------------------------------------------

	@NotBlank
	public String getHolder() {
		return this.holder;
	}

	public void setHolder(final String holder) {
		this.holder = holder;
	}

	@NotBlank
	public String getBrand() {
		return this.brand;
	}

	public void setBrand(final String brand) {
		this.brand = brand;
	}

	@Size(min = 16, max = 16)
	@Column(unique = true)
	public String getNumber() {
		return this.number;
	}

	public void setNumber(final String number) {
		this.number = number;
	}

	@Future
	@NotBlank
	//		@Pattern(regexp="?:0[1-9]|1[0-2])/[0-9]{2}")
	public Calendar getExpirationMonth() {
		return this.expirationMonth;
	}

	public void setExpirationMonth(final Calendar expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	@Future
	@NotBlank
	public Calendar getExpirationYear() {
		return this.expirationYear;
	}

	public void setExpirationDate(final Calendar expirationYear) {
		this.expirationYear = expirationYear;
	}

	@Range(min = 100, max = 999)
	public Integer getCVV() {
		return this.CVV;
	}

	public void setCVV(final Integer CVV) {
		this.CVV = CVV;
	}
}
