package br.edu.univas.classes;

public class CiaAerea {
	
	private String nomeCia;

	public CiaAerea(String nomeCia) {

	super();

	this.nomeCia = nomeCia;

	}

	public String getNomeCia() {

	return nomeCia;

	}

	public void setNomeCia(String nomeCia) {

	this.nomeCia = nomeCia;

	}

	public void reservaVoo(String nome, String sobreNome) {

	System.out.println("Voo reservado na Cia" + nomeCia);

	System.out.println("para " + nome + ""  + sobreNome);

	}

}
