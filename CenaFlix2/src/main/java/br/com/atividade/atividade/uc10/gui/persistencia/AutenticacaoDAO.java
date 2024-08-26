package br.com.atividade.atividade.uc10.gui.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

/**
 * Classe para operações de dados da tabela 'autenticacao'
 * @author Henrique
 */
public class AutenticacaoDAO {
    
    /**
     * Verifica usuário cadastrado 
     * @param nome
     * @param senha
     * @return consulta.getSingleResult();
     */
    public Autenticacao autenticar(String nome, String senha) {
        EntityManager em = JPAUtil.getEntityManager();
        
        try {
            TypedQuery<Autenticacao> consulta = em.createQuery("SELECT a FROM Autenticacao a "
                    + "WHERE a.login_name = :nome AND a.login_password = :senha", Autenticacao.class);
            consulta.setParameter("nome", nome);
            consulta.setParameter("senha", senha);
            return consulta.getSingleResult();
            
        } 
        catch(Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
