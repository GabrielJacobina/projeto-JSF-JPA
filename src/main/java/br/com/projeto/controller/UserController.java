package br.com.projeto.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "userController")
@RequestScoped
public class UserController {

    public String botao(){
        System.out.println("FUncionou tudoooo, aprendi a coisa que mais vai facilitar minha vida");
        String teste = "Qualquer coisa";
        return teste;
    }

    private String cpf;

    public void validar() {
        if (cpf == null || "".equals(cpf)) {
            FacesContext.getCurrentInstance().addMessage("msgValidador",
                    new FacesMessage("CPF Vazio"));
        } else if (cpf.length() != 11) {
            FacesContext.getCurrentInstance().addMessage("msgValidador",
                    new FacesMessage("CPF deve ter 11 dígitos"));
        }else{
            FacesContext.getCurrentInstance().addMessage("msgValidador",
                    new FacesMessage("CPF Validado com sucesso !!"));
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
