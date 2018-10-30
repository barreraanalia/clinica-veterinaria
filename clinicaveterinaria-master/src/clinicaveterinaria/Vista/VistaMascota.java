/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Vista;

import clinicaveterinaria.modelo.Cliente;
import clinicaveterinaria.modelo.ClienteData;
import clinicaveterinaria.modelo.Conexion;
import clinicaveterinaria.modelo.Mascota;
import clinicaveterinaria.modelo.MascotaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author barreraanalia
 */
public class VistaMascota extends javax.swing.JFrame {
    private DefaultTableModel modelo;
    
private ArrayList<Mascota> listaMascota;
VistaMascota listamascota;  
private DefaultListModel model;
int busqueda = 0;
private ArrayList<Cliente> clientes;

    /**
     * Creates new form VistaMascota
     */
    public VistaMascota() {
        try {
            initComponents();
            Conexion conexion = new Conexion("jdbc:mysql://localhost/clinica_veterinaria", "root", "");
            modelo=new DefaultTableModel();
            model = new DefaultListModel();
            ClienteData data = new ClienteData (conexion);
            MascotaData mascotaData = new MascotaData(conexion);  
           clientes = (ArrayList) data.obtenerCliente();
            ClienteData clienteData = new ClienteData(conexion);
           listaMascota = (ArrayList<Mascota>) mascotaData.obtenerMascota();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
     armaCabeceraTabla();
        cargaDatos();
   armarlista ();
    }
public void armarlista (){
      
       
           
      
           
           
        
        
    
     jTable2.setModel(modelo);
    
    }
 
 public void armaCabeceraTabla(){
    
        //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("Especie");
        columnas.add("Raza");
        columnas.add("colorPelo");
        columnas.add("sexo");
        columnas.add("alias");
        columnas.add("fechaNacimiento");
        columnas.add("codigo");
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
         
        
        for(Mascota m:listaMascota){
        
    
         modelo.addRow(new Object[]{m.getEspecie(),m.getRaza(),m.getColorPelo(),m.getSexo(),m.getAlias(),m.getAlias(),m.getFechaNacimiento(),m.getCodigo()});
                     
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
        jLabel2 = new javax.swing.JLabel();
        TexCampo = new javax.swing.JTextField();
        jbbuscarmascota = new javax.swing.JButton();
        jbcrearmascota = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jbuscar = new javax.swing.JTextField();
        jbbuscaringreso = new javax.swing.JButton();
        jbvolveratras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jbrefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("MASCOTA");

        jLabel2.setText("BUSCAR MASCOTA");

        TexCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexCampoActionPerformed(evt);
            }
        });

        jbbuscarmascota.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jbbuscarmascota.setText("BUSCAR");
        jbbuscarmascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarmascotaActionPerformed(evt);
            }
        });

        jbcrearmascota.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jbcrearmascota.setText("CREAR MASCOTA");
        jbcrearmascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcrearmascotaActionPerformed(evt);
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

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("BUSCAR CLIENTE ");

        jbbuscaringreso.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jbbuscaringreso.setText("BUSCAR");
        jbbuscaringreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscaringresoActionPerformed(evt);
            }
        });

        jbvolveratras.setText("VOLVER ATRAS");
        jbvolveratras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbvolveratrasActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jbrefrescar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jbrefrescar.setText("REFRESCAR");
        jbrefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TexCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbbuscarmascota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jbrefrescar)
                        .addGap(18, 18, 18)
                        .addComponent(jbcrearmascota))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jbvolveratras, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbbuscaringreso)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TexCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbbuscarmascota)
                    .addComponent(jbcrearmascota)
                    .addComponent(jbrefrescar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbbuscaringreso))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jbvolveratras)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TexCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexCampoActionPerformed

    private void jbbuscarmascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarmascotaActionPerformed
        String campo = TexCampo.getText();
        String where = "";
      
        borraFilasTabla();
      
        if (!"".equals(campo)) {
          
            for(Mascota m:listaMascota){
                
                if (campo.equals(m.getAlias())   ){
                    
                    modelo.addRow(new Object[]{m.getEspecie(),m.getRaza(),m.getColorPelo(),m.getSexo(),m.getAlias(),m.getFechaNacimiento(),m.getCodigo(),m.getcliente().getId()});
            busqueda = m.getIdmascota();
                    
           
            
            }
             
        }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jbbuscarmascotaActionPerformed

    private void jbbuscaringresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscaringresoActionPerformed
        model.clear();
        String campo = jbuscar.getText();
        List<Mascota> lista = new ArrayList<>();
 for(Mascota m:listaMascota){
               
                    if (campo.equals(m.getIdmascota())){
                  
                    
                    busqueda = m.getIdmascota();    
                    for (Cliente cliente : clientes){
                    if(busqueda== cliente.getId());
                
            
            model.addElement(cliente);
}         
                    }else if (!campo.equals(m.getIdmascota()))
                    
                    
                    {
      model.clear();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jbbuscaringresoActionPerformed
}
    private void jbvolveratrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbvolveratrasActionPerformed
     FormularioMascota formulariomascota = new FormularioMascota ();
      
  formulariomascota.setVisible(true);
        VistaMascota.this.dispose();
    
// TODO add your handling code here:
    }//GEN-LAST:event_jbvolveratrasActionPerformed

    private void jbcrearmascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcrearmascotaActionPerformed
     FormularioMascota formulariomascota = new FormularioMascota ();
      
  formulariomascota.setVisible(true);
        VistaMascota.this.dispose(); 
// TODO add your handling code here:*/
    }//GEN-LAST:event_jbcrearmascotaActionPerformed

    private void jbrefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrefrescarActionPerformed
cargaDatos();
// TODO add your handling code here:
    }//GEN-LAST:event_jbrefrescarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TexCampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbbuscaringreso;
    private javax.swing.JButton jbbuscarmascota;
    private javax.swing.JButton jbcrearmascota;
    private javax.swing.JButton jbrefrescar;
    private javax.swing.JTextField jbuscar;
    private javax.swing.JButton jbvolveratras;
    // End of variables declaration//GEN-END:variables
}
