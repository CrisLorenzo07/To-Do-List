package grafica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logica.Tarea;
import logica.ListaDeTareas;

public class DetalleTabla extends javax.swing.JFrame {

    private final DefaultTableModel modeloDetalles;
    private final ListaDeTareas listaDeTareas;

    public DetalleTabla(ListaDeTareas listaDeTareas) {
        initComponents();

        this.listaDeTareas = listaDeTareas;

        setTitle("Detalle de las Tareas");
        setSize(900, 700);
        setLocationRelativeTo(null);

        modeloDetalles = new DefaultTableModel();
        modeloDetalles.addColumn("Tarea");
        modeloDetalles.addColumn("Prioridad");
        modeloDetalles.addColumn("Nombre");
        modeloDetalles.addColumn("Dirección");
        modeloDetalles.addColumn("Teléfono");
        modeloDetalles.addColumn("Estado");

        cargaDeDatos();
        
        

        if (listaDeTareas.getListadoTareas().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "No hay tareas para mostrar",
                    "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalles = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new java.awt.CardLayout());

        tblDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tblDetalles);

        getContentPane().add(jScrollPane1, "card2");

        btnCerrar.setBackground(new java.awt.Color(204, 204, 204));
        btnCerrar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    public void refrescarTabla() {
        while (modeloDetalles.getRowCount() > 0) {
            modeloDetalles.removeRow(0);
        }
    }

    private void cargaDeDatos() {
        try {
        ArrayList<Tarea> listadoTareas = listaDeTareas.getListadoTareas();
        for (Tarea tarea : listadoTareas) {
            Object fila []  = new Object[6];
            fila[0] = tarea.getDescripcion();
            fila[1] = tarea.getPrioridad();
            fila[2] = tarea.getNombre();
            fila[3] = tarea.getDireccion();
            fila[4] = tarea.getTelefono();
            fila[5] = tarea.isRealizada() ? "Realizada" : "Pendiente";
            modeloDetalles.addRow(fila);
        }
        tblDetalles.setModel(modeloDetalles);
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar datos: " + e.getMessage());
    }
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
            java.util.logging.Logger.getLogger(DetalleTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            ListaDeTareas listaDeTareas = new ListaDeTareas(); 
            new DetalleTabla(listaDeTareas).setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDetalles;
    // End of variables declaration//GEN-END:variables
}
