package pl.soundsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.soundsearch.entity.Instrument;

public interface InstrumentRepository extends JpaRepository<Instrument, Long> {

}
