package pl.soundsearch.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pl.soundsearch.entity.Instrument;
import pl.soundsearch.entity.MusicGenre;
import pl.soundsearch.entity.SingleUser;
import pl.soundsearch.repository.InstrumentRepository;
import pl.soundsearch.repository.MusicGenreRepository;
import pl.soundsearch.repository.SingleUserRepository;

@SuppressWarnings("deprecation")
@Controller
public class LoginController {

	@Autowired
	private SingleUserRepository singleUserRepository;


/*	@Autowired 
	private PasswordEncoder passwordEncoder;
*/
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	InstrumentRepository instrumentRepository;
	@Autowired
	MusicGenreRepository musicGenreRepository;
	
	
	@GetMapping("/login")
	public String login(Model model) {

		if (SecurityContextHolder.getContext().getAuthentication().isAuthenticated()
				&& !(SecurityContextHolder.getContext().getAuthentication() instanceof AnonymousAuthenticationToken)) {

			return "redirect:/home";
		}

		model.addAttribute(new SingleUser()); 
		return "login";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute SingleUser singleUser, BindingResult result, HttpServletRequest request) {
		if (result.hasErrors()) {
			return "redirect:/login";
		}
		
		singleUserRepository.save(singleUser);
		return "home";
	}

}
