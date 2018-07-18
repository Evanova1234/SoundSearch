package pl.soundsearch.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pl.soundsearch.entity.SingleUser;
import pl.soundsearch.repository.SingleUserRepository;

@Service
public class DbUserDetailsService implements UserDetailsService {
	
	@Autowired 
	SingleUserRepository singleUserRepository; 

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SingleUser singleUser = singleUserRepository.findByUsername(username); 
		UserDetails userDetails = org.springframework.security.core.userdetails.User.builder()
				.username(singleUser.getUsername())
				.password(singleUser.getPassword())
				.roles()
				.build();
		return userDetails;
	}
}