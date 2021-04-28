/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EP2U1;

import Control.ValidaEntrada;
import Enunciados.E23;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author TECNOLOGIA GC
 */
public class Ej23 extends javax.swing.JDialog {

    /**
     * Creates new form E2
     */
    private ValidaEntrada validador;
    private ArrayList<Estudiante> estudiantes;
    private Estudiante estudiante;
    
    public Ej23(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        validador = new ValidaEntrada();
        estudiantes = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        enunciado5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        valorCompraTextField = new javax.swing.JTextField();
        pagarNominaBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        formaPagoComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        idVendedorJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        agregarBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultadoTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ejercicios propuestos 2");

        enunciado5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        enunciado5.setText("Ver enunciado");
        enunciado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enunciado5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Forma de pago");

        valorCompraTextField.setToolTipText("");
        valorCompraTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorCompraTextFieldKeyTyped(evt);
            }
        });

        pagarNominaBtn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        pagarNominaBtn.setText("Nómina");
        pagarNominaBtn.setBorder(new javax.swing.border.MatteBorder(null));
        pagarNominaBtn.setEnabled(false);
        pagarNominaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarNominaBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setLabelFor(resultadoTextArea);
        jLabel3.setText("Ventas/Nómina");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Valor de la compra");

        formaPagoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Cheque", "Tarjeta" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("ID de Vendedor");

        idVendedorJTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idVendedorJTextFieldMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Ejercicio 3");

        agregarBtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        agregarBtn.setText("Agregar");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        resultadoTextArea.setEditable(false);
        resultadoTextArea.setColumns(20);
        resultadoTextArea.setLineWrap(true);
        resultadoTextArea.setRows(5);
        resultadoTextArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(resultadoTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(enunciado5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(idVendedorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(valorCompraTextField)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(formaPagoComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addComponent(agregarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pagarNominaBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addComponent(enunciado5)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(formaPagoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idVendedorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorCompraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pagarNominaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enunciado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enunciado5ActionPerformed
        E23 ejercicio3 = new E23(null, rootPaneCheckingEnabled);
        ejercicio3.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_enunciado5ActionPerformed

    private void pagarNominaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarNominaBtnActionPerformed
        int promedioEdades = 0, sumatoria = 0;
        int contadorHombres = 0, contadorMujeres = 0, contadorMujeresIngenieria = 0;

        for(int i = 0; i < estudiantes.size(); i++){
            if(estudiantes.get(i).getCarrera().toLowerCase()
                    .equals("ingeniería")){

                sumatoria += estudiantes.get(i).getEdad();

                if(estudiantes.get(i).getSexo().toLowerCase().equals("femenino")){
                    contadorMujeresIngenieria++;
                }
            }

            if(estudiantes.get(i).getSexo().toLowerCase().equals("masculino")){
                contadorHombres++;
            }

            if(estudiantes.get(i).getSexo().toLowerCase().equals("femenino")){
                contadorMujeres++;
            }
        }

        promedioEdades = sumatoria/estudiantes.size();

        resultadoTextArea.setText("El promedio de edad en Ingeniería es "
                +promedioEdades);
        resultadoTextArea.append("\nEl "+((contadorHombres*100)/estudiantes.size())
                +"% de los estudiantes son Hombres");
        if(contadorMujeres != 0){
            resultadoTextArea.append("\nEl "+((contadorMujeresIngenieria*100)/contadorMujeres)
                +"% de las Mujeres estudian Ingeniería");
        }else{
            resultadoTextArea.append("\nEl 0% de los Mujeres estudian Ingeniería");
        }
    }//GEN-LAST:event_pagarNominaBtnActionPerformed

    private void valorCompraTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorCompraTextFieldKeyTyped
        validador.validaNumerosInt(evt);
        if(valorCompraTextField.getText().length() > 8){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }            
    }//GEN-LAST:event_valorCompraTextFieldKeyTyped

    private void idVendedorJTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idVendedorJTextFieldMouseClicked
        idVendedorJTextField.setText("");
    }//GEN-LAST:event_idVendedorJTextFieldMouseClicked

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
//        if(valorCompraTextField.getText().isEmpty() 
//                || idVendedorJTextField.getText().isEmpty()){
//            valorCompraTextField.setText("0");
//            idVendedorJTextField.setText("SIN NOMBRE");
//            JOptionPane.showMessageDialog(null, "POR FAVOR LLENE LOS CAMPOS"
//                    ,"ADVERTENCIA",JOptionPane.ERROR_MESSAGE);
//        }else{
//            try{
//                int edad = Integer.valueOf(valorCompraTextField.getText());
//                
//                estudiante = new Estudiante(idVendedorJTextField.getText()
//                , edad, formaPagoComboBox.getSelectedItem().toString()
//                , carreraComboBox.getSelectedItem().toString());
//                
//                estudiantes.add(estudiante);
//                valorCompraTextField.setText("");
//                idVendedorJTextField.setText("");
//            }catch(NumberFormatException err){
//                JOptionPane.showMessageDialog(this, "DATO INVALIDO", "LO SENTIMOS", 
//                            JOptionPane.ERROR_MESSAGE);
//                
//                valorCompraTextField.setText("1");
//                idVendedorJTextField.setText("SIN NOMBRE");
//            }
//            
//            pagarNominaBtn.setEnabled(true);
//        }
    }//GEN-LAST:event_agregarBtnActionPerformed
                 
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
            java.util.logging.Logger.getLogger(Ej23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ej23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ej23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ej23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ej23 dialog = new Ej23(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JButton enunciado5;
    private javax.swing.JComboBox<String> formaPagoComboBox;
    private javax.swing.JTextField idVendedorJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pagarNominaBtn;
    private javax.swing.JTextArea resultadoTextArea;
    private javax.swing.JTextField valorCompraTextField;
    // End of variables declaration//GEN-END:variables
}
