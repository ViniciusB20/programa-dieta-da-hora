
package Base;

import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class FormCaloriass extends javax.swing.JInternalFrame {

    public FormCaloriass() {
        initComponents();
        configurarFormulario();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        masculino = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        idadeValor = new javax.swing.JTextField();
        alturaValor = new javax.swing.JTextField();
        pesoValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sedentario = new javax.swing.JCheckBox();
        moderado = new javax.swing.JCheckBox();
        bemativo = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        feminino = new javax.swing.JCheckBox();
        ativo = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Peso (kg) :");

        masculino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        masculino.setText("Masculino");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel4.setText("CALCULO GASTO CALÓRICO");

        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nivel de Atividade Fisica :");

        sedentario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sedentario.setText("Sedentario");
        sedentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sedentarioActionPerformed(evt);
            }
        });

        moderado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        moderado.setText("Moderado");

        bemativo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bemativo.setText("Bem Ativo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Idade :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Sexo :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Altura (m) :");

        feminino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        feminino.setText("Feminino");
        feminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femininoActionPerformed(evt);
            }
        });

        ativo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ativo.setText("Ativo");
        ativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ativoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(feminino)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                            .addComponent(masculino)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sedentario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(moderado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ativo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bemativo))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(idadeValor, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pesoValor))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(alturaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idadeValor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(alturaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pesoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sedentario)
                    .addComponent(moderado)
                    .addComponent(bemativo)
                    .addComponent(ativo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feminino)
                    .addComponent(masculino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        double caloria = 0 ;
        
        double peso = Double.parseDouble(pesoValor.getText().replace(',', '.'));
        double altura = Double.parseDouble(alturaValor.getText().replace(',', '.'));
        double idade = Double.parseDouble(idadeValor.getText().replace(',', '.'));
        
        if(feminino.isSelected()){
           caloria = 65.5 + (9.6*peso)+(1.8*altura)-(4.7*idade);
        }else if(masculino.isSelected()){
           caloria = 66+(13.7*peso)+(5*altura)-(6.5*idade);
        }
        
        if(sedentario.isSelected()){
            caloria = caloria * 1.2 ;
        }else if(moderado.isSelected()){
            caloria = caloria * 1.3 ;
        }else if(ativo.isSelected()){
            caloria = caloria * 1.5 ; 
        }else if(bemativo.isSelected()){
            caloria = caloria * 1.7 ; 
        }
        
        JOptionPane.showMessageDialog(null, 
                String.format("Seu Gasto Calorico é: %.2f , por dia",caloria));
        
      //DESMARCAR todos os CheckBox
        for(Component comp : getContentPane().getComponents()){
            if (comp instanceof JCheckBox){
                JCheckBox chk = (JCheckBox)comp;
                chk.setSelected(false);
            }
        }

        masculino.setSelected(true);  
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void sedentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sedentarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sedentarioActionPerformed

    private void femininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femininoActionPerformed

    private void ativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ativoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alturaValor;
    private javax.swing.JCheckBox ativo;
    private javax.swing.JCheckBox bemativo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JCheckBox feminino;
    private javax.swing.JTextField idadeValor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JCheckBox masculino;
    private javax.swing.JCheckBox moderado;
    private javax.swing.JTextField pesoValor;
    private javax.swing.JCheckBox sedentario;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Calculo Calorias");
        this.setResizable(false);
       
        //Definir SELEÇÃO EXCLUSIVA nos RadioButtons
        ButtonGroup bg = new ButtonGroup();
        bg.add(feminino);
        bg.add(masculino);
        masculino.setSelected(true);
        
        this.setMaximizable(true);
        this.setClosable(true);
        this.setIconifiable(true);

    }

    private void setUndecorated(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
