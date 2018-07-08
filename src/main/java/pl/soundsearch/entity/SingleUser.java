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
	private LocalDate playingYears; 
	private String gear;
	private String description; 
	private String httpLink;
	
	@ManyToMany
	private List<Instrument> playedInstruments; 
	
	@ManyToMany
	private List<MusicGenre> musicGenres;

	public SingleUser() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LocalDate getPlayingYears() {
		return playingYears;
	}

	public void setPlayingYears(LocalDate playingYears) {
		this.playingYears = playingYears;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHttpLink() {
		return httpLink;
	}

	public void setHttpLink(String httpLink) {
		this.httpLink = httpLink;
	}

	public List<Instrument> getPlayedInstruments() {
		return playedInstruments;
	}

	public void setPlayedInstruments(List<Instrument> playedInstruments) {
		this.playedInstruments = playedInstruments;
	}

	public List<MusicGenre> getMusicGenres() {
		return musicGenres;
	}

	public void setMusicGenres(List<MusicGenre> musicGenres) {
		this.musicGenres = musicGenres;
	}

	public Long getId() {
		return id;
	} 
	
	
	
	
}



