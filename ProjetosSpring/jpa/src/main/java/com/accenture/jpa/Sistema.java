package com.accenture.jpa;

import com.accenture.jpa.conexao.*;
import com.accenture.jpa.model.*;
import com.accenture.jpa.repository.*;

public class Sistema {
	public static void main(String[] args) {
		JPAConexao.getEm();
		
		Cor cor = new Cor();
		cor.setNome("AZUL");
		CarRepository cr = new CarRepository();
		cr.incluir(cor);
	}
}