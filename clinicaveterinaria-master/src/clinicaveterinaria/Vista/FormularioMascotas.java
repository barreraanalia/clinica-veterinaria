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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author barreraanalia
 */
public class FormularioMascotas extends javax.swing.JFrame {
    
   private MascotaData mascotaData;
   private Conexion conexion;

    /**
     * Creates new form FormularioMascotas
     */
    public FormularioMascotas() {
        initComponents();
        
        try {
        conexion = new Conexion("jdbc:mysql://localhost/clinica_veterinaria", "root", "");
        mascotaData = new MascotaData(conexion);
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(FormularioMascotas.class.getName()).log(Level.SEVERE, null, ex);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1guardar = new javax.swing.JButton();
        jButton2actualizar = new javax.swing.JButton();
        jButton3borrar = new javax.swing.JButton();
        jButton4limpiar = new javax.swing.JButton();
        jButton5buscar = new javax.swing.JButton();
        jButton6listarmascota = new javax.swing.JButton();
        jButton5salir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jidCliente = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jtespecie = new javax.swing.JTextField();
        jtraza = new javax.swing.JTextField();
        jtcolorPelo = new javax.swing.JTextField();
        jtsexo = new javax.swing.JTextField();
        jtalias = new javax.swing.JTextField();
        jtfechaNacimiento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtcodigo = new javax.swing.JTextField();
        jtidcliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(153, 102, 0));

        jLabel1.setBackground(new java.awt.Color(153, 102, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("-MASCOTA-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText(" ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("ESPECIE");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("RAZA");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("COLOR DE PELO");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("ALIAS");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("FECHA DE NACIMIENTO");

        jButton1guardar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1guardar.setText("Guardar");
        jButton1guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1guardarActionPerformed(evt);
            }
        });

        jButton2actualizar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2actualizar.setText("Actualizar");
        jButton2actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2actualizarActionPerformed(evt);
            }
        });

        jButton3borrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3borrar.setText("Borrar");
        jButton3borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3borrarActionPerformed(evt);
            }
        });

        jButton4limpiar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4limpiar.setText("Limpiar");
        jButton4limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4limpiarActionPerformed(evt);
            }
        });

        jButton5buscar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton5buscar.setText("Buscar");
        jButton5buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5buscarActionPerformed(evt);
            }
        });

        jButton6listarmascota.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton6listarmascota.setText("Listar Mascotas");
        jButton6listarmascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6listarmascotaActionPerformed(evt);
            }
        });

        jButton5salir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton5salir.setText("Salir");
        jButton5salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5salirActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("SEXO");

        jidCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jidCliente.setText("CLIENTE");

        jtalias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtaliasActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("CODIGO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jButton3borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4limpiar)
                        .addGap(54, 54, 54)
                        .addComponent(jButton5salir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addComponent(jtespecie, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtalias, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtraza, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jButton1guardar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2actualizar)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtsexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addComponent(jtcolorPelo, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGap(325, 325, 325)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton5buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jButton6listarmascota, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jButton6listarmascota, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jtespecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtalias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jtraza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtcolorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5salir)
                    .addComponent(jButton4limpiar)
                    .addComponent(jButton3borrar)
                    .addComponent(jButton2actualizar)
                    .addComponent(jButton1guardar))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6listarmascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6listarmascotaActionPerformed
        // TODO add your handling code here:
        VistaMascota listamascota = new VistaMascota();
    
        listamascota.setVisible(true);
     FormularioMascotas.this.dispose();
    }//GEN-LAST:event_jButton6listarmascotaActionPerformed

    private void jButton5buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5buscarActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(jTextID.getText());
        
        Mascota mascota= mascotaData.buscarMascota(id);
        if(mascota!=null){
                jTextID.setText(mascota.getIdmascota()+"");
                jtespecie.setText(mascota.getEspecie());
                jtraza.setText(mascota.getRaza());
                jtcolorPelo.setText(mascota.getColorPelo());
                jtsexo.setText(mascota.getSexo());
                jtalias.setText(mascota.getAlias());
                jtfechaNacimiento.setText(mascota.getFechaNacimiento().toString());
                jtcodigo.setText(mascota.getCodigo()+"");
                List <Cliente> clientes = new ArrayList <>();
                ClienteData clientedata= new ClienteData(conexion);
                clientes = clientedata.obtenerCliente();
                int busqueda= mascota.getcliente().getId();
                for (Cliente cliente : clientes)
                if (cliente.getId() == busqueda){
                jtidcliente.setText  ( cliente.getNombreApellido());
                }
             //   jtidcliente.setText(mascota.getcliente().getId()+"");
        }
                
    }//GEN-LAST:event_jButton5buscarActionPerformed

    private void jButton2actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2actualizarActionPerformed
        // TODO add your handling code here:
        if (jTextID.getText()!=null){
            String especie=jtespecie.getText();
            String raza=jtraza.getText();
            String colorPelo=jtcolorPelo.getText();
            String sexo=jtsexo.getText();
            String alias=jtalias.getText();
            LocalDate fechaNacimiento = LocalDate.parse(jtfechaNacimiento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            String codigo=jtcodigo.getText();
            int cliente=Integer.parseInt(jtidcliente.getText());
            Cliente clientes = new Cliente();
            clientes.setId(cliente);
            
            Mascota mascota=new Mascota(especie,raza,colorPelo,sexo,alias,fechaNacimiento,codigo,clientes);
            mascota.setIdmascota(Integer.parseInt(jTextID.getText()));
        mascotaData.actualizarMascota(mascota);
        }
    }//GEN-LAST:event_jButton2actualizarActionPerformed

    private void jtaliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtaliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtaliasActionPerformed

    private void jButton1guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1guardarActionPerformed
       // TODO add your handling code here:
       String especie=jtespecie.getText();
        String raza=jtraza.getText();
        String colorPelo=jtcolorPelo.getText();
        String sexo=jtsexo.getText();
        String alias=jtalias.getText();
        LocalDate fechaNacimiento = LocalDate.parse(jtfechaNacimiento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int codigo=Integer.parseInt(jtcodigo.getText());
        String cliente=(jtidcliente.getText());
        Cliente clientito = null;
      ClienteData clientedata = new ClienteData(conexion);
        List <Cliente> lista = new ArrayList<>();
        List <Cliente> resultado = new ArrayList<>();
      lista = clientedata.obtenerCliente();
      for (Cliente a : lista){
          if (a.getNombreApellido().equals(cliente))
          resultado.add(a);
          
      }
        // christian
        Mascota mascotaprueba = new Mascota (); 
        mascotaprueba.setEspecie(especie);
    mascotaprueba.setRaza(raza);
    mascotaprueba.setColorPelo(colorPelo);
    mascotaprueba.setSexo(sexo);
    mascotaprueba.setAlias(alias);
    mascotaprueba.setCodigo(codigo);
    mascotaprueba.setcliente(resultado.get(0));
    
       mascotaprueba.setFechaNacimiento(fechaNacimiento);
        mascotaData.guardarMascota(mascotaprueba);
       
        jTextID.setText(mascotaprueba.getIdmascota()+"");
        
    
        
    }//GEN-LAST:event_jButton1guardarActionPerformed

    private void jButton4limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4limpiarActionPerformed
        // TODO add your handling code here:
    jTextID.setText("");
    jtespecie.setText("");
    jtraza.setText("");
    jtalias.setText("");
     jtcolorPelo.setText("");
    jtsexo.setText("");
    jtfechaNacimiento.setText("");
    jtcodigo.setText("");
    jtidcliente.setText("");
    }//GEN-LAST:event_jButton4limpiarActionPerformed

    private void jButton3borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3borrarActionPerformed
        // TODO add your handling code here:
        int idmascota=Integer.parseInt(jTextID.getText());
        mascotaData.borrarMascota(idmascota);
    }//GEN-LAST:event_jButton3borrarActionPerformed

    private void jButton5salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5salirActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH); 
    }//GEN-LAST:event_jButton5salirActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioMascotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1guardar;
    private javax.swing.JButton jButton2actualizar;
    private javax.swing.JButton jButton3borrar;
    private javax.swing.JButton jButton4limpiar;
    private javax.swing.JButton jButton5buscar;
    private javax.swing.JButton jButton5salir;
    private javax.swing.JButton jButton6listarmascota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextID;
    private javax.swing.JLabel jidCliente;
    private javax.swing.JTextField jtalias;
    private javax.swing.JTextField jtcodigo;
    private javax.swing.JTextField jtcolorPelo;
    private javax.swing.JTextField jtespecie;
    private javax.swing.JTextField jtfechaNacimiento;
    private javax.swing.JTextField jtidcliente;
    private javax.swing.JTextField jtraza;
    private javax.swing.JTextField jtsexo;
    // End of variables declaration//GEN-END:variables
}
