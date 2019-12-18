package br.edu.univas.main;



import br.edu.univas.classes.Cliente;

public class AgenciaMain {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(“Camilo”, “Lopes”, 25);

		Hotel hotel = new Hotel(“Pijamas”, 150.00);

		CiaAerea ciaAerea = new CiaAerea(“VaEmbora”);

		//o facade já sabe qual hotel e ciaAerea notificar

		AgenciaFacade agencia = new AgenciaFacade(hotel, ciaAerea);

		//informando para agencia o cliente que deseja viajar

		agencia.registraViagem(cliente);

		}
	}

