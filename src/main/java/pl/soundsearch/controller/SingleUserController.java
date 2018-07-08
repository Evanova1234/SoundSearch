package pl.soundsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.soundsearch.entity.Instrument;
import pl.soundsearch.entity.MusicGenre;
import pl.soundsearch.entity.SingleUser;
import pl.soundsearch.repository.InstrumentRepository;
import pl.soundsearch.repository.MusicGenreRepository;
import pl.soundsearch.repository.SingleUserRepository;

@Controller
public class SingleUserController {

	@Autowired
	private InstrumentRepository instrumentRepository; 
	@Autowired
	private MusicGenreRepository musicGenreRepository; 
	@Autowired 
	private SingleUserRepository singleUserRepository; 
	
	/*************************************************************************************/
	/******************************SAVING NEW SINGLE USER*********************************/
	/*************************************************************************************/

	@RequestMapping(value = "addUser", method = RequestMethod.GET)
	public String addSingleUser(Model model) { 
		List<Instrument> playedInstruments = instrumentRepository.findAll(); 
		List<MusicGenre> musicGenres = musicGenreRepository.findAll(); 
		SingleUser singleUser = new SingleUser(); 
		model.addAttribute("playedInstruments", playedInstruments); 
		model.addAttribute("musicGenres", musicGenres); 
		model.addAttribute("singleUser", singleUser); 
		return "SingleUserPages/addUser"; 
	}
	
	@RequestMapping(value = "addUser", method = RequestMethod.POST)
	public String addSingleUser(Model model, SingleUser singleUser) { 
		
		singleUserRepository.save(singleUser); 
		return "Udalo sie";
	}
	
}
