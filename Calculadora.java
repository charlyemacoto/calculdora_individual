
package principal;

/**
 *
 * @author MAKOTO
 */
public class Calculadora extends javax.swing.JFrame {
  double total=0;
  String operacion="0";
 
    public Calculadora() {
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

        JB9 = new javax.swing.JButton();
        JB8 = new javax.swing.JButton();
        JB7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        JB5 = new javax.swing.JButton();
        JB6 = new javax.swing.JButton();
        JB1 = new javax.swing.JButton();
        JB2 = new javax.swing.JButton();
        JB3 = new javax.swing.JButton();
        JB0 = new javax.swing.JButton();
        JBLIMPIAR = new javax.swing.JButton();
        JB4 = new javax.swing.JButton();
        JBMENOR = new javax.swing.JButton();
        JBSUMA = new javax.swing.JButton();
        JB12 = new javax.swing.JButton();
        JBMUlt = new javax.swing.JButton();
        JLBOPERACION = new javax.swing.JLabel();
        JLBRESPUESTA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JB9.setText("9");
        JB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB9ActionPerformed(evt);
            }
        });

        JB8.setText("8");
        JB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB8ActionPerformed(evt);
            }
        });

        JB7.setText("7");
        JB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB7ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        JB5.setText("5");
        JB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB5ActionPerformed(evt);
            }
        });

        JB6.setText("6");
        JB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB6ActionPerformed(evt);
            }
        });

        JB1.setText("1");
        JB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB1ActionPerformed(evt);
            }
        });

        JB2.setText("2");
        JB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB2ActionPerformed(evt);
            }
        });

        JB3.setText("3");
        JB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB3ActionPerformed(evt);
            }
        });

        JB0.setText("0");
        JB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB0ActionPerformed(evt);
            }
        });

        JBLIMPIAR.setText("C");
        JBLIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLIMPIARActionPerformed(evt);
            }
        });

        JB4.setText("=");
        JB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB4ActionPerformed(evt);
            }
        });

        JBMENOR.setText("-");
        JBMENOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMENORActionPerformed(evt);
            }
        });

        JBSUMA.setText("+");
        JBSUMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSUMAActionPerformed(evt);
            }
        });

        JB12.setText("/");
        JB12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB12ActionPerformed(evt);
            }
        });

        JBMUlt.setText("x");
        JBMUlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMUltActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBRESPUESTA, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBOPERACION, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JB5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JB6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBMUlt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JB7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JB8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JB9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JB12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JB1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JB2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JB3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBMENOR, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(JBLIMPIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JB0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JB4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBSUMA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(JLBOPERACION, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLBRESPUESTA, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBMUlt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBMENOR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBLIMPIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSUMA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB6ActionPerformed
     JLBRESPUESTA.setText("6");
    }//GEN-LAST:event_JB6ActionPerformed

    private void JB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB3ActionPerformed
       JLBRESPUESTA.setText("3");
    }//GEN-LAST:event_JB3ActionPerformed

    private void JB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB1ActionPerformed
    JLBRESPUESTA.setText("1");
    }//GEN-LAST:event_JB1ActionPerformed

    private void JB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB2ActionPerformed
     JLBRESPUESTA.setText("2");
    }//GEN-LAST:event_JB2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JLBRESPUESTA.setText("4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void JB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB5ActionPerformed
          JLBRESPUESTA.setText("5");
    }//GEN-LAST:event_JB5ActionPerformed

    private void JB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB7ActionPerformed
         JLBRESPUESTA.setText("7");
    }//GEN-LAST:event_JB7ActionPerformed

    private void JB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB8ActionPerformed
       JLBRESPUESTA.setText("8");
    }//GEN-LAST:event_JB8ActionPerformed

    private void JB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB9ActionPerformed
       JLBRESPUESTA.setText("9");
    }//GEN-LAST:event_JB9ActionPerformed

    private void JB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB0ActionPerformed
       JLBRESPUESTA.setText("0");
    }//GEN-LAST:event_JB0ActionPerformed

    private void JBLIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLIMPIARActionPerformed
      JLBRESPUESTA.setText("");
     JLBOPERACION.setText("");
    }//GEN-LAST:event_JBLIMPIARActionPerformed

    private void JB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB4ActionPerformed
      String totalString;
       int numero1=Integer.parseInt(this.JLBRESPUESTA.getText());
       JLBOPERACION.setText(JLBOPERACION.getText()+" "+JLBRESPUESTA.getText());
       if(operacion.equals("+")){
           total=total+numero1;
       }else  if(operacion.equals("-")){
           total=total-numero1;
       }else  if(operacion.equals("*")){
           total=total*numero1;
       }else  if(operacion.equals("/")){
           total=total/numero1;
       }
      totalString = String.valueOf(total);
     JLBRESPUESTA.setText(totalString);  
     
    }//GEN-LAST:event_JB4ActionPerformed

    private void JBMENORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMENORActionPerformed
     JLBOPERACION.setText(JLBRESPUESTA.getText()+"  -");
     String numero=JLBRESPUESTA.getText();
     System.out.println(numero);
    double numero1=Double.parseDouble(numero);
     System.out.println(numero1);  
     total=numero1;
     operacion="-";
     System.out.println(operacion);
    }//GEN-LAST:event_JBMENORActionPerformed

    private void JBSUMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSUMAActionPerformed
     JLBOPERACION.setText(JLBRESPUESTA.getText()+"  +");
     String numero=JLBRESPUESTA.getText();
     System.out.println(numero);
     double numero1=Double.parseDouble(numero);
     System.out.println(numero1);  
     total=numero1;
     operacion="+";
        System.out.println(operacion);
    }//GEN-LAST:event_JBSUMAActionPerformed

    private void JB12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB12ActionPerformed
 JLBOPERACION.setText(JLBRESPUESTA.getText()+"  /");
     String numero=JLBRESPUESTA.getText();
     System.out.println(numero);
      double numero1=Double.parseDouble(numero);
     System.out.println(numero1);  
     total=numero1;
     operacion="/";
     System.out.println(operacion); 
    }//GEN-LAST:event_JB12ActionPerformed

    private void JBMUltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMUltActionPerformed
    JLBOPERACION.setText(JLBRESPUESTA.getText()+"  *");
     String numero=JLBRESPUESTA.getText();
     System.out.println(numero);
   double numero1=Double.parseDouble(numero);
     System.out.println(numero1);  
     total=numero1;
     operacion="*";
     System.out.println(operacion);
    }//GEN-LAST:event_JBMUltActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB0;
    private javax.swing.JButton JB1;
    private javax.swing.JButton JB12;
    private javax.swing.JButton JB2;
    private javax.swing.JButton JB3;
    private javax.swing.JButton JB4;
    private javax.swing.JButton JB5;
    private javax.swing.JButton JB6;
    private javax.swing.JButton JB7;
    private javax.swing.JButton JB8;
    private javax.swing.JButton JB9;
    private javax.swing.JButton JBLIMPIAR;
    private javax.swing.JButton JBMENOR;
    private javax.swing.JButton JBMUlt;
    private javax.swing.JButton JBSUMA;
    private javax.swing.JLabel JLBOPERACION;
    private javax.swing.JLabel JLBRESPUESTA;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
