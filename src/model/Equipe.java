package model;

import java.util.List;

import controller.Trabalhavel;

public class Equipe {

	private Integer codEquipe;
	private Gerente gerente;
	private List<Trabalhavel> funcs;
	



	public Equipe(Integer codEquipe, Gerente gerente, List<Trabalhavel> funcs) {
		super();
		this.codEquipe = codEquipe;
		this.gerente = gerente;
		this.funcs = funcs;
		
	}

	public Integer getCodEquipe() {
		return codEquipe;
	}

	public void setCodEquipe(Integer codEquipe) {
		this.codEquipe = codEquipe;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public List<Trabalhavel> getFuncs() {
		return funcs;
	}

	public void setDevs(List<Trabalhavel> funcs) {
		this.funcs = funcs;
	}

	private String devsToString() {

		String txt = "\n";
		
		for (Trabalhavel temp : funcs) {
			if (temp instanceof Desenvolvedor) {
				txt += ((Desenvolvedor) temp).getName() + "\n";
			}
		}

		
		return txt;

	}
	
	private String estagiariosToString() {

		String txt = "\n";
		
		for (Trabalhavel temp : funcs) {
			if (temp instanceof Estagiario) {
				txt += ((Estagiario) temp).getName() + "\n";
			}
		}

		return txt;

	}

	@Override
	public String toString() {
		return "\nCódigo da equipe: " + codEquipe
			+ "\nGerente: " + gerente.getName()
			+ "\nLista de mebros da equipe: "
			+ "\nDesenvolvedores: " + devsToString()
			+ "\nEstagiarios: " + estagiariosToString();
	}
}
