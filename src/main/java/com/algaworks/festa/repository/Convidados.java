package com.algaworks.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {
	
}
