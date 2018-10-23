
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;

import org.hibernate.annotations.CascadeType;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Curricula extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private String			ticker;
	private PersonalRecord	personalRecord;


	// Constructors -----------------------------------------------------------

	public Curricula() {
		super();
	}

	// Getters & Setters -------------------------------------------------------

	@NotBlank
	@Column(unique = true)
	@DateTimeFormat(pattern = "YYMMDD-WWWW")
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	@Valid
	public PersonalRecord getPersonalRecord() {
		return this.personalRecord;
	}

	public void setPersonalRecord(final PersonalRecord personalRecord) {
		this.personalRecord = personalRecord;
	}


	// Relationships ----------------------------------------------------------

	private Collection<EducationRecord>		educationalRecords;
	private Collection<MiscellaneousRecord>	miscellaneousRecords;
	private Collection<ProfessionalRecord>	professionalRecords;
	private Collection<EndorserRecord>		endorserRecords;
	private HandyWorker						handyWorker;


	@OneToMany(cascade = CascadeType.ALL)
	@Valid
	@ElementCollection
	public Collection<EducationRecord> getEducationalRecords() {
		return this.educationalRecords;
	}

	public void setEducationalRecords(final Collection<EducationRecord> educationalRecords) {
		this.educationalRecords = educationalRecords;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@Valid
	@ElementCollection
	public Collection<MiscellaneousRecord> getMiscellaneousRecords() {
		return this.miscellaneousRecords;
	}

	public void setMiscellaneousRecords(final Collection<MiscellaneousRecord> miscellaneousRecords) {
		this.miscellaneousRecords = miscellaneousRecords;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@Valid
	@ElementCollection
	public Collection<ProfessionalRecord> getProfessionalRecords() {
		return this.professionalRecords;
	}

	public void setProfessionalRecords(final Collection<ProfessionalRecord> professionalRecords) {
		this.professionalRecords = professionalRecords;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@Valid
	@ElementCollection
	public Collection<EndorserRecord> getEndorserRecords() {
		return this.endorserRecords;
	}

	public void setEndorserRecords(final Collection<EndorserRecord> endorserRecords) {
		this.endorserRecords = endorserRecords;
	}

	@OneToOne
	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

}
