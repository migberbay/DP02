package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Word extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private String word;
	private TypeWord type;

	// Constructors -----------------------------------------------------------

	public Word() {
		super();
	}

	// Getters and Setters ---------------------------------------------------

	@NotBlank
	@Column(unique = true)
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@NotBlank
	public TypeWord getType() {
		return type;
	}

	public void setType(TypeWord type) {
		this.type = type;
	}
}
