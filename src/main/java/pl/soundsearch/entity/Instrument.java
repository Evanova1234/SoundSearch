package pl.soundsearch.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "INSTRUMENT")


public class Instrument {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; 
	private String instrument; 
	private String instrDescription;
	
	public Instrument() {
		super();
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public String getInstrDescription() {
		return instrDescription;
	}

	public void setInstrDescription(String instrDescription) {
		this.instrDescription = instrDescription;
	}

	public Long getId() {
		return id;
	} 
	
	
	
}
