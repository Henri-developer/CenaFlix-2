package br.com.atividade.atividade.uc10.gui.persistencia;

import javax.swing.JOptionPane;

/**
 * Classe verificação de restrição de usuários 
 * @author Henrique
 */
public class AutenticacaoService {
    
    /**
     * Verifica restrição do usuário 
     * @param nome
     * @param senha
     * @return result
     */
    public int verificarLogin(String nome, String senha) {
        int result = 0;
        AutenticacaoDAO autenticacaoDAO = new AutenticacaoDAO();
        
        Autenticacao autenticacao = autenticacaoDAO.autenticar(nome, senha);
        
        if(autenticacao != null) {
            JOptionPane.showMessageDialog(null, "Olá " + autenticacao.getLogin_name() + 
                    ", sua permissão é de " + autenticacao.getLogin_tipo() + ". Seja bem-vindo");
        }
        
        /*
            Conforme o resultado desta verificação, os usuários possuirá suas devidas restrições
        */
        if(autenticacao.getLogin_tipo().equals("Operador")) {
            result = 1;
        } else if(autenticacao.getLogin_tipo().equals("Usuário")) {
            result = 2;
        }
        
        return result;
    }
}
