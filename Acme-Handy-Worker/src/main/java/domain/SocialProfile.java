
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class SocialProfile extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private String	nick;
	private String	socialNetwork;
	private String	link;


	// Constructors -----------------------------------------------------------

	public SocialProfile() {
		super();
	}

	//	Getters and Setters ---------------------------------------------------

	@NotBlank
	public String getNick() {
		return this.nick;
	}

	public void setNick(final String nick) {
		this.nick = nick;
	}

	@NotBlank
	public String getSocialNetwork() {
		return this.socialNetwork;
	}

	public void setSocialNetwork(final String socialNetwork) {
		this.socialNetwork = socialNetwork;
	}

	@URL
	public String getLink() {
		return this.link;
	}

	public void setLink(final String link) {
		this.link = link;
	}


	// Relationships ----------------------------------------------------------

	private Actor	actor;


	@ManyToOne(optional = false)
	public Actor getActor() {
		return this.actor;
	}

	public void setActor(final Actor actor) {
		this.actor = actor;
	}

}
