package com.accenture.jpa.repository;

import javax.persistence.EntityManager;

import com.accenture.jpa.conexao.*;
import com.accenture.jpa.model.*;

public class CarRepository {
	private EntityManager em;
	
	public CarRepository() {
		em = JPAConexao.getEm();
	}
	
	public void incluir(Cor cor) {
		em.getTransaction().begin();
		em.persist(cor);
		em.getTransaction().commit();
	}
}
