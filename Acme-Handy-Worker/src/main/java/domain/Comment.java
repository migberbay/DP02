
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Comment extends DomainEntity {

	//	Attributes -----------------------------------------------------------

	private String	text;


	// Constructors -----------------------------------------------------------

	public Comment() {
		super();
	}

	//	Getters and Setters ---------------------------------------------------

	public String getText() {
		return this.text;
	}

	public void setText(final String text) {
		this.text = text;
	}

}
