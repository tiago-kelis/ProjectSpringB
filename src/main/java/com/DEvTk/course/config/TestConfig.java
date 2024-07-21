package com.DEvTk.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.DEvTk.course.Entities.User;
import com.DEvTk.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepositry;

	@Override
	public void run(String... args) throws Exception {
		
		User usr1 = new User(4, "Tiago Kelis", "tiaguinho _Okanxa@gmail.com", "1191521425", "12235456");
		User usr2 = new User(5, "Paulo", "paulinhodaviola@gmail.com", "115689745", "12458789666");
		
		userRepositry.saveAll(Arrays.asList(usr1, usr2));
	}
}
