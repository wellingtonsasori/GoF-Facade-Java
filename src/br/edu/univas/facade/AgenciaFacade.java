package br.edu.univas.facade;

import br.edu.univas.classes.CiaAerea;
import br.edu.univas.classes.Cliente;
import br.edu.univas.classes.Hotel;

public class AgenciaFacade {
	private Hotel hotel;

	private CiaAerea ciaAerea;

	public AgenciaFacade(Hotel hotel, CiaAerea ciaAerea) {

	super();

	this.hotel = hotel;

	this.ciaAerea = ciaAerea;

	}

	//aqui que acontece as notificações para  as dependências

	public void registraViagem(Cliente cliente){

	this.hotel.registraReserva(cliente.getNome(),cliente.getSobreNome());

	this.ciaAerea.reservaVoo(cliente.getNome(),cliente.getSobreNome());

	}

	public Hotel getHotel() {

	return hotel;

	}

	public void setHotel(Hotel hotel) {

	this.hotel = hotel;

	}

	public CiaAerea getCiaAerea() {

	return ciaAerea;

	}

	 public void setCiaAerea(CiaAerea ciaAerea) {

	this.ciaAerea = ciaAerea;
	
	 }

}
