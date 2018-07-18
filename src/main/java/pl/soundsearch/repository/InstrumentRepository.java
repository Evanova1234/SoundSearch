package pl.soundsearch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.soundsearch.entity.Instrument;

public interface InstrumentRepository extends JpaRepository<Instrument, Long> {
	@Query(value = "", nativeQuery = true) /*MISSING SQL*/ 
	List<Instrument> findInstrumentsPlayedByUser(String userName); 
	
}
