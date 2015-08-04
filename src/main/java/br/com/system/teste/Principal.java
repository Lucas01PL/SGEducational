package br.com.system.teste;

import java.util.Date;
import java.util.List;

import br.com.system.dao.AlunoDao;
import br.com.system.dao.Dao;
import br.com.system.model.Aluno;
import br.com.system.model.Disciplina;
import br.com.system.model.Endereco;
import br.com.system.model.Professor;
import br.com.system.model.Turma;
import br.com.system.service.AlunoService;
import br.com.system.util.EstadosBrasileiros;
import br.com.system.util.Sexo;

public class Principal {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		Dao dao = new AlunoDao();
		AlunoService alunoService = new AlunoService();
		//AlunoDao daoAluno = new AlunoDao();
		
		Turma s = new Turma();
		s.setDescricao("9º Ano");
		
		Endereco e = new Endereco();
		e.setCep(60000);
		e.setEstado(EstadosBrasileiros.CE);
		e.setLogradouro("Rua Chico Silvestre");
		e.setNumero(50);
		
		Date data = new Date();
		Aluno a = new Aluno();
		a.setDataNascimento(data);
		a.setEndereco(e);
		a.setNomeCompleto("Lucas Pereira de Lima");
		a.setSexo(Sexo.Masculino);
		a.setTelefone(88990077);
		a.setTurma(s);
		
		Professor p = new Professor();
		p.setCpf(60000000090L);
		p.setDataNascimento(data);
		p.setEndereco(e);
		p.setNomeCompleto("Gabriel Pereira");
		p.setSexo(Sexo.Masculino);
		p.setTelefone(88776677);
		
		Disciplina d = new Disciplina();
		d.setNome("História");
		//d.set(s);
		//d.setProfessor(p);
		
		
		dao.salvar(s);
		dao.salvar(e);
		dao.salvar(p);
		dao.salvar(d);
		//daoAluno.salvar(a);
		alunoService.salvar(a);
		
		System.out.println(s.toString());
		System.out.println(e.toString());
		System.out.println(a.toString());
		
		alunoService.alterar(a);
		System.out.println(a.toString());
		List<Aluno> lista = dao.listarTodos();
		System.out.println(lista.size());
	}
}
