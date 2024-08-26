package br.com.atividade.atividade.uc10.gui;

import br.com.atividade.atividade.uc10.gui.persistencia.AutenticacaoService;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtSenha = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CenaFlix");
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Login:");
        pnlPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Senha:");
        pnlPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("Entrar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 200, -1));

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setBorder(null);
        pnlPrincipal.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 302, 30));

        txtLogin.setBackground(new java.awt.Color(255, 255, 255));
        txtLogin.setBorder(null);
        pnlPrincipal.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 300, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 302, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 300, 10));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 0, 51));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CENAFLIX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(364, Short.MAX_VALUE))
        );

        pnlPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 490));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("LOGIN");
        pnlPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        int result;
        String nome = this.txtLogin.getText();
        String senha = this.txtSenha.getText();
        
        AutenticacaoService autenticacaoService = new AutenticacaoService();
        TelaCadastro telaCadastroFilme = new TelaCadastro();
        TelaListagem telaListagem = new TelaListagem();
        
        result = autenticacaoService.verificarLogin(nome, senha);
        
        try {
            /*
                Caso pare neste if o usuário será um operador com suas devidas restrições
            */
            if(result == 1) {
                JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                telaCadastroFilme.restricao = 1;

                telaCadastroFilme.setVisible(true);
                this.setVisible(false);
            } 
            /*
                Se a restrição do usuário for apenas de um 'Usuário' ele já será mandado para a tela de listagem 
                onde ele possa operar devido seu cargo 
            */
            else if(result == 2){
                JOptionPane.showMessageDialog(null, "Login bem-sucedido! \nSeu perfil é permitido"
                        + " apenas para listagens.");
                telaListagem.btnCadastrar.setVisible(false);
                telaListagem.btnExcluir.setVisible(false);

                telaListagem.setVisible(true);
                this.setVisible(false); 
            } 
            /*
                Caso pare neste else não possuirá nenhuma restrição, o usuário é um(a) administrador(a)
            */
            else {
                JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                
                telaCadastroFilme.setVisible(true);
                this.setVisible(false);
            }
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Nome de usuário ou senha incorretos.");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
