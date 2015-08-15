package br.com.system.beans;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.system.model.Disciplina;
import br.com.system.service.DisciplinaService;

@FacesConverter(value="disciplinaConverter")
public class DisciplinaConverter implements Converter{

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		DisciplinaService discService = new DisciplinaService();
		Disciplina disciplina = new Disciplina();
		disciplina.setId(Integer.valueOf(id));
		disciplina = discService.buscarId(disciplina);
		if(disciplina != null)
		{
			return disciplina;
		}
		else
		{
			return null;	
		}
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		return null;
	}
	

}
