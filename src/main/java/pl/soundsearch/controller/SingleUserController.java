package pl.soundsearch.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
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

	@RequestMapping(value = "/editUser", method = RequestMethod.GET)
	public String addSingleUser(Model model) { 
		List<Instrument> playedInstruments = instrumentRepository.findAll(); 
		List<MusicGenre> musicGenres = musicGenreRepository.findAll(); 
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();		
		SingleUser singleUser = singleUserRepository.findByUsername(currentPrincipalName); 
		model.addAttribute("playedInstruments", playedInstruments); 
		model.addAttribute("musicGenres", musicGenres); 
		model.addAttribute("singleUser", singleUser); 
		return "editUser"; 
	}
	
	@RequestMapping(value = "/editUser", method = RequestMethod.POST)
	public String addSingleUser(Model model, @ModelAttribute SingleUser singleUser) { 
	
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();		
		SingleUser currentUserSetup = singleUserRepository.findByUsername(currentPrincipalName); 
		
		if(singleUser.getMusicGenres().isEmpty()) { 
			singleUser.setMusicGenres(currentUserSetup.getMusicGenres());
		}
		if(singleUser.getPlayedInstruments().isEmpty()) { 
			singleUser.setPlayedInstruments(currentUserSetup.getPlayedInstruments());
		}
		
		singleUserRepository.save(singleUser); 
		return "home";
	}
	
	@InitBinder
	public void bind(WebDataBinder binder) { 
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd"); 
		simpleDate.setLenient(true);
		binder.registerCustomEditor(Date.class, new Test(simpleDate,true));
		
	}
	
	
/*	@InitBinder
	public void dataBinding(WebDataBinder binder) {
		binder.addValidators(userValidator, emailValidator);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(dateFormat, true));
	} 
	*/
}
