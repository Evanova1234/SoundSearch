package pl.soundsearch.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.soundsearch.entity.SingleUser;
import pl.soundsearch.repository.SingleUserRepository;

public class SingleUserConverter implements Converter<String, SingleUser> {

	@Autowired
	private SingleUserRepository singleUserRepository; 
	
	public SingleUser convert(String source) { 
		
		SingleUser singleUser = singleUserRepository.findOne(Long.parseLong(source)); 		
		return singleUser;		
	}
	
}
