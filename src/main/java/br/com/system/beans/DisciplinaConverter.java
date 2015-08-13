package br.com.system.beans;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.system.model.Disciplina;

@FacesConverter(value="disciplinaConverter", forClass=Disciplina.class)
public class DisciplinaConverter implements Converter{

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		return null;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		return null;
	}
	

}
