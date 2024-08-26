package br.com.atividade.atividade.uc10.gui.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 * Classe para operações de dados
 * @author Henrique
 */
public class RepositorioPodcastDAO {
    
    /**
     * Cadastro de podcast 
     * @param podcast 
     */
    public void cadastrarPodcast(RepositorioPodcast podcast) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(podcast);
            em.getTransaction().commit();
        } 
        catch(Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
    /**
     * Listagem de podcast cadastrados
     * @param produtor
     * @return podcast
     */
    public List<RepositorioPodcast> listar(String filtroProdutor) {
        EntityManager em = JPAUtil.getEntityManager();
        List podcast = null;
        try{
            String query = "SELECT r FROM RepositorioPodcast r WHERE (:produtor is null OR r.produtor LIKE :produtor)"
                    + "AND r.status = 'A' ";
            
            Query consulta = em.createQuery(query);
            
            consulta.setParameter("produtor", filtroProdutor.isEmpty() ? null : "%" + filtroProdutor + "%");
            podcast = consulta.getResultList();
        } 
        catch(Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
        return podcast;
    } 
    
    /**
     * Exclusão de podcast
     * @param id 
     */
    public void excluir(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            RepositorioPodcast rp = em.find(RepositorioPodcast.class, id);
            if(rp != null) {
                em.getTransaction().begin();
                em.remove(rp);
                em.getTransaction().commit();
            }
        } 
        catch(Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
