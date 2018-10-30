
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Box extends DomainEntity {

	// Default system boxes can't be deleted or modified

	// Attributes -----------------------------------------------------------

	private String	name;
	private Boolean	systemBox;


	// Constructors -----------------------------------------------------------

	public Box() {
		super();
	}

	// Getters and Setters ---------------------------------------------------

	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Boolean getSystemBox() {
		return this.systemBox;
	}

	public void setSystemBox(final Boolean systemBox) {
		this.systemBox = systemBox;
	}


	// Relationships ----------------------------------------------------------

	private Actor				actor;
	private Collection<Message>	messages;


	public Collection<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(final Collection<Message> messages) {
		this.messages = messages;
	}

	public Actor getActor() {
		return this.actor;
	}

	public void setActor(final Actor actor) {
		this.actor = actor;
	}

}
