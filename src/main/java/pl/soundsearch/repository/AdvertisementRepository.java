package pl.soundsearch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.soundsearch.entity.Advertisement;
import pl.soundsearch.entity.BandUser;
import pl.soundsearch.entity.Instrument;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Long>{


}
