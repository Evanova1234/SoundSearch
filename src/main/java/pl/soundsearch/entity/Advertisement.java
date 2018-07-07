package pl.soundsearch.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


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
	private List<Instrument> instruments;	// represents played instrument if user seeks a musician.
											// represents sought instrument if band seeks a band 
	@ManyToMany
	private List<MusicGenre> musicGenres; 	// represents genre(s) played by a musician/band
	
	private String description; 			// free text description within an advertisement 
	
	private AdStatus adStatus; 				// Advertisement's status 
	
	private LocalDate expirationDate;		// Advertisement's expiration date 
	
}



