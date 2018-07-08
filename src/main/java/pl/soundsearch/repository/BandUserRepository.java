package pl.soundsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.soundsearch.entity.BandUser;

public interface BandUserRepository extends JpaRepository<BandUser, Long>{

}
