package pl.soundsearch.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.soundsearch.entity.MusicGenre;
import pl.soundsearch.repository.MusicGenreRepository;

public class MusicGenreConverter implements Converter<String, MusicGenre>{
	
	@Autowired
	private MusicGenreRepository musicGenres; 
	
	public MusicGenre convert(String source) { 
		MusicGenre musicGenre = musicGenres.findOne(Long.parseLong(source));
		return musicGenre;
	}
	
}

