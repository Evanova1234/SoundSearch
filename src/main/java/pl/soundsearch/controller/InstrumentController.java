package pl.soundsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.soundsearch.entity.Instrument;
import pl.soundsearch.repository.InstrumentRepository;

@Controller
public class InstrumentController {
	
	@Autowired
	private InstrumentRepository instrumentRepository;  
	
	/*************************************************************************************/
	/******************************SAVING NEW INSTRUMENT**********************************/
	/*************************************************************************************/
		
	@RequestMapping(value = "/addInstrument", method = RequestMethod.GET)
	String addInstrument(Model model) { 
		Instrument instrument = new Instrument(); 
		model.addAttribute("instrument", instrument); 
		return "InstrumentPages/addInstrument";		
	}
	
	@RequestMapping(value = "/addInstrument", method = RequestMethod.POST)
	public String addInstrument(Model model, @ModelAttribute Instrument instrument) {
		instrumentRepository.save(instrument); 
		return "home";
	}

	
	/*************************************************************************************/
	/******************************BROWSING INSTRUMENTS***********************************/
	/*************************************************************************************/
		
	/*************************************************************************************/
	/*****************************MODIFYING AN INSTRUMENT*********************************/
	/*************************************************************************************/
	
	
	/*************************************************************************************/
	/*****************************DELETING AN INSTRUMENT*********************************/
	/*************************************************************************************/


	
	
	
}




