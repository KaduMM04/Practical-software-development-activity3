package model;

import controller.Trabalhavel;


public class Gerente extends Funcionario implements Trabalhavel{

	private Double bonusAnual;
	private Equipe equipe;
	

	public Gerente(String name, Integer matricula, Double salarioFixo) {
		super(name, matricula, salarioFixo);
		this.bonusAnual = 800.0;
	}


	public Equipe getEquipe() {
		return equipe;
	}


	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public Double getBonusAnual() {
		return bonusAnual;
	}
	
	public void setBonusAnual(Double bonusAnual) {
		this.bonusAnual = bonusAnual;
	}
	
	@Override
	public Double calcularSalario() {
		
		return salarioFixo + bonusAnual ;
	}

	@Override
	public String trabalhar() {
		
		return "Criaça das equipes";
	}

	@Override
	public String relatarProgresso() {
		
		return "Gerenciando os pregressos da equipe " + equipe.getCodEquipe();
	}
	
	@Override
	public String toString() {
		return "\nDados do gerente: "
			+ "\nMatricula: " + matricula
			+ "\nNome: " + name
			+ "\nEquipe: " + equipe.getCodEquipe()
			+ "\nTrabalho ativo: " + trabalhar()
			+ "\nProgresso: " + relatarProgresso()
			+ "\nSalario: " + calcularSalario();
	}
}
