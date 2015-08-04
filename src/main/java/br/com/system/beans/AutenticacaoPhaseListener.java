package br.com.system.beans;

import java.util.regex.Pattern;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class AutenticacaoPhaseListener  implements PhaseListener{

	private static final long serialVersionUID = -1916348147473800463L;
	
	private static final String RESTRICTION_PATTERN = "^/restrito/.*";
	
	public PhaseId getPhaseId(){
		return PhaseId.RESTORE_VIEW;
	}
	
	public void beforePhase(PhaseEvent event) {
	}
	
	public void afterPhase(PhaseEvent event){
		FacesContext context = event.getFacesContext();
		String viewId = context.getViewRoot().getViewId();
		boolean urlProtegida = Pattern.matches(RESTRICTION_PATTERN, viewId);
		Object usuario = context.getExternalContext().getSessionMap().get("usuarioLogado");
		if(urlProtegida && usuario == null)
		{
			NavigationHandler navigator = context.getApplication().getNavigationHandler();
			System.out.println("Erro!Usuário Não logado");
			navigator.handleNavigation(context, null, "login");
		}
	}

}
