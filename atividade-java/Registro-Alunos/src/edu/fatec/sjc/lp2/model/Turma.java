package edu.fatec.sjc.lp2.model;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Turma {
	private Aluno[] alunos;
	private Integer indice=0;
	
	public Turma (Integer qtdeAlunos) {
		setAlunos(new Aluno [qtdeAlunos]);
	}

	public Aluno consultarAlunoPorMatricula(Integer matricula) {
		for (int i=0;  i < (getIndice()-1); i++) {
			Aluno alunoConsultado = alunos[i];
			if (alunoConsultado.getMatricula().equals(matricula)){
				return alunoConsultado;
			}
		}
		return null;
	}
	
	public Aluno consultarAlunoPorNome(String nome) {
		for (int i=0;  i < (getIndice()-1); i++) {
			Aluno alunoConsultado = alunos[i];
			if (alunoConsultado.getNome().equals(nome)){
				return alunoConsultado;
			}
		}
		return null;
	}
	
	public Boolean incluirAluno (Aluno aluno) {
		if(consultarAlunoPorMatricula(aluno.getMatricula()) == null) {
			getAlunos()[getIndice()]= aluno;
			setIndice(getIndice()+1);
			return true;
		}
		return false;
		}	
	
	public void deletarAluno (String nome) {
		for (int i=0; i< getIndice()-1 ; i++) {
		Aluno alunoDeletado = alunos[i];
			if(alunoDeletado.getNome().equals(nome)) {
				getAlunos()[getIndice()]=alunos[i-1];
				setIndice(getIndice()-1);
			}
		}
	}
		
	@Override
	public String toString() {
		return "Turma [alunos=" + Arrays.toString(alunos) + "]";
	}
	

	
}


	

