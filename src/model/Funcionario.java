package model;

import java.util.Objects;

public abstract class Funcionario {
	
	protected String name;
	protected Integer matricula;
	protected Double salarioFixo;
	
	
	public Funcionario() {
	}

	public Funcionario(String name, Integer matricula) {
		super();
		this.name = name;
		this.matricula = matricula;
	}

	public Funcionario(String name, Integer matricula, Double salarioFixo) {
		super();
		this.name = name;
		this.matricula = matricula;
		this.salarioFixo = salarioFixo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getMatricula() {
		return matricula;
	}


	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}


	public Double getSalarioFixo() {
		return salarioFixo;
	}


	public void setSalarioFixo(Double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
	
	public abstract Double calcularSalario();

	
}
