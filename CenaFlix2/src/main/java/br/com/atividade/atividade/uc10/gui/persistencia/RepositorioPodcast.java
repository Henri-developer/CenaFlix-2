package br.com.atividade.atividade.uc10.gui.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Classe de persistência da tabela 'repositoriopodcast'
 * @author Henrique
 */
@Entity
public class RepositorioPodcast {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String produtor;
    private String nome_episodio;
    private int numero_episodio;
    private String duracao;
    private String url;
    private String status;

    // Geters and Seters  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getNome_episodio() {
        return nome_episodio;
    }

    public void setNome_episodio(String nome_episodio) {
        this.nome_episodio = nome_episodio;
    }

    public int getNumero_episodio() {
        return numero_episodio;
    }

    public void setNumero_episodio(int numero_episodio) {
        this.numero_episodio = numero_episodio;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
