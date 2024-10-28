
package grafica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Persona;
import logica.Tarea;
import logica.ListaDeTareas;


public class Principal extends javax.swing.JFrame {


    DefaultTableModel modelo= new DefaultTableModel();
    private ListaDeTareas listaDeTareas = ListaDeTareas.getInstancia();
            
    public Principal() {
        initComponents();
        this.setTitle("To Do List");
        this.setSize(900, 700);
        this.setLocationRelativeTo(null);
        
        modelo.addColumn("Tarea");
        modelo.addColumn("Prioridad");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        refrescarTabla();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaDeTareas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cboPrioridad = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVerDetalles1 = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRealizado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTablaDeTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tblTablaDeTareas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 325, 850, 275));

        jLabel1.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 150, -1));

        jLabel2.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        jLabel2.setText("Descripcion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 140, -1));

        jLabel3.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        jLabel3.setText("Prioridad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        jLabel4.setText("Direccion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 150, -1));

        btnBorrar.setBackground(new java.awt.Color(204, 204, 204));
        btnBorrar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnBorrar.setText("Borrar");
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 140, 40));

        jLabel6.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel6.setText("TO DO LIST");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        cboPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(cboPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(204, 204, 204));
        btnCerrar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 610, 140, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 300, 150));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Asignado a:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 150, -1));

        btnAgregar.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 140, 40));

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 140, 40));

        btnVerDetalles1.setBackground(new java.awt.Color(204, 204, 204));
        btnVerDetalles1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnVerDetalles1.setText("Ver Detalles");
        btnVerDetalles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDetalles1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerDetalles1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, 140, 40));

        btnEditar.setBackground(new java.awt.Color(204, 204, 204));
        btnEditar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, 140, 40));

        btnRealizado.setBackground(new java.awt.Color(204, 204, 204));
        btnRealizado.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnRealizado.setText("Realizado");
        btnRealizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRealizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 610, 140, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        try{      
        Tarea tarea = new Tarea();
        Persona persona = new Persona();
        
        tarea.setDescripcion(txtDescripcion.getText());
        int prioridad = Integer.parseInt((String) cboPrioridad.getSelectedItem()); 
        tarea.setPrioridad(prioridad);
        persona.setNombre(txtNombre.getText());
        tarea.setNombre(persona.getNombre());
        persona.setDireccion(txtDireccion.getText());
        tarea.setDireccion(persona.getDireccion());
        persona.setTelefono(txtTelefono.getText());
        tarea.setTelefono(persona.getTelefono());
        
        listaDeTareas.agregarTarea(tarea);
        JOptionPane.showMessageDialog(this,"Los datos se guardaron correctamente");
        
        refrescarTabla();
        }catch (NumberFormatException e){
            
           JOptionPane.showMessageDialog(this,"Error al Agregar Tarea");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVerDetalles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDetalles1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerDetalles1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRealizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRealizadoActionPerformed

    public void refrescarTabla(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0); //Borra todas los elementos de la tabla//
            
        }
        ArrayList<Tarea> listadoTareas = listaDeTareas.getListadoTareas();
        for (Tarea tarea : listadoTareas) {
            Object t[] = new Object[5];
            t[0] = tarea.getDescripcion();
            t[1] = tarea.getPrioridad();
            t[2] = tarea.getNombre();
            t[3] = tarea.getDireccion();
            t[4] = tarea.getTelefono();
            modelo.addRow(t);
        }

        tblTablaDeTareas.setModel(modelo);
    }
    
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRealizado;
    private javax.swing.JButton btnVerDetalles1;
    private javax.swing.JComboBox<String> cboPrioridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblTablaDeTareas;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
