package pl.soundsearch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.soundsearch.entity.MusicGenre;

public interface MusicGenreRepository extends JpaRepository<MusicGenre, Long> {

	
	@Query(value = "Select * from GENRE AS GEN "
			+ "LEFT JOIN SINGLEUSER_GENRE AS SU_G ON GEN.id = SU_G.musicGenres_id "
			+ "WHERE SU_G.SingleUser_id = :userId", nativeQuery = true)   
	List<MusicGenre> findByUser(@Param("userId") Long userId); 

}
