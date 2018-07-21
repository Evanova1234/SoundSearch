package pl.soundsearch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pl.soundsearch.entity.BandUser;

public interface BandUserRepository extends JpaRepository<BandUser, Long>{

	@Query(value = "select * from BANDS AS BD "
					+ "LEFT JOIN BANDS_SINGLEUSER AS B_SU ON BD.id = B_SU.BandUser_id "
					+ "WHERE B_SU.bandMembers_id = :userId", nativeQuery = true)  
	List<BandUser> findByUser(@Param("userId") Long userId); 
	
	
}
