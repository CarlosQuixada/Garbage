package com.br.gc.pds.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.br.gc.pds.model.Lixeiras.Lixeira;
import com.br.gc.pds.model.Rotas.Rota;

@Document(collection ="trajeto")
public class Trajeto {
	@Id
	private Long id;
	private List<Rota> rotas;
	private List<Lixeira> lixeiras;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Rota> getRotas() {
		return rotas;
	}

	public void setRotas(List<Rota> rotas) {
		this.rotas = rotas;
	}

	public List<Lixeira> getLixeiras() {
		return lixeiras;
	}

	public void setLixeiras(List<Lixeira> lixeiras) {
		this.lixeiras = lixeiras;
	}

}
