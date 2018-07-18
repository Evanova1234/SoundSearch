package pl.soundsearch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.soundsearch.entity.BandUser;

public interface BandUserRepository extends JpaRepository<BandUser, Long>{
/*
	@Query(value = "", nativeQuery = true) MISSING SQL 
	List<BandUser> findByUser(String userName); 
	
	*/
	
}
