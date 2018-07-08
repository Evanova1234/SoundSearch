package pl.soundsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.soundsearch.entity.Advertisement;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Long>{

}
