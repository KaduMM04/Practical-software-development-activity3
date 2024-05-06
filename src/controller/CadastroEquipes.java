package controller;

import java.util.ArrayList;
import java.util.List;

import model.Equipe;

public class CadastroEquipes {
	
	private static List<Equipe> equipes = new ArrayList<>();
	
	public static void cadastrarEquipe(Equipe equipe) {
		equipes.add(equipe);
	}
	
	public static List<Equipe> getListaEquipes(){
		return equipes;
	}
	
	public static Equipe buscarEquipe(int codEquipe) {
		
		for (Equipe temp : equipes) {
			
			 if (temp.getCodEquipe().equals(codEquipe)) {
				 return temp;
			 }
		}
		
		return null;
	}
}
