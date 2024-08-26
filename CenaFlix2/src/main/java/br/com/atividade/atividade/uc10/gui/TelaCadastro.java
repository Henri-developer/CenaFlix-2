package br.com.atividade.atividade.uc10.gui;

import br.com.atividade.atividade.uc10.gui.persistencia.RepositorioPodcast;
import br.com.atividade.atividade.uc10.gui.persistencia.RepositorioPodcastDAO;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {
    
    int restricao = 0;

    public TelaCadastro() {
        initComponents();
    }
    
    public void limparCampos() {
        this.txtProdutor.setText("");
        this.txtNomeEpisodio.setText("");
        this.txtNumeroEpisodio.setText("");
        this.txtDuracao.setText("");
        this.txtURL.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnListagem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtProdutor = new javax.swing.JTextField();
        txtNomeEpisodio = new javax.swing.JTextField();
        txtNumeroEpisodio = new javax.swing.JFormattedTextField();
        txtDuracao = new javax.swing.JFormattedTextField();
        txtURL = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CenaFlix");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CENAFLIX");
        pnlPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 6, -1, -1));

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(null);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 151, 31));

        btnListagem.setBackground(new java.awt.Color(255, 255, 255));
        btnListagem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnListagem.setForeground(new java.awt.Color(0, 0, 0));
        btnListagem.setText("Ver listagem");
        btnListagem.setBorder(null);
        btnListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnListagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 151, 31));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CADASTRAR PODCAST");
        pnlPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 60, 354, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Produtor");
        pnlPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nome do Episódio");
        pnlPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("N° do Episódio");
        pnlPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Duração");
        pnlPrincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("URL do repositório");
        pnlPrincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        txtProdutor.setBackground(new java.awt.Color(255, 255, 255));
        txtProdutor.setForeground(new java.awt.Color(153, 153, 153));
        txtProdutor.setText("Digite aqui");
        txtProdutor.setBorder(null);
        txtProdutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProdutorMouseClicked(evt);
            }
        });
        pnlPrincipal.add(txtProdutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 196, 32));

        txtNomeEpisodio.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeEpisodio.setForeground(new java.awt.Color(153, 153, 153));
        txtNomeEpisodio.setText("Digite aqui");
        txtNomeEpisodio.setBorder(null);
        txtNomeEpisodio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeEpisodioMouseClicked(evt);
            }
        });
        pnlPrincipal.add(txtNomeEpisodio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 196, 32));

        txtNumeroEpisodio.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroEpisodio.setBorder(null);
        txtNumeroEpisodio.setForeground(new java.awt.Color(153, 153, 153));
        txtNumeroEpisodio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtNumeroEpisodio.setText("Digite aqui");
        txtNumeroEpisodio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNumeroEpisodioMouseClicked(evt);
            }
        });
        pnlPrincipal.add(txtNumeroEpisodio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 93, 20));

        txtDuracao.setBackground(new java.awt.Color(255, 255, 255));
        txtDuracao.setBorder(null);
        txtDuracao.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtDuracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnlPrincipal.add(txtDuracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 196, 26));

        txtURL.setBackground(new java.awt.Color(255, 255, 255));
        txtURL.setForeground(new java.awt.Color(153, 153, 153));
        txtURL.setText("Digite aqui");
        txtURL.setBorder(null);
        txtURL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtURLMouseClicked(evt);
            }
        });
        pnlPrincipal.add(txtURL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 404, 196, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 196, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 200, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 100, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 196, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 200, 10));

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        RepositorioPodcastDAO dao = new RepositorioPodcastDAO();
        RepositorioPodcast repositorioPodcast = new RepositorioPodcast();
        
        try {
            repositorioPodcast.setProdutor(txtProdutor.getText());
            repositorioPodcast.setNome_episodio(txtNomeEpisodio.getText());
            repositorioPodcast.setNumero_episodio(Integer.parseInt(txtNumeroEpisodio.getText()));
            repositorioPodcast.setDuracao(txtDuracao.getText());
            repositorioPodcast.setUrl(txtURL.getText());
            repositorioPodcast.setStatus("A");
            
            dao.cadastrarPodcast(repositorioPodcast);
            JOptionPane.showMessageDialog(null, "Podcast do produtor " + txtProdutor.getText() + 
                    " cadastrado!");
            limparCampos();
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível inserir os dados! Por favor, "
                    + "verifique valores digitados!");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed
        TelaListagem telaListagem = new TelaListagem();
        
        /*
            Se o usário for um operador, a restrição será igual a 1, então o botão de excluir da tela listagem é nulo
        */
        if(restricao == 1) {
            telaListagem.btnExcluir.setVisible(false);
            telaListagem.restricao = 1;
        }
        telaListagem.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnListagemActionPerformed

    private void txtProdutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProdutorMouseClicked
        this.txtProdutor.setText("");
    }//GEN-LAST:event_txtProdutorMouseClicked

    private void txtNomeEpisodioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeEpisodioMouseClicked
        this.txtNomeEpisodio.setText("");
    }//GEN-LAST:event_txtNomeEpisodioMouseClicked

    private void txtNumeroEpisodioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroEpisodioMouseClicked
        this.txtNumeroEpisodio.setText("");
    }//GEN-LAST:event_txtNumeroEpisodioMouseClicked

    private void txtURLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtURLMouseClicked
        this.txtURL.setText("");
    }//GEN-LAST:event_txtURLMouseClicked

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnListagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public static javax.swing.JPanel pnlPrincipal;
    private javax.swing.JFormattedTextField txtDuracao;
    private javax.swing.JTextField txtNomeEpisodio;
    private javax.swing.JFormattedTextField txtNumeroEpisodio;
    private javax.swing.JTextField txtProdutor;
    private javax.swing.JTextField txtURL;
    // End of variables declaration//GEN-END:variables
}
