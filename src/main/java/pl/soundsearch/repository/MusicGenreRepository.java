package pl.soundsearch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.soundsearch.entity.Instrument;
import pl.soundsearch.entity.MusicGenre;

public interface MusicGenreRepository extends JpaRepository<MusicGenre, Long> {
	@Query(value = "", nativeQuery = true) /*MISSING SQL*/ 
	List<MusicGenre> findGenresPlayedByUser(String userName); 
	
}
