package pl.soundsearch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pl.soundsearch.entity.Instrument;

public interface InstrumentRepository extends JpaRepository<Instrument, Long> {
	
	@Query(value = "select * from INSTRUMENT AS INS "
					+ "LEFT JOIN SINGLEUSER_INSTRUMENT AS SU_I ON INS.id = SU_I.playedInstruments_id "
					+ "WHERE SU_I.SingleUser_id = :userId", nativeQuery = true) 
	List<Instrument> findByUser(@Param("userId") Long userId); 
	
}
