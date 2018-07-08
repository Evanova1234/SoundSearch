package pl.soundsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.soundsearch.entity.MusicGenre;

public interface MusicGenreRepository extends JpaRepository<MusicGenre, Long> {

}
