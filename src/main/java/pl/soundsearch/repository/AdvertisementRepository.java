package pl.soundsearch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pl.soundsearch.entity.Advertisement;
import pl.soundsearch.entity.BandUser;
import pl.soundsearch.entity.Instrument;
import pl.soundsearch.entity.MusicGenre;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Long>{

	@Query(value = "Select * from ADVERTISEMENT where adCategory = 0", nativeQuery = true)
	List<Advertisement> findWhereMusicianSeeksBand(); 
	
	@Query(value = "Select * from ADVERTISEMENT where adCategory = 1", nativeQuery = true)
	List<Advertisement> findWhereBandSeeksMusician(); 

}
