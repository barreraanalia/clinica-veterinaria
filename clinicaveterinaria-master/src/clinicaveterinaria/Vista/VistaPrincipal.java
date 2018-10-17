/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Vista;

/**
 *
 * @author Carlos
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
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

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemArchivo = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenu();
        jMenuClienteFormulario = new javax.swing.JMenuItem();
        jMenuMascota = new javax.swing.JMenu();
        jMenuMascotaFormulario = new javax.swing.JMenuItem();
        jMenuVisitas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuTratamiento = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Escritorio.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        jMenuArchivo.setText("Archivo");

        jMenuItemArchivo.setText("Salir");
        jMenuItemArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemArchivoActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemArchivo);

        jMenuBar1.add(jMenuArchivo);

        jMenuCliente.setText("Clientes");

        jMenuClienteFormulario.setText("Formulario");
        jMenuClienteFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClienteFormularioActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuClienteFormulario);

        jMenuBar1.add(jMenuCliente);

        jMenuMascota.setText("Mascotas");

        jMenuMascotaFormulario.setText("Formulario");
        jMenuMascotaFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMascotaFormularioActionPerformed(evt);
            }
        });
        jMenuMascota.add(jMenuMascotaFormulario);

        jMenuBar1.add(jMenuMascota);

        jMenuVisitas.setText("Visitas de Atencion");

        jMenuItem1.setText("Formulario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuVisitas.add(jMenuItem1);

        jMenuBar1.add(jMenuVisitas);

        jMenuTratamiento.setText("Tratamiento");
        jMenuBar1.add(jMenuTratamiento);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemArchivoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemArchivoActionPerformed

    private void jMenuClienteFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteFormularioActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioCliente fc = new FormularioCliente();
        fc.setVisible(true);
        Escritorio.add(fc);
        Escritorio.moveToFront(fc);
    }//GEN-LAST:event_jMenuClienteFormularioActionPerformed

    private void jMenuMascotaFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMascotaFormularioActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioMascota fm = new FormularioMascota();
        fm.setVisible(true);
        Escritorio.add(fm);
        Escritorio.moveToFront(fm);
    }//GEN-LAST:event_jMenuMascotaFormularioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         Escritorio.removeAll();
        Escritorio.repaint();
        FormularioVisitas fv = new FormularioVisitas();
        fv.setVisible(true);
        Escritorio.add(fv);
        Escritorio.moveToFront(fv);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenuItem jMenuClienteFormulario;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemArchivo;
    private javax.swing.JMenu jMenuMascota;
    private javax.swing.JMenuItem jMenuMascotaFormulario;
    private javax.swing.JMenu jMenuTratamiento;
    private javax.swing.JMenu jMenuVisitas;
    // End of variables declaration//GEN-END:variables
}
