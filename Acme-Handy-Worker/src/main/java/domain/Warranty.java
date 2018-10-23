
package domain;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Warranty extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private String			title;
	private String			terms;
	private List<String>	laws;
	private Boolean			isDraft;


	// Constructors -----------------------------------------------------------

	public Warranty() {
		super();
	}

	//	Getters and Setters ---------------------------------------------------

	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	public String getTerms() {
		return this.terms;
	}

	public void setTerms(final String terms) {
		this.terms = terms;
	}

	@NotBlank
	public List<String> getLaws() {
		return this.laws;
	}

	public void setLaws(final List<String> laws) {
		this.laws = laws;
	}

	public Boolean getIsDraft() {
		return this.isDraft;
	}

	public void setIsDraft(final Boolean isDraft) {
		this.isDraft = isDraft;
	}
}
