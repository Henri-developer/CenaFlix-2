package br.com.atividade.atividade.uc10.gui.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Classe de persistência da tabela 'autenticacao'
 * @author Henrique
 */
@Entity
public class Autenticacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String login_name;
    private String login_password;
    private String login_tipo;

    // Geters and Seters  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getLogin_password() {
        return login_password;
    }

    public void setLogin_password(String login_password) {
        this.login_password = login_password;
    }

    public String getLogin_tipo() {
        return login_tipo;
    }

    public void setLogin_tipo(String login_tipo) {
        this.login_tipo = login_tipo;
    }
}
