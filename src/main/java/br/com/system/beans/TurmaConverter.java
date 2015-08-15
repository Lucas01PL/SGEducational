package br.com.system.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.system.model.Turma;
import br.com.system.service.TurmaService;

@FacesConverter(value="turmaConverter")
public class TurmaConverter implements Converter{

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		if(!id.equals(""))
		{
			TurmaService turmaService = new TurmaService();
			List<Turma> turmas = new ArrayList<Turma>();
			String [] info = id.trim().split("-");
			Turma turma = null;
			turmas = turmaService.listarTodos();
			for (int i = 0; i < turmas.size(); i++) 
			{
				turma = new Turma();
				turma.setDescricao(info[0]);
				turma.setTurno(info[1]);
				if(turma.equals(turmas.get(i)))
				{
					turma = turmas.get(i);
					return turma;
				}
			}
		}
			return null;	
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		return null;
	}
	

}
