package model;

import controller.Trabalhavel;

public class Desenvolvedor extends Funcionario implements Trabalhavel{

	private String tecnologia;
	private Double  bonusParticipacao;
	
	
	public Desenvolvedor() {
	}

	public Desenvolvedor(String name, Integer matricula, Double salarioFixo, String tecnologia) {
		super(name, matricula, salarioFixo);
		this.tecnologia = tecnologia;
		this. bonusParticipacao = 100.0;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public Double getBonusParticipacao() {
		return bonusParticipacao;
	}

	public void setBonusParticipacao(Double bonusParticipacao) {
		this.bonusParticipacao = bonusParticipacao;
	}

	@Override
	public Double calcularSalario() {
		return salarioFixo + bonusParticipacao;
	}

	@Override
	public String trabalhar() {
		return "SIM";
	}

	@Override
	public String relatarProgresso() {
		
		return "Gerenciando progresso do estagiario";
	}

	@Override
	public String toString() {
		return "\nDados do Dev: "
			+ "\nMatricula: " + matricula
			+ "\nNome: " + name
			+ "\nTrabalho ativo: " + trabalhar()
			+ "\nProgresso: " + relatarProgresso() 
			+ "\nSalario: " + calcularSalario();
	}
}
