package br.com.escola.teste;

import java.sql.Connection;

import br.com.escola.conexao.Conexao;
import br.com.escola.dao.ProfessorDAO;
import br.com.escola.model.Professor;

public class ProgramaAlterar {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();

		Professor professor = new Professor();
		ProfessorDAO professordao = new ProfessorDAO(con);////////

		professor.setCurso("DS");
		professor.setNome("Thiago");
		System.out.println(professordao.modificar(professor));

		Conexao.fecharConexao(con);
	}

}
