package com.jpa_example.demo_jpa.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jpa_example.demo_jpa.model.Users;

@Component
public interface userJpaRespository extends JpaRepository<Users, Long> {

	Users findByName(String name);

}
