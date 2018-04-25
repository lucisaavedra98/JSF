package com.codenotfound.primefaces;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FlowEvent;
 
@ManagedBean
@ViewScoped
public class UserWizard implements Serializable {
 
    private Usuario user = new Usuario();
     
    private boolean skip;
     
    public Usuario getUser() {
        return user;
    }
 
    public void setUser(Usuario user) {
        this.user = user;
    }
     
    public void save() {  
    	CorreoVista.enviarConGMail("lucisaavedra98@gmail.com","Prueba",user.toString());
    	
        FacesMessage msg = new FacesMessage("Éxit", "Bienvenido :" + user.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public boolean isSkip() {
        return skip;
    }
 
    public void setSkip(boolean skip) {
        this.skip = skip;
    }
     
    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }
}