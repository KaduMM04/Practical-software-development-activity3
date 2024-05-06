package controller;

import java.util.ArrayList;
import java.util.List;

import model.Desenvolvedor;
import model.Estagiario;
import model.Gerente;



public class CadastroFuncionarios {

	private static List<Trabalhavel> list = new ArrayList<>();

	public static void addFunc(Trabalhavel func) {
		list.add(func);
	}

	public static List<Trabalhavel> allList() {
		return list;
	}

	public static List<Trabalhavel> getGerentes() {
		List<Trabalhavel> tempList = new ArrayList<>();

		for (Trabalhavel tempG : list) {
			if (tempG instanceof Gerente) {	
				tempList.add(tempG);
			}
		}

		return tempList;
	}

	public static List<Trabalhavel> getDevs() {
		List<Trabalhavel> tempList = new ArrayList<>();

		for (Trabalhavel tempD : list) {
			if (tempD instanceof Desenvolvedor) {
				tempList.add(tempD);
			}
		}

		return tempList;
	}

	public static List<Trabalhavel> getEstagiarios() {
		List<Trabalhavel> tempList = new ArrayList<>();

		for (Trabalhavel tempE : list) {
			if (tempE instanceof Estagiario) {
				tempList.add(tempE);
			}
		}

		return tempList;
	}
	
	public static Desenvolvedor buscar(int matricula) {

		for (Trabalhavel temP : list) {
			if ( temP instanceof Desenvolvedor && ((Desenvolvedor) temP).getMatricula().equals(matricula)) {
				return (Desenvolvedor) temP;
				}
		}
		return null;	
	}

	public static boolean excluir(int matricula) {

		for (Trabalhavel temP : list) {
			if (temP instanceof Gerente && ((Gerente) temP).getMatricula().equals(matricula) 
					|| temP instanceof Desenvolvedor && ((Desenvolvedor) temP).getMatricula().equals(matricula)
					|| temP instanceof Estagiario && ((Estagiario) temP).getMatricula().equals(matricula)) {
				
					list.remove(temP);
					return true;
				}
					
			}
	
		return false;

	}

	public static void excluirAllList() {

		list.removeAll(list);

	}

}
