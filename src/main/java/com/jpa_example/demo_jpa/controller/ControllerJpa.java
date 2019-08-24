package com.jpa_example.demo_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa_example.demo_jpa.model.Users;
import com.jpa_example.demo_jpa.respository.userJpaRespository;

@RestController
@RequestMapping("/")
public class ControllerJpa {
	@Autowired
	private userJpaRespository userJpaRespository;

	@GetMapping(value = "/all")
	public List<Users> findAll() {
		System.out.println("WELCOME");
		return userJpaRespository.findAll();
	}

	@GetMapping(value = "/{name}")
	public Users findbyName(@PathVariable final String name) {
		return userJpaRespository.findByName(name);
	}
   @PostMapping(value ="/load")
   public Users load(@RequestBody final Users users)
   {
	   userJpaRespository.save(users);
	   return userJpaRespository.findByName(users.getName());
   }
}
