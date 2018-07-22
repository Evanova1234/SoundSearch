package pl.soundsearch.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
@Table(name = "ADVERTISEMENT")

public class Advertisement {
	
	@Id
 	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id; 						// Db id
	
	private AdCategory adCategory; 			// type of ad, i.e. who seeks whom (band seeks a member etc.)
	
	@ManyToOne								// Many advertisements may be submitted by one band
	private BandUser bandUser; 				// used only if it is a single musician seeking a band 
	
	@ManyToOne								// Many advertisements may be submitted by one user
	private SingleUser singleUser; 			// used only if it is a band seeking a musician 
	
	@ManyToMany	
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Instrument> instruments;	// represents played instrument if user seeks a musician.
											// represents sought instrument if band seeks a band 
	@ManyToMany
	private List<MusicGenre> musicGenres; 	// represents genre(s) played by a musician/band
	
	private String description; 			// free text description within an advertisement 
	
	private AdStatus adStatus; 				// Advertisement's status 
	
	private Date expirationDate;		// Advertisement's expiration date 

	public Advertisement() {
		super();
	}

	public AdCategory getAdCategory() {
		return adCategory;
	}

	public void setAdCategory(AdCategory adCategory) {
		this.adCategory = adCategory;
	}

	public BandUser getBandUser() {
		return bandUser;
	}

	public void setBandUser(BandUser bandUser) {
		this.bandUser = bandUser;
	}

	public SingleUser getSingleUser() {
		return singleUser;
	}

	public void setSingleUser(SingleUser singleUser) {
		this.singleUser = singleUser;
	}

	public List<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(List<Instrument> instruments) {
		this.instruments = instruments;
	}

	public List<MusicGenre> getMusicGenres() {
		return musicGenres;
	}

	public void setMusicGenres(List<MusicGenre> musicGenres) {
		this.musicGenres = musicGenres;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AdStatus getAdStatus() {
		return adStatus;
	}

	public void setAdStatus(AdStatus adStatus) {
		this.adStatus = adStatus;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Long getId() {
		return id;
	}
	
	
	
}



