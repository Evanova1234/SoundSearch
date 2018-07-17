package pl.soundsearch.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BANDS")


public class BandUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	private String bandName; 
	
	private Date creationDate; 
	
	@ManyToMany
	private List<SingleUser> bandMembers; 
	
	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public List<SingleUser> getBandMembers() {
		return bandMembers;
	}

	public void setBandMembers(List<SingleUser> bandMembers) {
		this.bandMembers = bandMembers;
	}

	public String getBandDescription() {
		return bandDescription;
	}

	public void setBandDescription(String bandDescription) {
		this.bandDescription = bandDescription;
	}

	public List<MusicGenre> getMusicGenres() {
		return musicGenres;
	}

	public void setMusicGenres(List<MusicGenre> musicGenres) {
		this.musicGenres = musicGenres;
	}

	public String getHttpLink() {
		return httpLink;
	}

	public void setHttpLink(String httpLink) {
		this.httpLink = httpLink;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	private String bandDescription; 
	
	@ManyToMany
	private List<MusicGenre> musicGenres; 
	
	private String httpLink;
	
	private String city;

	public BandUser() {
		super();
	}

	
	
	
}
