package br.com.atividade.atividade.uc10.gui.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Classe de criação da fábrica de entidades e unidade de persistência
 * @author Henrique
 */
public class JPAUtil {
    
    private static final String PERSISTENCE_UNIT = "CenaFlix";
    
    private static EntityManager em;
    private static EntityManagerFactory fabrica; 
    
    /**
     * Criação da fábrica de entidades 
     * @return em
     */
    public static EntityManager getEntityManager() {
        if(fabrica == null || !fabrica.isOpen()) {
            fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
        
        if(em == null || !em.isOpen()) {
            em = fabrica.createEntityManager();
        }
        
        return em;
    }
    
    public static void closeEntityManager() {
        if(em.isOpen() && em != null) {
            em.close();
            fabrica.close();
        }
    }
}
