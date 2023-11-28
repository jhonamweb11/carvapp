/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import Carvapp.Conexion;
import Carvapp.Visitantes;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
/**
 *
 * @author Usuario
 */
public class AgregarVisitante extends javax.swing.JFrame {

    /**
     * Creates new form AgregarVisitante
     */
    public AgregarVisitante() {
            initComponents();
            this.setLocationRelativeTo(null);
            VisitanteID.setEnabled(false);
            setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/iconopeque.png")));
            
            
            
            Visitantes objetoVisitantes = new Visitantes();
            objetoVisitantes.mostrarVisitantes(tablaVisitantes);
            
            
            /*Conexion objetoconexion = new Conexion();
        objetoconexion.establecerConexion();*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelfondo = new javax.swing.JPanel();
        barraIz = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        nombreag = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        apellidotitle = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        TipoDocumentotitle = new javax.swing.JLabel();
        Documentotitle = new javax.swing.JLabel();
        Documento = new javax.swing.JTextField();
        Roltitle = new javax.swing.JLabel();
        TipoDocumento = new javax.swing.JComboBox<>();
        Rol = new javax.swing.JComboBox<>();
        mostrarVisitantes = new javax.swing.JScrollPane();
        tablaVisitantes = new javax.swing.JTable();
        eliminarBot = new javax.swing.JButton();
        agregarBot = new javax.swing.JButton();
        editarBot = new javax.swing.JButton();
        barraDer = new javax.swing.JPanel();
        IDtitle = new javax.swing.JLabel();
        VisitanteID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar");
        setIconImages(getIconImages());

        Panelfondo.setBackground(new java.awt.Color(255, 255, 255));
        Panelfondo.setName(""); // NOI18N
        Panelfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraIz.setBackground(new java.awt.Color(45, 168, 1));

        javax.swing.GroupLayout barraIzLayout = new javax.swing.GroupLayout(barraIz);
        barraIz.setLayout(barraIzLayout);
        barraIzLayout.setHorizontalGroup(
            barraIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        barraIzLayout.setVerticalGroup(
            barraIzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        Panelfondo.add(barraIz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 650));

        titulo1.setFont(new java.awt.Font("Comfortaa Medium", 0, 24)); // NOI18N
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("CARVApp Control de Acceso y Registro de Visitantes");
        Panelfondo.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 1050, 50));

        titulo2.setFont(new java.awt.Font("Comfortaa Medium", 0, 24)); // NOI18N
        titulo2.setText("Agregar Nuevo visitante");
        Panelfondo.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 310, 40));

        nombreag.setFont(new java.awt.Font("Comfortaa Medium", 0, 14)); // NOI18N
        nombreag.setText("Nombre:");
        Panelfondo.add(nombreag, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        Nombre.setBackground(new java.awt.Color(248, 248, 248));
        Nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        Panelfondo.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 460, 30));

        apellidotitle.setFont(new java.awt.Font("Comfortaa Medium", 0, 14)); // NOI18N
        apellidotitle.setText("Apellido:");
        Panelfondo.add(apellidotitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 210, -1));

        Apellido.setBackground(new java.awt.Color(248, 248, 248));
        Apellido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });
        Panelfondo.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 480, 30));

        TipoDocumentotitle.setFont(new java.awt.Font("Comfortaa Medium", 0, 14)); // NOI18N
        TipoDocumentotitle.setText("Tipo documento:");
        Panelfondo.add(TipoDocumentotitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        Documentotitle.setFont(new java.awt.Font("Comfortaa Medium", 0, 14)); // NOI18N
        Documentotitle.setText("Número de documento:");
        Panelfondo.add(Documentotitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        Documento.setBackground(new java.awt.Color(248, 248, 248));
        Documento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentoActionPerformed(evt);
            }
        });
        Panelfondo.add(Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 330, 30));

        Roltitle.setFont(new java.awt.Font("Comfortaa Medium", 0, 14)); // NOI18N
        Roltitle.setText("Rol:");
        Panelfondo.add(Roltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, -1, -1));

        TipoDocumento.setBackground(new java.awt.Color(248, 248, 248));
        TipoDocumento.setFont(new java.awt.Font("Comfortaa Medium", 0, 12)); // NOI18N
        TipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "TI", "CE" }));
        TipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoDocumentoActionPerformed(evt);
            }
        });
        Panelfondo.add(TipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 240, 30));

        Rol.setBackground(new java.awt.Color(248, 248, 248));
        Rol.setFont(new java.awt.Font("Comfortaa Medium", 0, 12)); // NOI18N
        Rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Visitante", "Profesor", "Administrativo" }));
        Panelfondo.add(Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 330, 30));

        tablaVisitantes.setFont(new java.awt.Font("Comfortaa Medium", 0, 14)); // NOI18N
        tablaVisitantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tablaVisitantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVisitantesMouseClicked(evt);
            }
        });
        mostrarVisitantes.setViewportView(tablaVisitantes);

        Panelfondo.add(mostrarVisitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 970, 250));

        eliminarBot.setBackground(new java.awt.Color(102, 0, 0));
        eliminarBot.setFont(new java.awt.Font("Comfortaa Medium", 0, 14)); // NOI18N
        eliminarBot.setForeground(new java.awt.Color(255, 255, 255));
        eliminarBot.setText("Eliminar");
        eliminarBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBotActionPerformed(evt);
            }
        });
        Panelfondo.add(eliminarBot, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 320, 140, 40));

        agregarBot.setBackground(new java.awt.Color(0, 7, 57));
        agregarBot.setFont(new java.awt.Font("Comfortaa Medium", 0, 14)); // NOI18N
        agregarBot.setForeground(new java.awt.Color(255, 255, 255));
        agregarBot.setText("Agregar");
        agregarBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBotActionPerformed(evt);
            }
        });
        Panelfondo.add(agregarBot, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 140, 40));

        editarBot.setBackground(new java.awt.Color(0, 153, 0));
        editarBot.setFont(new java.awt.Font("Comfortaa Medium", 0, 14)); // NOI18N
        editarBot.setForeground(new java.awt.Color(255, 255, 255));
        editarBot.setText("Editar");
        editarBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBotActionPerformed(evt);
            }
        });
        Panelfondo.add(editarBot, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 140, 40));

        barraDer.setBackground(new java.awt.Color(45, 168, 1));

        javax.swing.GroupLayout barraDerLayout = new javax.swing.GroupLayout(barraDer);
        barraDer.setLayout(barraDerLayout);
        barraDerLayout.setHorizontalGroup(
            barraDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        barraDerLayout.setVerticalGroup(
            barraDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        Panelfondo.add(barraDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, -1));

        IDtitle.setFont(new java.awt.Font("Comfortaa Medium", 0, 14)); // NOI18N
        IDtitle.setText("ID:");
        Panelfondo.add(IDtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 100, 80, -1));

        VisitanteID.setBackground(new java.awt.Color(248, 248, 248));
        VisitanteID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        VisitanteID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitanteIDActionPerformed(evt);
            }
        });
        Panelfondo.add(VisitanteID, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(Panelfondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(Panelfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 649, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoActionPerformed

    private void DocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocumentoActionPerformed

    private void TipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoDocumentoActionPerformed

    private void editarBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBotActionPerformed
        Visitantes objetoVisitantes = new Visitantes();
        
            objetoVisitantes.ModificarVsitantes(VisitanteID, Nombre, Apellido, TipoDocumento, Documento, Rol);
        
      objetoVisitantes.mostrarVisitantes(tablaVisitantes);
    }//GEN-LAST:event_editarBotActionPerformed

    private void agregarBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBotActionPerformed
     
       Visitantes objetoVisitantes = new Visitantes();
       objetoVisitantes.AgregarVisit(Nombre, Apellido, TipoDocumento, Documento, Rol);
      objetoVisitantes.mostrarVisitantes(tablaVisitantes);
          
        
    }//GEN-LAST:event_agregarBotActionPerformed

    private void VisitanteIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitanteIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VisitanteIDActionPerformed

    private void tablaVisitantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVisitantesMouseClicked
        Visitantes objetoVisitantes = new Visitantes();
       objetoVisitantes.Seleccionar(tablaVisitantes,VisitanteID,Nombre, Apellido, TipoDocumento, Documento, Rol);
    }//GEN-LAST:event_tablaVisitantesMouseClicked

    private void eliminarBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBotActionPerformed
      Visitantes objetoVisitantes = new Visitantes();
       objetoVisitantes.EliminarVisitantes(VisitanteID);
      objetoVisitantes.mostrarVisitantes(tablaVisitantes);
    }//GEN-LAST:event_eliminarBotActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarVisitante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Documento;
    private javax.swing.JLabel Documentotitle;
    private javax.swing.JLabel IDtitle;
    private javax.swing.JTextField Nombre;
    private javax.swing.JPanel Panelfondo;
    private javax.swing.JComboBox<String> Rol;
    private javax.swing.JLabel Roltitle;
    private javax.swing.JComboBox<String> TipoDocumento;
    private javax.swing.JLabel TipoDocumentotitle;
    private javax.swing.JTextField VisitanteID;
    private javax.swing.JButton agregarBot;
    private javax.swing.JLabel apellidotitle;
    private javax.swing.JPanel barraDer;
    private javax.swing.JPanel barraIz;
    private javax.swing.JButton editarBot;
    private javax.swing.JButton eliminarBot;
    private javax.swing.JScrollPane mostrarVisitantes;
    private javax.swing.JLabel nombreag;
    private javax.swing.JTable tablaVisitantes;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
