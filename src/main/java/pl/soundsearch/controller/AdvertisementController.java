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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.soundsearch.entity.AdCategory;
import pl.soundsearch.entity.Advertisement;
import pl.soundsearch.entity.BandUser;
import pl.soundsearch.entity.Instrument;
import pl.soundsearch.entity.MusicGenre;
import pl.soundsearch.entity.SingleUser;
import pl.soundsearch.repository.AdvertisementRepository;
import pl.soundsearch.repository.BandUserRepository;
import pl.soundsearch.repository.InstrumentRepository;
import pl.soundsearch.repository.MusicGenreRepository;
import pl.soundsearch.repository.SingleUserRepository;

@Controller
public class AdvertisementController {
	
	@Autowired
	BandUserRepository bandUserRepository; 
	@Autowired
	SingleUserRepository singleUserRepository; 
	@Autowired
	InstrumentRepository instrumentRepository; 
	@Autowired
	MusicGenreRepository musicGenreRepository; 
	@Autowired
	AdvertisementRepository advertisementRepository; 
	
	/*************************************************************************************/
	/******************************ADDING NEW ADVERTISEMENT BY BAND***********************/
	/*************************************************************************************/

	@RequestMapping(value = "/addBandAd", method = RequestMethod.GET)
	String addBandAdv(Model model) { 
		
		//AdCategory adCategory = new AdCategory(); 

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		Advertisement advertisement = new Advertisement(); 
		advertisement.setAdCategory(AdCategory.BAND_SEEKS_MUSICIAN);		
		
		SingleUser singleUser = singleUserRepository.findByUsername(currentPrincipalName); 
		advertisement.setSingleUser(singleUser);
		List<Instrument> playedInstruments = instrumentRepository.findAll();
		model.addAttribute("playedInstruments", playedInstruments); 
		List<MusicGenre> musicGenres = musicGenreRepository.findAll(); 
		model.addAttribute("musicGenres", musicGenres); 
		model.addAttribute("advertisement", advertisement); 
		List<BandUser> bandUsers = bandUserRepository.findByUser(singleUser.getId()); 
		model.addAttribute("bandUsers", bandUsers);
		
		return "AdPages/AddBandAdvert";
		
	}
	
	
	@RequestMapping(value = "/addBandAd", method = RequestMethod.POST)
	String addBandAdv(Model model, @ModelAttribute Advertisement advertisement) { 
		
		
		advertisementRepository.save(advertisement); 
	
		
		return "Udalo sie";
		
	}
	
	
	/*************************************************************************************/
	/******************************ADDING NEW ADVERTISEMENT BY USER***********************/
	/*************************************************************************************/
	@RequestMapping(value = "/addUserAd", method = RequestMethod.GET)
	String addUserAdv(Model model) { 
		

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		SingleUser singleUser = singleUserRepository.findByUsername(currentPrincipalName); 	
		Advertisement advertisement = new Advertisement(); 
		advertisement.setAdCategory(AdCategory.MUSICIAN_SEEKS_BAND);		
		advertisement.setSingleUser(singleUserRepository.findByUsername(currentPrincipalName));
		List<Instrument> playedInstruments = instrumentRepository.findByUser(singleUser.getId()); 
		model.addAttribute("playedInstruments", playedInstruments); 
		List<MusicGenre> musicGenres = musicGenreRepository.findByUser(singleUser.getId()); 
		model.addAttribute("musicGenres", musicGenres); 
		model.addAttribute("advertisement", advertisement); 
	
		return "AdPages/AddUserAdvert";
		
	}
	
	
	@RequestMapping(value = "/addUserAd", method = RequestMethod.POST)
	String addUserAdv(Model model, @ModelAttribute Advertisement advertisement) { 
		
		
		advertisementRepository.save(advertisement); 
	
		
		return "Udalo sie";
		
	}
	
	
	
	
	@InitBinder
	public void bind(WebDataBinder binder) { 
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd"); 
		simpleDate.setLenient(true);
		binder.registerCustomEditor(Date.class, new Test(simpleDate,true));
		
	}

	
	/*************************************************************************************/
	/******************************LIST ADVERTISEMENTS************************************/
	/*************************************************************************************/
	@RequestMapping(value = "/allAdList", method = RequestMethod.GET)
	String adList(Model model) { 

		List<Advertisement> adList = advertisementRepository.findAll(); 
		model.addAttribute("adList",adList); 
		return "listAdvertisements";
		
	}
	

	
	
	

}
