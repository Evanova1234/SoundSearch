package pl.soundsearch.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="GENRE")

public class MusicGenre {
	
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; 
	
	@ManyToOne
	private MusicGenre parentGenre; 
	
	private String genreName; 
	
	private String genreDescription;

	public MusicGenre() {
		super();
	}

	public MusicGenre getParentGenre() {
		return parentGenre;
	}

	public void setParentGenre(MusicGenre parentGenre) {
		this.parentGenre = parentGenre;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

	public String getGenreDescription() {
		return genreDescription;
	}

	public void setGenreDescription(String genreDescription) {
		this.genreDescription = genreDescription;
	}

	public Long getId() {
		return id;
	}
	
	
	

}
