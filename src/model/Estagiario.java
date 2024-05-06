package model;

import controller.Trabalhavel;

public class Estagiario extends Funcionario implements Trabalhavel{

	private Desenvolvedor supervisor;
	private Integer numHoras;
	private Double valorH;
	
	public Estagiario() {
	}
	
	public Estagiario(String name, Integer matricula, Double salarioFixo, Desenvolvedor supervisor, Integer numHoras,
			Double valorH) {
		super(name, matricula, salarioFixo);
		this.supervisor = supervisor;
		this.numHoras = numHoras;
		this.valorH = valorH;
	}

	public Desenvolvedor getSupervisor() {
		return supervisor;
	}

	public void setDesenvolvedor(Desenvolvedor supervisor) {
		this.supervisor = supervisor;
	}

	public Integer getNumHoras() {
		return numHoras;
	}

	public void NumHoras(Integer numHoras) {
		this.numHoras = numHoras;
	}

	
	@Override
	public Double calcularSalario() {
		return numHoras * valorH + salarioFixo;
	}

	@Override
	public String trabalhar() {
		// TODO Auto-generated method stub
		return "SIM";
	}

	@Override
	public String relatarProgresso() {
		return "Revisão de estruturas de codigo do supervisor";
	}


	@Override
	public String toString() {
		return "\nDados do estagiario: "
			+ "\nMatricula: " + matricula
			+ "\nNome: " + name
			+ "\nSupervisor: " + supervisor.getName()
			+ "\nTrabalho ativo: " + trabalhar()
			+ "\nProgresso: " + relatarProgresso() 
			+ "\nSalario: " + calcularSalario();
	}
}
