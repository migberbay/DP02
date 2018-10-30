
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Word extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private String	word;
	private String	type;


	// Constructors -----------------------------------------------------------

	public Word() {
		super();
	}

	// Getters and Setters ---------------------------------------------------

	@NotBlank
	@Column(unique = true)
	public String getWord() {
		return this.word;
	}

	public void setWord(final String word) {
		this.word = word;
	}

	@NotBlank
	@Pattern(regexp = "^SPAM|POSITIVE|NEGATIVE$")
	public String getType() {
		return this.type;
	}

	public void setType(final String type) {
		this.type = type;
	}
}
