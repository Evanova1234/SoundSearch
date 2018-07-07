package pl.soundsearch.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SINGLEUSER")

public class SingleUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; 
	private String firstName; 
	private String lastName; 
	private LocalDate birthDate; 
	private String city; 
	private Long playingYears; 
	private String gear;
	private String Description; 
	private String httpLink;
	
	@ManyToMany
	private List<Instrument> playedInstruments; 
	
	@ManyToMany
	private List<MusicGenre> musicGenres; 
	
	
	
	
}



