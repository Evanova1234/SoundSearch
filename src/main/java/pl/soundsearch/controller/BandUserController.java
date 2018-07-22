package pl.soundsearch.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.soundsearch.entity.AdCategory;
import pl.soundsearch.entity.Advertisement;
import pl.soundsearch.entity.BandUser;
import pl.soundsearch.entity.MusicGenre;
import pl.soundsearch.entity.SingleUser;
import pl.soundsearch.repository.BandUserRepository;
import pl.soundsearch.repository.MusicGenreRepository;
import pl.soundsearch.repository.SingleUserRepository;

@Controller
public class BandUserController {

	@Autowired
	SingleUserRepository singleUserRepository; 
	@Autowired 
	MusicGenreRepository musicGenreRepository; 
	@Autowired
	BandUserRepository bandUserRepository; 
	
	@RequestMapping(value = "/bandMenu", method = RequestMethod.GET)
	String bandMenu(Model model) { 
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		SingleUser singleUser = singleUserRepository.findByUsername(currentPrincipalName); 
		List<BandUser> bands = bandUserRepository.findByUser(singleUser.getId());  
		model.addAttribute("bands", bands);
		return "bandMenu"; 
		
	}
	
	@RequestMapping(value = "/addBand", method = RequestMethod.GET)
	String addBandUser(Model model) { 
		BandUser bandUser = new BandUser(); 
		List<SingleUser> bandMembers = singleUserRepository.findAll(); 
		List<MusicGenre> musicGenres = musicGenreRepository.findAll(); 
		model.addAttribute("bandUser", bandUser); 
		model.addAttribute("bandMembers", bandMembers); 
		model.addAttribute("musicGenres", musicGenres); 
		return "addBand"; 
		
	}
	
	@RequestMapping(value = "/addBand", method = RequestMethod.POST)
	public String addBandUser(Model model, @ModelAttribute BandUser bandUser) { 
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		List<SingleUser> bandMembers = new ArrayList(); 
		bandMembers.add(singleUserRepository.findByUsername(currentPrincipalName)); 
		bandUser.setBandMembers(bandMembers);
		bandUserRepository.save(bandUser); 
		return "bandMenu";
	}
	
	@RequestMapping(value = "/editBand/{id}", method = RequestMethod.GET)
	String editBandUser(Model model, @PathVariable Long id) { 
		BandUser bandUser = bandUserRepository.findOne(id); 
		List<MusicGenre> musicGenres = musicGenreRepository.findAll(); 
		model.addAttribute("bandUser", bandUser); 
		model.addAttribute("musicGenres", musicGenres); 
		return "addBand";
		
	}
	
	@RequestMapping(value = "/editBand/{id}", method = RequestMethod.POST)
	public String editBandUser(Model model, @PathVariable Long id, @ModelAttribute BandUser bandUser) { 
		
		BandUser currentBandUser = bandUserRepository.findOne(id); 
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		List<SingleUser> bandMembers = new ArrayList(); 
		bandMembers.add(singleUserRepository.findByUsername(currentPrincipalName)); 
		bandUser.setBandMembers(bandMembers);
		
		if(bandUser.getMusicGenres().isEmpty()) { 
			bandUser.setMusicGenres(currentBandUser.getMusicGenres());
		}
		
		
		bandUserRepository.save(bandUser); 
		return "home";
	}
	
	@RequestMapping(value = "/deleteBand/{id}", method = RequestMethod.GET)
	public String deleteBandUser(Model model, @PathVariable Long id) { 
		BandUser bandUser = bandUserRepository.findOne(id);
		bandUserRepository.delete(bandUser);
		return "bandMenu";
	}
	
	
	
	@InitBinder
	public void bind(WebDataBinder binder) { 
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd"); 
		simpleDate.setLenient(true);
		binder.registerCustomEditor(Date.class, new Test(simpleDate,true));
		
	}
	
}
