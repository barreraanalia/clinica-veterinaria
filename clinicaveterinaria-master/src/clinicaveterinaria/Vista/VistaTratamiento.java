/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Vista;

import clinicaveterinaria.modelo.Cliente;
import clinicaveterinaria.modelo.Conexion;
import clinicaveterinaria.modelo.Tratamiento;
import clinicaveterinaria.modelo.TratamientoData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class VistaTratamiento extends javax.swing.JFrame {
    private DefaultTableModel modelo;
    private ArrayList<Tratamiento> listaTratamientos;
    VistaTratamiento listamascota;
    private DefaultListModel model;
    int busqueda = 0;
    private ArrayList<Cliente> clientes;

    /**
     * Creates new form VstaTratamiento
     */
    public VistaTratamiento() {
        try {
        initComponents();
         Conexion conexion = new Conexion("jdbc:mysql://localhost/clinica_veterinaria", "root", "");
            modelo=new DefaultTableModel();
            model = new DefaultListModel();
            TratamientoData trataData = new TratamientoData(conexion);
            listaTratamientos = (ArrayList<Tratamiento>)trataData.obtenerTratamiento();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
     armaCabeceraTabla();
        cargaDatos();
   armarlista ();
    }
    
    public void armarlista (){
     jTable1.setModel(modelo);    
    }
 
 public void armaCabeceraTabla(){
    
        //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("Tipo");
        columnas.add("Codigo");
        columnas.add("Descripcion");
        columnas.add("Activo");
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        jTable1.setModel(modelo);
  }
      public void borraFilasTabla(){

            int a =modelo.getRowCount()-1;
            System.out.println("Tabla "+a);
            for(int i=a;i>=0;i--){
                modelo.removeRow(i );
                System.out.println("Tabla "+i);
            }
      }
    
        public void cargaDatos(){
         
        
        for(Tratamiento m:listaTratamientos){
        
            modelo.addRow(new Object[]{m.getTipo(), m.getCodigoTratamiento(), m.getDescripcion(), m.getActivo()});
                     
        }
    }   


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonBUscarTratamiento = new javax.swing.JButton();
        jTextFieldBuscarTratamiento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );

        jLabel1.setText("Buscar Tratamiento");

        jButtonBUscarTratamiento.setText("BUSCAR");
        jButtonBUscarTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBUscarTratamientoActionPerformed(evt);
            }
        });

        jTextFieldBuscarTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarTratamientoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldBuscarTratamiento)
                .addGap(18, 18, 18)
                .addComponent(jButtonBUscarTratamiento)
                .addGap(113, 113, 113))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonBUscarTratamiento)
                    .addComponent(jTextFieldBuscarTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuscarTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarTratamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarTratamientoActionPerformed

    private void jButtonBUscarTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBUscarTratamientoActionPerformed
        // TODO add your handling code here:
        String campo = jTextFieldBuscarTratamiento.getText();
        String where = "";
      
        borraFilasTabla();
      
        if (!"".equals(campo)) {
          
            for(Tratamiento m:listaTratamientos){
                
                if (campo.equals(m.getTipo())   ){
                    
                    modelo.addRow(new Object[]{m.getTipo(), m.getCodigoTratamiento(), m.getDescripcion(), m.getActivo()});
            busqueda = m.getIdtratamiento();
                    
           
            
            }
             
        }
        }
    }//GEN-LAST:event_jButtonBUscarTratamientoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaTratamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBUscarTratamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBuscarTratamiento;
    // End of variables declaration//GEN-END:variables
}
