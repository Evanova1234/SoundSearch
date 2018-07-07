package pl.soundsearch.entity;

import java.time.LocalDate;
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
	
	private LocalDate creationDate; 
	
	@ManyToMany
	private List<SingleUser> bandMembers; 
	
	private String bandDescription; 
	
	@ManyToMany
	private List<MusicGenre> bandGenres; 
	
	private String httpLink;
	
	private String city; 
	
	
}
