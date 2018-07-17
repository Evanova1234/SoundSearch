package pl.soundsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.soundsearch.entity.AdCategory;
import pl.soundsearch.entity.Advertisement;

@Controller
public class AdvertisementController {
	
	
	/*************************************************************************************/
	/******************************ADDING NEW ADVERTISEMENT BY BAND***********************/
	/*************************************************************************************/

	@RequestMapping(value = "/addAdvertisement", method = RequestMethod.GET)
	String addAdvertisement(Model model) { 
		
		//AdCategory adCategory = new AdCategory(); 
	
		Advertisement advertisement = new Advertisement(); 
		advertisement.setAdCategory(AdCategory.BAND_SEEKS_MUSICIAN);		
		model.addAttribute("advertisement", advertisement); 
		
		
		
		return "AdPages/AddAdBandSeeks";
		
	}
	
	

}
