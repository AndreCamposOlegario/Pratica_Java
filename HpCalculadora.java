/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Magic;

/**
 *
 * @author Lenovo
 */
public class HpCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form HpCalculadora
     */
    public HpCalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Resultado = new javax.swing.JLabel();
        Soma = new javax.swing.JButton();
        Multiplicar = new javax.swing.JButton();
        Subtra = new javax.swing.JButton();
        Dividir = new javax.swing.JButton();
        Numero1 = new javax.swing.JTextField();
        Numero2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Resto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Resultado");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 470, 80, 20);

        Resultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Resultado.setForeground(new java.awt.Color(0, 0, 0));
        Resultado.setText("0");
        getContentPane().add(Resultado);
        Resultado.setBounds(150, 470, 50, 25);

        Soma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Soma.setText("+");
        Soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SomaActionPerformed(evt);
            }
        });
        getContentPane().add(Soma);
        Soma.setBounds(80, 390, 50, 30);

        Multiplicar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Multiplicar.setText("x");
        Multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicarActionPerformed(evt);
            }
        });
        getContentPane().add(Multiplicar);
        Multiplicar.setBounds(80, 430, 50, 30);

        Subtra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Subtra.setText("-");
        Subtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtraActionPerformed(evt);
            }
        });
        getContentPane().add(Subtra);
        Subtra.setBounds(201, 390, 50, 30);

        Dividir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Dividir.setText("/");
        Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividirActionPerformed(evt);
            }
        });
        getContentPane().add(Dividir);
        Dividir.setBounds(200, 430, 50, 30);

        Numero1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero1ActionPerformed(evt);
            }
        });
        getContentPane().add(Numero1);
        Numero1.setBounds(70, 350, 64, 26);

        Numero2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero2ActionPerformed(evt);
            }
        });
        getContentPane().add(Numero2);
        Numero2.setBounds(200, 350, 64, 26);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Magic/MagicImagens/if-06-harry-potter-colour-sorting-hat-2730319_88134.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 390, 40, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Magic/MagicImagens/if-17-harry-potter-colour-potion-bottle-27303301_88180.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 340, 37, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Magic/MagicImagens/if-16-harry-potter-colour-potion-bottle-2730329_88170.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 350, 32, 32);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Magic/MagicImagens/if-13-harry-potter-colour-nimbus-2000-2730326_88179.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 430, 32, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Magic/MagicImagens/if-01-harry-potter-colour-deathly-hallows-2730314_88165.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(250, 430, 32, 32);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Magic/MagicImagens/if-36-harry-potter-colour-time-turner-2730347_88155.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 390, 32, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Magic/MagicImagens/if-19-harry-potter-colour-harrys-wand-2730332_88138.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(120, 480, 30, 40);

        Resto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Resto.setForeground(new java.awt.Color(0, 0, 0));
        Resto.setText("0");
        getContentPane().add(Resto);
        Resto.setBounds(240, 470, 30, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Resto");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 470, 34, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Magic/peakpx.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -10, 330, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero1ActionPerformed

    private void Numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero2ActionPerformed

    private void MultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicarActionPerformed
        // TODO add your handling code here:
        int n1 = Integer.parseInt(Numero1.getText());
        int n2 = Integer.parseInt(Numero2.getText());
        float Multiplicar = n1 * n2;
        Resultado.setText(Float.toString(Multiplicar));
        Resto.setText("0");
    }//GEN-LAST:event_MultiplicarActionPerformed

    private void SomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SomaActionPerformed
        // TODO add your handling code here:
        int n1 = Integer.parseInt(Numero1.getText());
        int n2 = Integer.parseInt(Numero2.getText());
        float soma = n1 + n2;
        Resultado.setText(Float.toString(soma));
        Resto.setText("0");
    }//GEN-LAST:event_SomaActionPerformed

    private void DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividirActionPerformed
        // TODO add your handling code here:
        int n1 = Integer.parseInt(Numero1.getText());
        int n2 = Integer.parseInt(Numero2.getText());
        int Dividir = n1 / n2;
        int Rest = n1 % n2;
        Resultado.setText(Float.toString(Dividir));
        Resto.setText(Float.toString(Rest));
    }//GEN-LAST:event_DividirActionPerformed

    private void SubtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtraActionPerformed
        // TODO add your handling code here:
        int n1 = Integer.parseInt(Numero1.getText());
        int n2 = Integer.parseInt(Numero2.getText());
        int Subtra = n1 - n2;
        Resultado.setText(Float.toString(Subtra));
        Resto.setText("0");
    }//GEN-LAST:event_SubtraActionPerformed

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
            java.util.logging.Logger.getLogger(HpCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HpCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HpCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HpCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HpCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dividir;
    private javax.swing.JButton Multiplicar;
    private javax.swing.JTextField Numero1;
    private javax.swing.JTextField Numero2;
    private javax.swing.JLabel Resto;
    private javax.swing.JLabel Resultado;
    private javax.swing.JButton Soma;
    private javax.swing.JButton Subtra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
