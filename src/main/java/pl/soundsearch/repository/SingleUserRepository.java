package pl.soundsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.soundsearch.entity.SingleUser;

public interface SingleUserRepository extends JpaRepository<SingleUser, Long>{

	
	SingleUser findByUserName(String userName); 
	
}
