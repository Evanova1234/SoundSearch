package pl.soundsearch.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.soundsearch.entity.BandUser;
import pl.soundsearch.repository.BandUserRepository;

public class BandUserConverter implements Converter<String, BandUser> {

	@Autowired
	private BandUserRepository bandUserRepository; 
	
	public BandUser convert(String source) { 
		
		BandUser bandUser = bandUserRepository.findOne(Long.parseLong(source)); 		
		return bandUser;		
	}
	
}
