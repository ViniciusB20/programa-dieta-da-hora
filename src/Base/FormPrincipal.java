
package Base;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;


public class FormPrincipal extends javax.swing.JFrame {

    protected static List<comida> comidas = new ArrayList<>();
    
    public FormPrincipal() {
        initComponents();
        configurarFormulario();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaTrabalho = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMedidas = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuItemIMC = new javax.swing.JMenuItem();
        menuItemCalorias = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuSobre = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuAlimentos = new javax.swing.JMenu();
        menuItemVegetal = new javax.swing.JMenuItem();
        menuItemCarbo = new javax.swing.JMenuItem();
        menuItemProteina = new javax.swing.JMenuItem();
        menuItemDoces = new javax.swing.JMenuItem();
        menuItemFastFood = new javax.swing.JMenuItem();
        menuItemBebidas = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaTrabalho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout areaTrabalhoLayout = new javax.swing.GroupLayout(areaTrabalho);
        areaTrabalho.setLayout(areaTrabalhoLayout);
        areaTrabalhoLayout.setHorizontalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );
        areaTrabalhoLayout.setVerticalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(283, 40));

        menuMedidas.setText("Opões");
        menuMedidas.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem2.setText("Meu Perfil");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuMedidas.add(jMenuItem2);

        menuItemIMC.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        menuItemIMC.setText("IMC");
        menuItemIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIMCActionPerformed(evt);
            }
        });
        menuMedidas.add(menuItemIMC);

        menuItemCalorias.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        menuItemCalorias.setText("Calorias Diárias");
        menuItemCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCaloriasActionPerformed(evt);
            }
        });
        menuMedidas.add(menuItemCalorias);
        menuMedidas.add(jSeparator1);

        menuSobre.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuMedidas.add(menuSobre);

        menuSair.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuMedidas.add(menuSair);

        jMenuBar1.add(menuMedidas);

        menuAlimentos.setText("+Alimentos");
        menuAlimentos.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N

        menuItemVegetal.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        menuItemVegetal.setText("Vegetais");
        menuItemVegetal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVegetalActionPerformed(evt);
            }
        });
        menuAlimentos.add(menuItemVegetal);

        menuItemCarbo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        menuItemCarbo.setText("Carboidratos");
        menuItemCarbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCarboActionPerformed(evt);
            }
        });
        menuAlimentos.add(menuItemCarbo);

        menuItemProteina.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        menuItemProteina.setText("Proteinas");
        menuItemProteina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProteinaActionPerformed(evt);
            }
        });
        menuAlimentos.add(menuItemProteina);

        menuItemDoces.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        menuItemDoces.setText("Doces");
        menuItemDoces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDocesActionPerformed(evt);
            }
        });
        menuAlimentos.add(menuItemDoces);

        menuItemFastFood.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        menuItemFastFood.setText("Fast Food");
        menuItemFastFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFastFoodActionPerformed(evt);
            }
        });
        menuAlimentos.add(menuItemFastFood);

        menuItemBebidas.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        menuItemBebidas.setText("Bebidas");
        menuItemBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBebidasActionPerformed(evt);
            }
        });
        menuAlimentos.add(menuItemBebidas);

        jMenuBar1.add(menuAlimentos);

        menuRelatorio.setText("Relatorio");
        menuRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem1.setText("Informações");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuRelatorio.add(jMenuItem1);

        jMenuBar1.add(menuRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalho, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIMCActionPerformed
        abrirFormulario(new FormIMC());
    }//GEN-LAST:event_menuItemIMCActionPerformed

    private void menuItemVegetalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVegetalActionPerformed
        abrirFormulario(new FormVegetais());         
    }//GEN-LAST:event_menuItemVegetalActionPerformed

    private void menuItemCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCaloriasActionPerformed
        abrirFormulario(new FormCaloriass());
    }//GEN-LAST:event_menuItemCaloriasActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        abrirFormulario(new FormSobre());
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuItemCarboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCarboActionPerformed
        abrirFormulario(new FormCarboidratos());
    }//GEN-LAST:event_menuItemCarboActionPerformed

    private void menuItemDocesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDocesActionPerformed
        abrirFormulario(new FormDoces());
    }//GEN-LAST:event_menuItemDocesActionPerformed

    private void menuItemProteinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProteinaActionPerformed
        abrirFormulario(new FormProteinas());
    }//GEN-LAST:event_menuItemProteinaActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        int resp = JOptionPane.showConfirmDialog(
            null, 
            "Deseja sair da aplicação?",
            "Registro de Notas",
            JOptionPane.YES_NO_OPTION
        );
        
        if (resp == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_menuSairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        abrirFormulario(new FormRelatorio());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuItemFastFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFastFoodActionPerformed
       abrirFormulario(new FormFastFood());
    }//GEN-LAST:event_menuItemFastFoodActionPerformed

    private void menuItemBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBebidasActionPerformed
        abrirFormulario(new FormBebidas());
    }//GEN-LAST:event_menuItemBebidasActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        abrirFormulario(new FormPerfil());
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAlimentos;
    private javax.swing.JMenuItem menuItemBebidas;
    private javax.swing.JMenuItem menuItemCalorias;
    private javax.swing.JMenuItem menuItemCarbo;
    private javax.swing.JMenuItem menuItemDoces;
    private javax.swing.JMenuItem menuItemFastFood;
    private javax.swing.JMenuItem menuItemIMC;
    private javax.swing.JMenuItem menuItemProteina;
    private javax.swing.JMenuItem menuItemVegetal;
    private javax.swing.JMenu menuMedidas;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSobre;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Controle Da Sua Dieta");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    private void abrirFormulario(JInternalFrame f) {

        if (areaTrabalho.getAllFrames().length == 0) {
            areaTrabalho.add(f);
            centralizarFormulario(f);
            f.setVisible(true);
        }else{
            JOptionPane.showConfirmDialog(
                rootPane, 
                "Você precisar fechar a janela atual antes de abrir outra.");
        }
        
    }
    
    private void centralizarFormulario(JInternalFrame f) {
        Dimension d = f.getDesktopPane().getSize();
        f.setLocation(
                (d.width - f.getSize().width) / 2,
                (d.height - f.getSize().height) / 2
        );
    }

}
