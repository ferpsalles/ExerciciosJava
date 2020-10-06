package edu.fatec.sjc.lp2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Aluno {
	private Integer matricula;
	private String nome;
	private String curso;
	private Prova[] provas;
			
	public Aluno (Integer matricula, String nome, String curso) {
		provas = new Prova [4];
		this.matricula= matricula;
		this.nome=nome;
		this.curso=curso;
	}
}
