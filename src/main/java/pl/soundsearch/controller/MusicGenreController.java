package pl.soundsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.soundsearch.entity.MusicGenre;
import pl.soundsearch.repository.MusicGenreRepository;

@Controller

public class MusicGenreController {

	@Autowired
	private MusicGenreRepository musicGenreRepository; 
	
	/*************************************************************************************/
	/******************************SAVING NEW MUSIC GENRE*********************************/
	/*************************************************************************************/
		
	@RequestMapping(value = "/addGenre", method =  RequestMethod.GET)
	String addGenre(Model model) {
		MusicGenre musicGenre = new MusicGenre(); 
		List<MusicGenre> parentGenres = musicGenreRepository.findAll(); 
		model.addAttribute("parentGenres", parentGenres);
		model.addAttribute("musicGenre", musicGenre); 
		return "GenrePages/addGenre"; 
	}
	
	@RequestMapping(value = "/addGenre", method =  RequestMethod.POST)
	String addGenre(Model model, @ModelAttribute MusicGenre musicGenre) {
		musicGenreRepository.save(musicGenre); 
		return "Udalo sie"; 
	}
	
	
	
	
}
