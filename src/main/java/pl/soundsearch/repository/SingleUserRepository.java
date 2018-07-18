package pl.soundsearch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.soundsearch.entity.Instrument;
import pl.soundsearch.entity.SingleUser;

public interface SingleUserRepository extends JpaRepository<SingleUser, Long>{

	
	SingleUser findByUserName(String userName); 
	

}
