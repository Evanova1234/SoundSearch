package pl.soundsearch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.soundsearch.entity.MusicGenre;

public interface MusicGenreRepository extends JpaRepository<MusicGenre, Long> {

	
	@Query(value = "select * from GENRE AS GE "
			+ "LEFT JOIN SINGLEUSER_GENRE AS SU_G ON GE.id = SU_G.musicGenres_id"
			+ "LEFT JOIN SINGLEUSER AS SU ON SU_G.SingleUser_id = SU.id"
			+ "WHERE SU.userName = :username;", nativeQuery = true) 
	List<MusicGenre> findByUsername(@Param("username") String username); 

}
