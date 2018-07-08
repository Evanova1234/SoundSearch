package pl.soundsearch.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.soundsearch.entity.Instrument;
import pl.soundsearch.repository.InstrumentRepository;

public class InstrumentConverter implements Converter<String, Instrument>{
	
	@Autowired
	private InstrumentRepository instruments; 
	
	public Instrument convert(String source) { 
		Instrument instrument = instruments.findOne(Long.parseLong(source));
		return instrument;
	}

}

